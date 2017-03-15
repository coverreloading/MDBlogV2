package com.mdblog.service;

import com.mdblog.po.ResponResult;
import com.mdblog.po.Subject;

import java.util.List;

/**
 * Created by Vincent on 16/10/29.
 */
public interface ManageSubjectService {
    void addSubject(Subject subject);
    void updateSubject(Subject subject);
    ResponResult setSubjectRedis();
    List getTable(Integer offset, Integer limit);
    Integer getCount();
    ResponResult del(Long sId);
}
