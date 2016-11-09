package com.mdblog.po;

public class Newsletter {
    private Long nlId;

    private Long nlFromUid;

    private Long nlToUid;

    private String nlText;

    private Integer nlIsread;

    private Long nlCreatetime;

    public Long getNlId() {
        return nlId;
    }

    public void setNlId(Long nlId) {
        this.nlId = nlId;
    }

    public Long getNlFromUid() {
        return nlFromUid;
    }

    public void setNlFromUid(Long nlFromUid) {
        this.nlFromUid = nlFromUid;
    }

    public Long getNlToUid() {
        return nlToUid;
    }

    public void setNlToUid(Long nlToUid) {
        this.nlToUid = nlToUid;
    }

    public String getNlText() {
        return nlText;
    }

    public void setNlText(String nlText) {
        this.nlText = nlText == null ? null : nlText.trim();
    }

    public Integer getNlIsread() {
        return nlIsread;
    }

    public void setNlIsread(Integer nlIsread) {
        this.nlIsread = nlIsread;
    }

    public Long getNlCreatetime() {
        return nlCreatetime;
    }

    public void setNlCreatetime(Long nlCreatetime) {
        this.nlCreatetime = nlCreatetime;
    }
}