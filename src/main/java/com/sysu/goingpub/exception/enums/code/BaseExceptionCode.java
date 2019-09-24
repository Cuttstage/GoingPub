package com.sysu.goingpub.exception.enums.code;

/**
 * 平台错误码
 */
public enum BaseExceptionCode {

    SUCCESS("0", "请求成功"),
    PARAM_ERROR("3", "参数校验失败【{0}】"),
    ERROR("999", "请求失败"),
    EMAIL_ERROR("100", "邮箱不匹配"),
    EMAIL_BLANK("101", "邮箱不能为空"),
    USER_EXIST("102", "用户已经存在"),
    USER_NOT_EXIST("103", "用户不存在"),
    WRONG_PASSWORD("104", "密码错误"),
    NOT_LOGIN("105", "没有登陆"),
    WRONG_ISSN_NUMBER("106", "错误的论文标题"),
    ;

    public String code;

    public String msg;

    BaseExceptionCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}

