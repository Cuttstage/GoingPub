package com.sysu.goingpub.service.login;

import com.sysu.goingpub.dto.request.LoginUserRequest;
import com.sysu.goingpub.dto.request.RegisterUserRequest;

/**
 * 关于用户注册登陆模块
 */
public interface UserService {

    /**
     * 用户注册
     * @param request
     * @return
     */
    public String register(RegisterUserRequest request);

    /**
     * 用户登陆
     * @param request
     * @return
     */
    public String login(LoginUserRequest request);

    /**
     * 用户登出
     */
    public void logout(String ticket);

}
