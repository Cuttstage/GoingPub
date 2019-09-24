package com.sysu.goingpub.controller;

import com.sysu.goingpub.dto.request.LoginUserRequest;
import com.sysu.goingpub.dto.request.RegisterUserRequest;
import com.sysu.goingpub.dto.response.BaseResponse;
import com.sysu.goingpub.exception.BusinessException;
import com.sysu.goingpub.exception.enums.code.BaseExceptionCode;
import com.sysu.goingpub.service.login.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
@RequestMapping(value = "/v1/user/common")
public class LoginRegisterController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResponse<String> login(@RequestBody LoginUserRequest request, HttpServletResponse response){
        BaseResponse<String> baseResponse = new BaseResponse<>();
        String ticket = null;
        try{
            ticket = userService.login(request);
            baseResponse.setData(ticket);
            log.info(request.getEmail()+"登陆成功");
        }catch (BusinessException e){
            log.error(request.getEmail() + "登陆失败");
            baseResponse.setCode(e.getCode());
            baseResponse.setMsg(e.getMsg());
        }
        Cookie cookie = new Cookie("ticket", ticket);
        response.addCookie(cookie);
        return baseResponse;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public BaseResponse<String> register(@RequestBody RegisterUserRequest request, HttpServletResponse response){
        BaseResponse<String> baseResponse = new BaseResponse<>();
        String ticket = null;
        try{
            ticket = userService.register(request);
        }catch (BusinessException e){
            log.error("注册失败：" + e.getMsg());
            baseResponse.setCode(e.getCode());
            baseResponse.setMsg(e.getMsg());
        }
        Cookie cookie = new Cookie("ticket", ticket);
        response.addCookie(cookie);
        return baseResponse;
    }

    @RequestMapping(value = "/logout")
    public void logout(@CookieValue("ticket") String ticket){
        userService.logout(ticket);
    }

    @RequestMapping(value = "/relogin")
    public BaseResponse<String> relogin(){
        BaseResponse<String> response = new BaseResponse<>();
        response.setCode(BaseExceptionCode.NOT_LOGIN.code);
        response.setMsg(BaseExceptionCode.NOT_LOGIN.msg);
        return response;
    }
}
