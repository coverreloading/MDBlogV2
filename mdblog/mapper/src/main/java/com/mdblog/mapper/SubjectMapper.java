package com.mdblog.mapper;

import com.mdblog.po.Subject;
import com.mdblog.po.SubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectMapper {
    int countByExample(SubjectExample example);

    int deleteByExample(SubjectExample example);

    int deleteByPrimaryKey(Long sId);

    int insert(Subject record);

    int insertSelective(Subject record);

    List<Subject> selectByExample(SubjectExample example);

    Subject selectByPrimaryKey(Long sId);

    int updateByExampleSelective(@Param("record") Subject record, @Param("example") SubjectExample example);

    int updateByExample(@Param("record") Subject record, @Param("example") SubjectExample example);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);
    // 自定义方法

    List<Subject> selectAll();

    // 随机取条数
    List<Subject> selectRand(@Param("num") Integer num);

    // 分页
    List<Subject> selectLimit(@Param("page") Integer page, @Param("num") Integer num);

    // 计数
    int getCount();
}