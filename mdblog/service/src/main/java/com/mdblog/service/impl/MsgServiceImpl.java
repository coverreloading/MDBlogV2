package com.mdblog.service.impl;

import com.mdblog.mapper.SysMsgMapper;
import com.mdblog.mapper.UserMsgMiddleMapper;
import com.mdblog.po.JedisClient;
import com.mdblog.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/4/8.15:57.
 */
@Service("MsgServiceImpl")
public class MsgServiceImpl implements MsgService{

    @Autowired
    SysMsgMapper sysMsgMapper;
    @Autowired
    UserMsgMiddleMapper userMsgMiddleMapper;
    @Autowired
    JedisClient jedisClient;

}
