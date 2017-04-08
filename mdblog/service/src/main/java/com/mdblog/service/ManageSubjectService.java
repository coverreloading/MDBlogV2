package com.mdblog.service;

import com.mdblog.po.ResponResult;
import com.mdblog.po.Subject;

import java.util.List;

/**
 * Created by Vincent on 16/10/29.
 */
public interface ManageSubjectService {
    // 添加专题
    void addSubject(Subject subject);
    // 更新专题
    void updateSubject(Subject subject);
    // 将所有专题存入redis中，更新缓存
    ResponResult setSubjectRedis();
    // 分页获取专题列表
    List getTable(Integer offset, Integer limit);
    // 分页计数
    Integer getCount();
    // 删除专题
    ResponResult del(Long sId);
}
