package com.mdblog.mapper;

import com.mdblog.po.Comments;
import com.mdblog.po.CommentsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentsMapper {
    int countByExample(CommentsExample example);

    int deleteByExample(CommentsExample example);

    int deleteByPrimaryKey(Long cId);

    int insert(Comments record);

    int insertSelective(Comments record);

    List<Comments> selectByExample(CommentsExample example);

    Comments selectByPrimaryKey(Long cId);

    int updateByExampleSelective(@Param("record") Comments record, @Param("example") CommentsExample example);

    int updateByExample(@Param("record") Comments record, @Param("example") CommentsExample example);

    int updateByPrimaryKeySelective(Comments record);

    int updateByPrimaryKey(Comments record);

    // 自定义方法
    List<Comments> selectParentByRaid(@Param("raId") Long raId, @Param("page") Long page, @Param("num") Long num);

    List<Comments> selectChildByParentId(@Param("pId") Long pId, @Param("page") Long page, @Param("num") Long num);
}