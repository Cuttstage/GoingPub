package com.sysu.goingpub.interceptor;

import com.sysu.goingpub.dao.LoginTicketMapper;
import com.sysu.goingpub.dao.UserMapper;
import com.sysu.goingpub.model.*;
import org.apache.commons.collections.SetUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TicketInterceptor implements HandlerInterceptor {

    @Autowired
    LoginTicketMapper loginTicketMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    HostHolder hostHolder;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String ticket = null;
        Cookie cookies[] = request.getCookies();
        if(CollectionUtils.isEmpty(Arrays.asList(cookies))){
            for( Cookie cookie : cookies ){
                if( cookie.getName() == "ticket" ){
                    ticket = cookie.getValue();
                }
            }
        }
        if( ticket != null ){
            LoginTicketExample loginTicketExample = new LoginTicketExample();
            loginTicketExample.createCriteria().andTicketEqualTo(ticket);
            List<LoginTicket> loginTickets = loginTicketMapper.selectByExample(loginTicketExample);
            if(CollectionUtils.isEmpty(loginTickets) || loginTickets.get(0).getStatus() == 1
                    || loginTickets.get(0).getExpired().before(new Date())){
                return true;
            }

            UserExample userExample = new UserExample();
            userExample.createCriteria().andIdEqualTo(loginTickets.get(0).getUserId());
            List<User> users = userMapper.selectByExample(userExample);
            if(!CollectionUtils.isEmpty(users)){
                hostHolder.setUser(users.get(0));
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        hostHolder.clear();
    }
}
