package com.mdblog.po;

public class SysMsg {
    private Long sysMsgId;

    private Long sysMsgUid;

    private String sysMsgTitle;

    private Long sysMsgCreatetime;

    private Integer sysMsgDel;

    private String sysMsgText;

    public Long getSysMsgId() {
        return sysMsgId;
    }

    public void setSysMsgId(Long sysMsgId) {
        this.sysMsgId = sysMsgId;
    }

    public Long getSysMsgUid() {
        return sysMsgUid;
    }

    public void setSysMsgUid(Long sysMsgUid) {
        this.sysMsgUid = sysMsgUid;
    }

    public String getSysMsgTitle() {
        return sysMsgTitle;
    }

    public void setSysMsgTitle(String sysMsgTitle) {
        this.sysMsgTitle = sysMsgTitle == null ? null : sysMsgTitle.trim();
    }

    public Long getSysMsgCreatetime() {
        return sysMsgCreatetime;
    }

    public void setSysMsgCreatetime(Long sysMsgCreatetime) {
        this.sysMsgCreatetime = sysMsgCreatetime;
    }

    public Integer getSysMsgDel() {
        return sysMsgDel;
    }

    public void setSysMsgDel(Integer sysMsgDel) {
        this.sysMsgDel = sysMsgDel;
    }

    public String getSysMsgText() {
        return sysMsgText;
    }

    public void setSysMsgText(String sysMsgText) {
        this.sysMsgText = sysMsgText == null ? null : sysMsgText.trim();
    }
}