package com.mdblog.mapper;

import com.mdblog.po.ArticleCollection;
import com.mdblog.po.ArticleCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleCollectionMapper {
    int countByExample(ArticleCollectionExample example);

    int deleteByExample(ArticleCollectionExample example);

    int deleteByPrimaryKey(Long acId);

    int insert(ArticleCollection record);

    int insertSelective(ArticleCollection record);

    List<ArticleCollection> selectByExample(ArticleCollectionExample example);

    ArticleCollection selectByPrimaryKey(Long acId);

    int updateByExampleSelective(@Param("record") ArticleCollection record, @Param("example") ArticleCollectionExample example);

    int updateByExample(@Param("record") ArticleCollection record, @Param("example") ArticleCollectionExample example);

    int updateByPrimaryKeySelective(ArticleCollection record);

    int updateByPrimaryKey(ArticleCollection record);
}