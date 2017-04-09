package com.mdblog.service;

import com.mdblog.po.ResponResult;
import com.mdblog.po.SysMsg;

import java.util.List;
import java.util.Map;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/4/8.15:59.
 */
public interface ManageMsgService {
    // 添加公告
    ResponResult addMsg(SysMsg sysMsg);
    // 删除公告
    ResponResult deleteMsg(long id);
    // 激活公告
    ResponResult activeMsg(long id);
    // 分页
    Map getTable(int offset, int limit);
}
