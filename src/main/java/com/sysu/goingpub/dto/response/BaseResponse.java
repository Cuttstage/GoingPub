package com.sysu.goingpub.dto.response;


import com.sysu.goingpub.exception.enums.code.BaseExceptionCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class BaseResponse<T> implements Serializable {

    private static final long serialVersionUID = 6272948440384903418L;

    private String code;

    private String msg;

    private T data;

    public BaseResponse() {
        this.setCode(BaseExceptionCode.SUCCESS.code);
        this.setMsg(BaseExceptionCode.SUCCESS.msg);
    }

    public BaseResponse(T data) {
        this.setCode(BaseExceptionCode.SUCCESS.code);
        this.setMsg(BaseExceptionCode.SUCCESS.msg);
        this.setData(data);
    }

}
