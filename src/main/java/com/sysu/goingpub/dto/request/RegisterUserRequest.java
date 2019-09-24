package com.sysu.goingpub.dto.request;

import lombok.Data;

@Data
public class RegisterUserRequest extends BaseRequest {

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 省份
     */
    private String province;

    /**
     * 机构类型
     */
    private String companyType;

    /**
     * 机构名称
     */
    private String companyName;

    /**
     * 其他
     */
    private String otherImformation;

    /**
     * 部门
     */
    private String department;

    /**
     * 地址
     */
    private String address;

    /**
     * 邮政编码
     */
    private Integer addressNumber;

    /**
     * 手机号
     */
    private Long phone;

    /**
     * 近期是否需求
     */
    private String need;
}
