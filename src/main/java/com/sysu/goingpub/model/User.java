package com.sysu.goingpub.model;

public class User {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * salt
     */
    private String salt;

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

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 电子邮件
     * @return email 电子邮件
     */
    public String getEmail() {
        return email;
    }

    /**
     * 电子邮件
     * @param email 电子邮件
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 密码
     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * salt
     * @return salt salt
     */
    public String getSalt() {
        return salt;
    }

    /**
     * salt
     * @param salt salt
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * 真实姓名
     * @return real_name 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 真实姓名
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 昵称
     * @return nick_name 昵称
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 昵称
     * @param nickName 昵称
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * 省份
     * @return province 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省份
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 机构类型
     * @return company_type 机构类型
     */
    public String getCompanyType() {
        return companyType;
    }

    /**
     * 机构类型
     * @param companyType 机构类型
     */
    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    /**
     * 机构名称
     * @return company_name 机构名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 机构名称
     * @param companyName 机构名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 其他
     * @return other_imformation 其他
     */
    public String getOtherImformation() {
        return otherImformation;
    }

    /**
     * 其他
     * @param otherImformation 其他
     */
    public void setOtherImformation(String otherImformation) {
        this.otherImformation = otherImformation == null ? null : otherImformation.trim();
    }

    /**
     * 部门
     * @return department 部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 部门
     * @param department 部门
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * 地址
     * @return address 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 邮政编码
     * @return address_number 邮政编码
     */
    public Integer getAddressNumber() {
        return addressNumber;
    }

    /**
     * 邮政编码
     * @param addressNumber 邮政编码
     */
    public void setAddressNumber(Integer addressNumber) {
        this.addressNumber = addressNumber;
    }

    /**
     * 手机号
     * @return phone 手机号
     */
    public Long getPhone() {
        return phone;
    }

    /**
     * 手机号
     * @param phone 手机号
     */
    public void setPhone(Long phone) {
        this.phone = phone;
    }

    /**
     * 近期是否需求
     * @return need 近期是否需求
     */
    public String getNeed() {
        return need;
    }

    /**
     * 近期是否需求
     * @param need 近期是否需求
     */
    public void setNeed(String need) {
        this.need = need == null ? null : need.trim();
    }
}