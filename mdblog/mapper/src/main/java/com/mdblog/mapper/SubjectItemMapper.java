package com.mdblog.mapper;

import com.mdblog.po.SubjectItem;
import com.mdblog.po.SubjectItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectItemMapper {
    int countByExample(SubjectItemExample example);

    int deleteByExample(SubjectItemExample example);

    int deleteByPrimaryKey(Long siId);

    int insert(SubjectItem record);

    int insertSelective(SubjectItem record);

    List<SubjectItem> selectByExample(SubjectItemExample example);

    SubjectItem selectByPrimaryKey(Long siId);

    int updateByExampleSelective(@Param("record") SubjectItem record, @Param("example") SubjectItemExample example);

    int updateByExample(@Param("record") SubjectItem record, @Param("example") SubjectItemExample example);

    int updateByPrimaryKeySelective(SubjectItem record);

    int updateByPrimaryKey(SubjectItem record);
}