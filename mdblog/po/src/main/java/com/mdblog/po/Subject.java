package com.mdblog.po;

public class Subject {
    private Long sId;

    private String sTitle;

    private String sPic;

    private String sDesc;

    private Long sCreatetime;

    private Integer sDel;

    public Long getsId() {
        return sId;
    }

    public void setsId(Long sId) {
        this.sId = sId;
    }

    public String getsTitle() {
        return sTitle;
    }

    public void setsTitle(String sTitle) {
        this.sTitle = sTitle == null ? null : sTitle.trim();
    }

    public String getsPic() {
        return sPic;
    }

    public void setsPic(String sPic) {
        this.sPic = sPic == null ? null : sPic.trim();
    }

    public String getsDesc() {
        return sDesc;
    }

    public void setsDesc(String sDesc) {
        this.sDesc = sDesc == null ? null : sDesc.trim();
    }

    public Long getsCreatetime() {
        return sCreatetime;
    }

    public void setsCreatetime(Long sCreatetime) {
        this.sCreatetime = sCreatetime;
    }

    public Integer getsDel() {
        return sDel;
    }

    public void setsDel(Integer sDel) {
        this.sDel = sDel;
    }
}