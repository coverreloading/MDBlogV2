package com.mdblog.service;

import com.mdblog.po.ResponResult;
import com.mdblog.po.Subject;

/**
 * Created by Vincent on 16/10/30.
 */
public interface SubjectService {
    // 获取只包含id和名称的专题对象集合
    ResponResult getSubject();
    // 根据id从redis中获取专题对象
    Subject getSubjectById(long SubId);
    // 随机获取一定数量专题
    ResponResult getSubjectRand(Integer num);
}
