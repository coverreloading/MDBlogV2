package com.mdblog.po;

public class UserLike {
    private Long ulId;

    private Long ulUid;

    private Long ulUid2;

    private String ulNickname;

    private String ulPic;

    private Long ulCreatetime;

    public Long getUlId() {
        return ulId;
    }

    public void setUlId(Long ulId) {
        this.ulId = ulId;
    }

    public Long getUlUid() {
        return ulUid;
    }

    public void setUlUid(Long ulUid) {
        this.ulUid = ulUid;
    }

    public Long getUlUid2() {
        return ulUid2;
    }

    public void setUlUid2(Long ulUid2) {
        this.ulUid2 = ulUid2;
    }

    public String getUlNickname() {
        return ulNickname;
    }

    public void setUlNickname(String ulNickname) {
        this.ulNickname = ulNickname == null ? null : ulNickname.trim();
    }

    public String getUlPic() {
        return ulPic;
    }

    public void setUlPic(String ulPic) {
        this.ulPic = ulPic == null ? null : ulPic.trim();
    }

    public Long getUlCreatetime() {
        return ulCreatetime;
    }

    public void setUlCreatetime(Long ulCreatetime) {
        this.ulCreatetime = ulCreatetime;
    }
}