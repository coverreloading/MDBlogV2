package com.mdblog.po;

public class ArticleCollection {
    private Long acId;

    private Long acUid;

    private Long acRaId;

    private String acRaTitle;

    private Long acCreatetime;

    private Long acUpdatetime;

    private Integer acDel;

    public Long getAcId() {
        return acId;
    }

    public void setAcId(Long acId) {
        this.acId = acId;
    }

    public Long getAcUid() {
        return acUid;
    }

    public void setAcUid(Long acUid) {
        this.acUid = acUid;
    }

    public Long getAcRaId() {
        return acRaId;
    }

    public void setAcRaId(Long acRaId) {
        this.acRaId = acRaId;
    }

    public String getAcRaTitle() {
        return acRaTitle;
    }

    public void setAcRaTitle(String acRaTitle) {
        this.acRaTitle = acRaTitle == null ? null : acRaTitle.trim();
    }

    public Long getAcCreatetime() {
        return acCreatetime;
    }

    public void setAcCreatetime(Long acCreatetime) {
        this.acCreatetime = acCreatetime;
    }

    public Long getAcUpdatetime() {
        return acUpdatetime;
    }

    public void setAcUpdatetime(Long acUpdatetime) {
        this.acUpdatetime = acUpdatetime;
    }

    public Integer getAcDel() {
        return acDel;
    }

    public void setAcDel(Integer acDel) {
        this.acDel = acDel;
    }
}