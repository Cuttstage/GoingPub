package com.sysu.goingpub.service.login.Impl;

import com.sysu.goingpub.dao.LoginTicketMapper;
import com.sysu.goingpub.dao.UserMapper;
import com.sysu.goingpub.dto.request.LoginUserRequest;
import com.sysu.goingpub.dto.request.RegisterUserRequest;
import com.sysu.goingpub.exception.BusinessException;
import com.sysu.goingpub.model.*;
import com.sysu.goingpub.model.LoginTicketExample;
import com.sysu.goingpub.model.UserExample;
import com.sysu.goingpub.service.login.UserService;
import com.vip.vjtools.vjkit.mapper.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import static com.sysu.goingpub.exception.enums.code.BaseExceptionCode.*;
import static com.sysu.goingpub.utils.CommonUtil.MD5;
import static com.sysu.goingpub.utils.CommonUtil.checkEmail;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    HostHolder hostHolder;

    @Autowired
    LoginTicketMapper loginTicketMapper;

    @Autowired
    UserMapper userMapper;

    @Override
    public String register(RegisterUserRequest request) {
        User user = BeanMapper.map(request, User.class);
        String ticket;
        if(StringUtils.isEmpty(user.getEmail())){
            throw new BusinessException(EMAIL_BLANK.code, EMAIL_BLANK.msg);
        }
        if(existUser(user.getEmail())){
            throw new BusinessException(USER_EXIST.code, USER_EXIST.msg);
        }else {
            user.setSalt(UUID.randomUUID().toString().substring(0, 5));
            user.setPassword(MD5(user.getPassword() + user.getSalt()));
            Integer userId = userMapper.insert(user);
            ticket = addLoginTicket(userId);
        }
        return ticket;
    }

    @Override
    public String login(LoginUserRequest request) {
        if(StringUtils.isEmpty(request.getEmail())){
            throw new BusinessException(EMAIL_BLANK.code, EMAIL_BLANK.code);
        }
        if(!existUser(request.getEmail())){
            throw new BusinessException(USER_NOT_EXIST.code, USER_NOT_EXIST.msg);
        }
        UserExample userExample = new UserExample();
        userExample.createCriteria().andEmailEqualTo(request.getEmail());
        User user = userMapper.selectByExample(userExample).get(0);

        String ticket;
        if(!MD5(request.getPassword()+user.getSalt()).equals(user.getPassword())){
            throw new BusinessException(WRONG_PASSWORD.code, WRONG_PASSWORD.msg);
        }else {
            ticket = addLoginTicket(user.getId());
        }
        return ticket;
    }

    @Override
    public void logout(String ticket) {
        LoginTicketExample loginTicketExample = new LoginTicketExample();
        loginTicketExample.createCriteria().andTicketEqualTo(ticket);
        List<LoginTicket> list = loginTicketMapper.selectByExample(loginTicketExample);
        if(CollectionUtils.isEmpty(list)){
            return;
        }else {
            LoginTicket loginTicket = list.get(0);
            loginTicket.setStatus(1);
            loginTicketMapper.updateByPrimaryKey(loginTicket);
        }
    }

    /**
     * 增加tocken
     * @param userId
     * @return
     */
    private String addLoginTicket(Integer userId){
        LoginTicket ticket = new LoginTicket();
        ticket.setUserId(userId);
        Date nowDate = new Date();
        nowDate.setTime(60*60*1000 + nowDate.getTime());
        ticket.setExpired(nowDate);
        ticket.setStatus(0);
        // UUID生成的随机ticket有"_"，要替换掉
        ticket.setTicket(UUID.randomUUID().toString().replaceAll("_",""));
        loginTicketMapper.insert(ticket);
        return ticket.getTicket();
    }

    /**
     * 判断是否存在用户，用户名为电子邮箱
     * @param email
     * @return
     */
    private Boolean existUser(String email){
        UserExample example = new UserExample();
        if(!checkEmail(email)){
            throw new BusinessException(EMAIL_ERROR.code, EMAIL_ERROR.msg);
        }
        example.createCriteria().andEmailEqualTo(email);
        List<User> users = userMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(users)){
            return false;
        }else {
            return true;
        }
    }
}
