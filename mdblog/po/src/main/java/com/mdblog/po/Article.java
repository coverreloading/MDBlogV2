package com.mdblog.po;

public class Article {
    private Long aId;

    private Long aUid;

    private String aTitle;

    private String aDesc;

    private String aPic;

    private Long aCreatetime;

    private Long aUpdatetime;

    private Integer aDel;

    private String aText;

    public Long getaId() {
        return aId;
    }

    public void setaId(Long aId) {
        this.aId = aId;
    }

    public Long getaUid() {
        return aUid;
    }

    public void setaUid(Long aUid) {
        this.aUid = aUid;
    }

    public String getaTitle() {
        return aTitle;
    }

    public void setaTitle(String aTitle) {
        this.aTitle = aTitle == null ? null : aTitle.trim();
    }

    public String getaDesc() {
        return aDesc;
    }

    public void setaDesc(String aDesc) {
        this.aDesc = aDesc == null ? null : aDesc.trim();
    }

    public String getaPic() {
        return aPic;
    }

    public void setaPic(String aPic) {
        this.aPic = aPic == null ? null : aPic.trim();
    }

    public Long getaCreatetime() {
        return aCreatetime;
    }

    public void setaCreatetime(Long aCreatetime) {
        this.aCreatetime = aCreatetime;
    }

    public Long getaUpdatetime() {
        return aUpdatetime;
    }

    public void setaUpdatetime(Long aUpdatetime) {
        this.aUpdatetime = aUpdatetime;
    }

    public Integer getaDel() {
        return aDel;
    }

    public void setaDel(Integer aDel) {
        this.aDel = aDel;
    }

    public String getaText() {
        return aText;
    }

    public void setaText(String aText) {
        this.aText = aText == null ? null : aText.trim();
    }
}