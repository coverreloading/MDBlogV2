package com.mdblog.po;

public class UserInfo {

    private Long uiUid;

    private String uiNickname;

    private String uiPic;

    private String uiDesc;

    private String uiSex;

    private Long uiBirth;

    private String uiOccupation;

    private String uiLivePlace;

    private Long uiCreatetime;

    private Integer uiDel;

    public Long getUiUid() {
        return uiUid;
    }

    public void setUiUid(Long uiUid) {
        this.uiUid = uiUid;
    }

    public String getUiNickname() {
        return uiNickname;
    }

    public void setUiNickname(String uiNickname) {
        this.uiNickname = uiNickname == null ? null : uiNickname.trim();
    }

    public String getUiPic() {
        return uiPic;
    }

    public void setUiPic(String uiPic) {
        this.uiPic = uiPic == null ? null : uiPic.trim();
    }

    public String getUiDesc() {
        return uiDesc;
    }

    public void setUiDesc(String uiDesc) {
        this.uiDesc = uiDesc == null ? null : uiDesc.trim();
    }

    public String getUiSex() {
        return uiSex;
    }

    public void setUiSex(String uiSex) {
        this.uiSex = uiSex == null ? null : uiSex.trim();
    }

    public Long getUiBirth() {
        return uiBirth;
    }

    public void setUiBirth(Long uiBirth) {
        this.uiBirth = uiBirth;
    }

    public String getUiOccupation() {
        return uiOccupation;
    }

    public void setUiOccupation(String uiOccupation) {
        this.uiOccupation = uiOccupation == null ? null : uiOccupation.trim();
    }

    public String getUiLivePlace() {
        return uiLivePlace;
    }

    public void setUiLivePlace(String uiLivePlace) {
        this.uiLivePlace = uiLivePlace == null ? null : uiLivePlace.trim();
    }

    public Long getUiCreatetime() {
        return uiCreatetime;
    }

    public void setUiCreatetime(Long uiCreatetime) {
        this.uiCreatetime = uiCreatetime;
    }

    public Integer getUiDel() {
        return uiDel;
    }

    public void setUiDel(Integer uiDel) {
        this.uiDel = uiDel;
    }
    @Override
    public String toString() {
        return "UserInfo{" +
                "uiUid=" + uiUid +
                ", uiNickname='" + uiNickname + '\'' +
                ", uiPic='" + uiPic + '\'' +
                ", uiDesc='" + uiDesc + '\'' +
                ", uiSex='" + uiSex + '\'' +
                ", uiBirth=" + uiBirth +
                ", uiOccupation='" + uiOccupation + '\'' +
                ", uiLivePlace='" + uiLivePlace + '\'' +
                ", uiCreatetime=" + uiCreatetime +
                ", uiDel=" + uiDel +
                '}';
    }
}