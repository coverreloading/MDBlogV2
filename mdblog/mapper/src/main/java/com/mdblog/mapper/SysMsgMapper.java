package com.mdblog.mapper;

import com.mdblog.po.SysMsg;
import com.mdblog.po.SysMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysMsgMapper {
    int countByExample(SysMsgExample example);

    int deleteByExample(SysMsgExample example);

    int deleteByPrimaryKey(Long sysMsgId);

    int insert(SysMsg record);

    int insertSelective(SysMsg record);

    List<SysMsg> selectByExampleWithBLOBs(SysMsgExample example);

    List<SysMsg> selectByExample(SysMsgExample example);

    SysMsg selectByPrimaryKey(Long sysMsgId);

    int updateByExampleSelective(@Param("record") SysMsg record, @Param("example") SysMsgExample example);

    int updateByExampleWithBLOBs(@Param("record") SysMsg record, @Param("example") SysMsgExample example);

    int updateByExample(@Param("record") SysMsg record, @Param("example") SysMsgExample example);

    int updateByPrimaryKeySelective(SysMsg record);

    int updateByPrimaryKeyWithBLOBs(SysMsg record);

    int updateByPrimaryKey(SysMsg record);

    //--------------------------------自定义方法-------------------------------------

    //分页
    List<SysMsg> selectLimit(@Param("offset") int offset, @Param("limit") int limit);

    int totalCout();
}