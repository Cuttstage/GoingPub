package com.sysu.goingpub.dto.request;

import com.sysu.goingpub.utils.ApiParamCheckUtil;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by 000176 on 2018/8/2.
 */
@Getter
@Setter
public class BaseRequest implements Serializable {
    private static final long serialVersionUID = -2543656985025568425L;
    //调用方IP地址
    private String fromIp;

    //调用方系统名称
    private String fromUser;

    private String businessType;

    private String userName;

    /**
     * 是否是测试mock
     */
    private Boolean mock = false;

    public String check() {
        return ApiParamCheckUtil.checkParam(this);
    }

}

