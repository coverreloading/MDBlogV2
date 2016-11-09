package com.mdblog.po;

public class Comments {
    private Long cId;

    private Long cRaid;

    private Long cUid;

    private Long cParentid;

    private String cUPic;

    private String cUNickname;

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

    public Long getcUid() {
        return cUid;
    }

    public void setcUid(Long cUid) {
        this.cUid = cUid;
    }

    public Long getcParentid() {
        return cParentid;
    }

    public void setcParentid(Long cParentid) {
        this.cParentid = cParentid;
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