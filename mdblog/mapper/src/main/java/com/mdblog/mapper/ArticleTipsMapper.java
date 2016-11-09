package com.mdblog.mapper;

import com.mdblog.po.ArticleTips;
import com.mdblog.po.ArticleTipsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleTipsMapper {
    int countByExample(ArticleTipsExample example);

    int deleteByExample(ArticleTipsExample example);

    int deleteByPrimaryKey(Long atId);

    int insert(ArticleTips record);

    int insertSelective(ArticleTips record);

    List<ArticleTips> selectByExample(ArticleTipsExample example);

    ArticleTips selectByPrimaryKey(Long atId);

    int updateByExampleSelective(@Param("record") ArticleTips record, @Param("example") ArticleTipsExample example);

    int updateByExample(@Param("record") ArticleTips record, @Param("example") ArticleTipsExample example);

    int updateByPrimaryKeySelective(ArticleTips record);

    int updateByPrimaryKey(ArticleTips record);
}