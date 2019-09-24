package com.sysu.goingpub.dao;

import com.sysu.goingpub.model.Journal;
import com.sysu.goingpub.model.JournalExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface JournalMapper {
    /**
     *
     * @mbg.generated
     */
    long countByExample(JournalExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByExample(JournalExample example);

    /**
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int insert(Journal record);

    /**
     *
     * @mbg.generated
     */
    int insertSelective(Journal record);

    /**
     *
     * @mbg.generated
     */
    List<Journal> selectByExample(JournalExample example);

    /**
     *
     * @mbg.generated
     */
    Journal selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Journal record, @Param("example") JournalExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Journal record, @Param("example") JournalExample example);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Journal record);

    /**
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Journal record);
}