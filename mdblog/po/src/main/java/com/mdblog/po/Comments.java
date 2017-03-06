package com.mdblog.po;

public class Comments {
    private Long cId;

    private Long cRaid;

    private Long cParentid;

    private Long cUid;

    private String cUPic;

    private String cUNickname;

    private Long cUid2;

    private String cUNickname2;

    private String cContent;

    private Long cCreatetime;

    private Integer cDel;

    public Long getcId() {
        return cId;
    }

    public void setcId(Long cId) {
        this.cId = cId;
    }

    public Long getcRaid() {
        return cRaid;
    }

    public void setcRaid(Long cRaid) {
        this.cRaid = cRaid;
    }

    public Long getcParentid() {
        return cParentid;
    }

    public void setcParentid(Long cParentid) {
        this.cParentid = cParentid;
    }

    public Long getcUid() {
        return cUid;
    }

    public void setcUid(Long cUid) {
        this.cUid = cUid;
    }

    public String getcUPic() {
        return cUPic;
    }

    public void setcUPic(String cUPic) {
        this.cUPic = cUPic == null ? null : cUPic.trim();
    }

    public String getcUNickname() {
        return cUNickname;
    }

    public void setcUNickname(String cUNickname) {
        this.cUNickname = cUNickname == null ? null : cUNickname.trim();
    }

    public Long getcUid2() {
        return cUid2;
    }

    public void setcUid2(Long cUid2) {
        this.cUid2 = cUid2;
    }

    public String getcUNickname2() {
        return cUNickname2;
    }

    public void setcUNickname2(String cUNickname2) {
        this.cUNickname2 = cUNickname2 == null ? null : cUNickname2.trim();
    }

    public String getcContent() {
        return cContent;
    }

    public void setcContent(String cContent) {
        this.cContent = cContent == null ? null : cContent.trim();
    }

    public Long getcCreatetime() {
        return cCreatetime;
    }

    public void setcCreatetime(Long cCreatetime) {
        this.cCreatetime = cCreatetime;
    }

    public Integer getcDel() {
        return cDel;
    }

    public void setcDel(Integer cDel) {
        this.cDel = cDel;
    }
}