package com.mdblog.mapper;

import com.mdblog.po.UserMsgMiddle;
import com.mdblog.po.UserMsgMiddleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMsgMiddleMapper {
    int countByExample(UserMsgMiddleExample example);

    int deleteByExample(UserMsgMiddleExample example);

    int deleteByPrimaryKey(Long ummId);

    int insert(UserMsgMiddle record);

    int insertSelective(UserMsgMiddle record);

    List<UserMsgMiddle> selectByExample(UserMsgMiddleExample example);

    UserMsgMiddle selectByPrimaryKey(Long ummId);

    int updateByExampleSelective(@Param("record") UserMsgMiddle record, @Param("example") UserMsgMiddleExample example);

    int updateByExample(@Param("record") UserMsgMiddle record, @Param("example") UserMsgMiddleExample example);

    int updateByPrimaryKeySelective(UserMsgMiddle record);

    int updateByPrimaryKey(UserMsgMiddle record);
}