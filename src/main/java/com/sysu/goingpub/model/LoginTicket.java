package com.sysu.goingpub.model;

import java.util.Date;

public class LoginTicket {
    /**
     * 
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 过期时间
     */
    private Date expired;

    /**
     * 0为有效 1为无效
     */
    private Integer status;

    /**
     * 对应的token
     */
    private String ticket;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户id
     * @return user_id 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 过期时间
     * @return expired 过期时间
     */
    public Date getExpired() {
        return expired;
    }

    /**
     * 过期时间
     * @param expired 过期时间
     */
    public void setExpired(Date expired) {
        this.expired = expired;
    }

    /**
     * 0为有效 1为无效
     * @return status 0为有效 1为无效
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 0为有效 1为无效
     * @param status 0为有效 1为无效
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 对应的token
     * @return ticket 对应的token
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * 对应的token
     * @param ticket 对应的token
     */
    public void setTicket(String ticket) {
        this.ticket = ticket == null ? null : ticket.trim();
    }
}