package com.sysu.goingpub.dao;

import com.sysu.goingpub.model.LoginTicket;
import com.sysu.goingpub.model.LoginTicketExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginTicketMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(LoginTicketExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(LoginTicketExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int insert(LoginTicket record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(LoginTicket record);

    /**
     *
     * @mbg.generated
     */
    List<LoginTicket> selectByExample(LoginTicketExample example);

    /**
     *
     * @mbg.generated
     */
    LoginTicket selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") LoginTicket record, @Param("example") LoginTicketExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") LoginTicket record, @Param("example") LoginTicketExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LoginTicket record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LoginTicket record);
}