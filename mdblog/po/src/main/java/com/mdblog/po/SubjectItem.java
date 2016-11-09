package com.mdblog.po;

public class SubjectItem {
    private Long siId;

    private Long siSid;

    private Long siRaId;

    private String siTitle;

    private String siDesc;

    private Long siCreatetime;

    private Long siUpdatetime;

    public Long getSiId() {
        return siId;
    }

    public void setSiId(Long siId) {
        this.siId = siId;
    }

    public Long getSiSid() {
        return siSid;
    }

    public void setSiSid(Long siSid) {
        this.siSid = siSid;
    }

    public Long getSiRaId() {
        return siRaId;
    }

    public void setSiRaId(Long siRaId) {
        this.siRaId = siRaId;
    }

    public String getSiTitle() {
        return siTitle;
    }

    public void setSiTitle(String siTitle) {
        this.siTitle = siTitle == null ? null : siTitle.trim();
    }

    public String getSiDesc() {
        return siDesc;
    }

    public void setSiDesc(String siDesc) {
        this.siDesc = siDesc == null ? null : siDesc.trim();
    }

    public Long getSiCreatetime() {
        return siCreatetime;
    }

    public void setSiCreatetime(Long siCreatetime) {
        this.siCreatetime = siCreatetime;
    }

    public Long getSiUpdatetime() {
        return siUpdatetime;
    }

    public void setSiUpdatetime(Long siUpdatetime) {
        this.siUpdatetime = siUpdatetime;
    }
}