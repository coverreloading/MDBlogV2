package com.mdblog.service.impl;

import com.mdblog.po.JedisClient;
import com.mdblog.po.ResponResult;
import com.mdblog.po.Subject;
import com.mdblog.service.SubjectService;
import com.mdblog.common.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Vincent on 16/10/30.
 */
@Service("SubjectService")
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private JedisClient jedisClient;
    @Value("${SUBJECT_ITEM_Name}")
    String SUBJECT_ITEM_Name;

    @Override
    public ResponResult getSubject() {

        String str = jedisClient.get(SUBJECT_ITEM_Name);
        List<Subject> list = JsonUtils.jsonToList(str, Subject.class);
        return ResponResult.ok(list);
    }
}
