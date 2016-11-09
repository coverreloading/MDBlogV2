package com.mdblog.po;

public class ReleaseArticle {
    private Long raId;

    private Long raArticleId;

    private Long raUid;

    private Long raSubjectId;

    private String raTitle;

    private String raPic;

    private String raDesc;

    private Long raRead;

    private Long raLike;

    private Long raCreatetime;

    private Long raUpdatetime;

    private Integer raDel;

    private String raText;

    public Long getRaId() {
        return raId;
    }

    public void setRaId(Long raId) {
        this.raId = raId;
    }

    public Long getRaArticleId() {
        return raArticleId;
    }

    public void setRaArticleId(Long raArticleId) {
        this.raArticleId = raArticleId;
    }

    public Long getRaUid() {
        return raUid;
    }

    public void setRaUid(Long raUid) {
        this.raUid = raUid;
    }

    public Long getRaSubjectId() {
        return raSubjectId;
    }

    public void setRaSubjectId(Long raSubjectId) {
        this.raSubjectId = raSubjectId;
    }

    public String getRaTitle() {
        return raTitle;
    }

    public void setRaTitle(String raTitle) {
        this.raTitle = raTitle == null ? null : raTitle.trim();
    }

    public String getRaPic() {
        return raPic;
    }

    public void setRaPic(String raPic) {
        this.raPic = raPic == null ? null : raPic.trim();
    }

    public String getRaDesc() {
        return raDesc;
    }

    public void setRaDesc(String raDesc) {
        this.raDesc = raDesc == null ? null : raDesc.trim();
    }

    public Long getRaRead() {
        return raRead;
    }

    public void setRaRead(Long raRead) {
        this.raRead = raRead;
    }

    public Long getRaLike() {
        return raLike;
    }

    public void setRaLike(Long raLike) {
        this.raLike = raLike;
    }

    public Long getRaCreatetime() {
        return raCreatetime;
    }

    public void setRaCreatetime(Long raCreatetime) {
        this.raCreatetime = raCreatetime;
    }

    public Long getRaUpdatetime() {
        return raUpdatetime;
    }

    public void setRaUpdatetime(Long raUpdatetime) {
        this.raUpdatetime = raUpdatetime;
    }

    public Integer getRaDel() {
        return raDel;
    }

    public void setRaDel(Integer raDel) {
        this.raDel = raDel;
    }

    public String getRaText() {
        return raText;
    }

    public void setRaText(String raText) {
        this.raText = raText == null ? null : raText.trim();
    }
}