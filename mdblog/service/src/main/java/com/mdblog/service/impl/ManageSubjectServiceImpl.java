package com.mdblog.service.impl;

import com.mdblog.service.ManageSubjectService;
import com.mdblog.po.JedisClient;
import com.mdblog.po.ResponResult;
import com.mdblog.common.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.mdblog.mapper.SubjectMapper;
import com.mdblog.po.Subject;
import com.mdblog.service.SubjectService;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Vincent on 16/10/29.
 */
@Service("ManageSubjectService")
public class ManageSubjectServiceImpl implements ManageSubjectService {

    @Autowired
    private SubjectMapper subjectMapper;
    @Autowired
    private JedisClient jedisClient;
    // 用户session在redis中保存的key
    @Value("${SUBJECT_ITEM}")
    String SUBJECT_ITEM;
    @Value("${SUBJECT_ITEM_Name}")
    String SUBJECT_ITEM_Name;
    @Value("${SUBJECT_ITEM_Hash}")
    String SUBJECT_ITEM_Hash;


    @Override
    public void addSubject(Subject subject) {
        //try {
        //    subject.setsTitle(new String(subject.getsTitle().getBytes("iso8859-1"),"utf-8"));
        //    subject.setsDesc(new String(subject.getsDesc().getBytes("iso8859-1"),"utf-8"));
        //} catch (UnsupportedEncodingException e) {
        //    e.printStackTrace();
        //}
        subject.setsDel(0);
        subject.setsCreatetime(System.currentTimeMillis());
        subjectMapper.insert(subject);
    }

    /**
     * 存入redis
     * @return
     */
    @Override
    public ResponResult setSubjectRedis() {
        List<Subject> subjectList = subjectMapper.selectAll();
        // 存入所有项目
        jedisClient.set(SUBJECT_ITEM, JsonUtils.objectToJson(subjectList));

        Subject subject = new Subject();
        Iterator ite=subjectList.iterator();
        while (ite.hasNext()){
            subject= (Subject) ite.next();

            // 将每个专题单独存入redis, 然后只留下id和名称
            jedisClient.hset(SUBJECT_ITEM_Hash, String.valueOf(subject.getsId()),JsonUtils.objectToJson(subject));

            subject.setsPic(null);
            subject.setsCreatetime(null);
            subject.setsDesc(null);
        }
        // 存入所有项目,不包含多余数据,方便一次性取出所有id和名称
        jedisClient.set(SUBJECT_ITEM_Name, JsonUtils.objectToJson(subjectList));
        return ResponResult.ok();
    }

    @Override
    public List getTable(Integer page, Integer rows) {

        String str = jedisClient.get(SUBJECT_ITEM);
        List<Subject> list = JsonUtils.jsonToList(str, Subject.class);

        //Subject subject = new Subject();
        //Iterator ite=list.iterator();
        //while (ite.hasNext()){
        //    subject= (Subject) ite.next();
        //
        //}

        //System.out.println(str);
        return list;
    }

}
