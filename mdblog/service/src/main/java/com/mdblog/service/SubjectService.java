package com.mdblog.service;

import com.mdblog.po.ResponResult;
import com.mdblog.po.Subject;

/**
 * Created by Vincent on 16/10/30.
 */
public interface SubjectService {
    ResponResult getSubject();
    Subject getSubjectById(Integer SubId);
}
