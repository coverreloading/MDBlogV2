package com.mdblog.service.impl;

import com.alibaba.fastjson.JSON;
import com.mdblog.common.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mdblog.mapper.SysMsgMapper;
import com.mdblog.po.JedisClient;
import com.mdblog.po.ResponResult;
import com.mdblog.po.SysMsg;
import com.mdblog.service.ManageMsgService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/4/8.15:59.
 */
@Service("ManageMsgServiceImpl")
public class ManageMsgServiceImpl implements ManageMsgService {
    @Autowired
    SysMsgMapper sysMsgMapper;
    @Autowired
    JedisClient jedisClient;
    @Value("${SYSMSG}")
    String SYSMSG;

    @Override
    public ResponResult activeMsg(long id) {
        SysMsg sysMsg = sysMsgMapper.selectByPrimaryKey(id);
        if (sysMsg == null) {
            return ResponResult.build(400, "no such msg");
        }
        jedisClient.set(SYSMSG, JsonUtils.objectToJson(sysMsg));
        return ResponResult.ok();
    }

    @Override
    public ResponResult addMsg(SysMsg sysMsg) {
        sysMsg.setSysMsgCreatetime(System.currentTimeMillis());
        sysMsg.setSysMsgDel(0);
        sysMsg.setSysMsgUid(Long.valueOf(10086));
        try {
            sysMsgMapper.insert(sysMsg);
            return ResponResult.ok();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponResult.build(400, "no content");
        }
    }

    @Override
    public ResponResult deleteMsg(long id) {
        if (sysMsgMapper.selectByPrimaryKey(id) == null) {
            return ResponResult.build(400, "no record ,maybe had been deleted");
        } else {
            try {
                sysMsgMapper.deleteByPrimaryKey(id);
                jedisClient.del(SYSMSG);
                return ResponResult.ok();
            } catch (Exception e) {
                e.printStackTrace();
                return ResponResult.build(500, "booooom!");
            }
        }
    }

    @Override
    public Map getTable(int offset, int limit) {
        Map map = new HashMap();
        System.out.println(JSON.toJSON(sysMsgMapper.selectLimit(0, 5)));
        map.put("rows", sysMsgMapper.selectLimit(offset, limit));
        map.put("total", sysMsgMapper.totalCout());
        return map;
    }
}