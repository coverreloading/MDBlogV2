package com.mdblog.mapper;

import com.mdblog.po.UserLike;
import com.mdblog.po.UserLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserLikeMapper {
    int countByExample(UserLikeExample example);

    int deleteByExample(UserLikeExample example);

    int deleteByPrimaryKey(Long ulId);

    int insert(UserLike record);

    int insertSelective(UserLike record);

    List<UserLike> selectByExample(UserLikeExample example);

    UserLike selectByPrimaryKey(Long ulId);

    int updateByExampleSelective(@Param("record") UserLike record, @Param("example") UserLikeExample example);

    int updateByExample(@Param("record") UserLike record, @Param("example") UserLikeExample example);

    int updateByPrimaryKeySelective(UserLike record);

    int updateByPrimaryKey(UserLike record);
}