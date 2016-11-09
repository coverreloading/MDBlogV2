package com.mdblog.po;

public class ArticleTips {
    private Long atId;

    private Long atRaId;

    private String atTipname;

    private Long atCreatetime;

    private Long atUid;

    public Long getAtId() {
        return atId;
    }

    public void setAtId(Long atId) {
        this.atId = atId;
    }

    public Long getAtRaId() {
        return atRaId;
    }

    public void setAtRaId(Long atRaId) {
        this.atRaId = atRaId;
    }

    public String getAtTipname() {
        return atTipname;
    }

    public void setAtTipname(String atTipname) {
        this.atTipname = atTipname == null ? null : atTipname.trim();
    }

    public Long getAtCreatetime() {
        return atCreatetime;
    }

    public void setAtCreatetime(Long atCreatetime) {
        this.atCreatetime = atCreatetime;
    }

    public Long getAtUid() {
        return atUid;
    }

    public void setAtUid(Long atUid) {
        this.atUid = atUid;
    }
}