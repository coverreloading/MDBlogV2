package com.mdblog.mapper;

import com.mdblog.po.ReleaseArticle;
import com.mdblog.po.ReleaseArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReleaseArticleMapper {
    int countByExample(ReleaseArticleExample example);

    int deleteByExample(ReleaseArticleExample example);

    int deleteByPrimaryKey(Long raId);

    int insert(ReleaseArticle record);

    int insertSelective(ReleaseArticle record);

    List<ReleaseArticle> selectByExampleWithBLOBs(ReleaseArticleExample example);

    List<ReleaseArticle> selectByExample(ReleaseArticleExample example);

    ReleaseArticle selectByPrimaryKey(Long raId);

    ReleaseArticle selectByPrimaryKeyWithBLOBs(Long raId);

    int updateByExampleSelective(@Param("record") ReleaseArticle record, @Param("example") ReleaseArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") ReleaseArticle record, @Param("example") ReleaseArticleExample example);

    int updateByExample(@Param("record") ReleaseArticle record, @Param("example") ReleaseArticleExample example);

    int updateByPrimaryKeySelective(ReleaseArticle record);

    int updateByPrimaryKeyWithBLOBs(ReleaseArticle record);

    int updateByPrimaryKey(ReleaseArticle record);

    //自定义方法
    int insertAndGetId(ReleaseArticle record);
    // 获取文本内容
    ReleaseArticle selectContentByPrimaryKey(Long raId);

    // 获取全部id
    List<Long> selectIdList();

    // 更新read like
    int updateReadLikeByPrimaryKey(@Param("id") Long id, @Param("read") Long read, @Param("like") Long like);

    // 首页获取热门文章
    List<ReleaseArticle> selectHot(@Param("page") int page, @Param("num") int num);

    // 获取指定用户文章
    List<ReleaseArticle> selectHotByUid(@Param("uid")Long uid, @Param("page") Long page, @Param("num") Long num);
}