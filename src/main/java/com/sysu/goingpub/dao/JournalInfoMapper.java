package com.sysu.goingpub.dao;

import com.sysu.goingpub.model.JournalInfo;
import com.sysu.goingpub.model.JournalInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface JournalInfoMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(JournalInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(JournalInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int insert(JournalInfo record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(JournalInfo record);

    /**
     *
     * @mbg.generated
     */
    List<JournalInfo> selectByExample(JournalInfoExample example);

    /**
     *
     * @mbg.generated
     */
    JournalInfo selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") JournalInfo record, @Param("example") JournalInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") JournalInfo record, @Param("example") JournalInfoExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(JournalInfo record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(JournalInfo record);
}