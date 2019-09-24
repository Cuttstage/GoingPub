package com.sysu.goingpub.exception;

import java.text.MessageFormat;
import java.util.Date;

public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private  String code;
    private  String message;

    public String getCode() {
        return this.code;
    }

    public String getMsg(){
        return this.message;
    }

    public BusinessException(String code, String formatMessage, Object... args) {
        this.code = code;
        this.message = MessageFormat.format(formatMessage, args);
    }

    public BusinessException() {
        super();
    }

    public BusinessException(String message){
        super(message);
    }

    public BusinessException(String code, String message){
        this.code = code;
        this.message = message;
    }

}
