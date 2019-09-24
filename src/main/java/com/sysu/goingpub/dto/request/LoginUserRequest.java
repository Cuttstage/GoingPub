package com.sysu.goingpub.dto.request;

import lombok.Data;

@Data
public class LoginUserRequest extends BaseRequest {

    private String email;

    private String password;
}
