package com.mdblog.mapper;

import com.mdblog.po.Newsletter;
import com.mdblog.po.NewsletterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsletterMapper {
    int countByExample(NewsletterExample example);

    int deleteByExample(NewsletterExample example);

    int deleteByPrimaryKey(Long nlId);

    int insert(Newsletter record);

    int insertSelective(Newsletter record);

    List<Newsletter> selectByExample(NewsletterExample example);

    Newsletter selectByPrimaryKey(Long nlId);

    int updateByExampleSelective(@Param("record") Newsletter record, @Param("example") NewsletterExample example);

    int updateByExample(@Param("record") Newsletter record, @Param("example") NewsletterExample example);

    int updateByPrimaryKeySelective(Newsletter record);

    int updateByPrimaryKey(Newsletter record);
}