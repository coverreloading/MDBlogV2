package dto;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/18.13:34.
 */
public class SolrInsertItem {
    private Long UI_UID;
    private String UI_Nickname ;
    private String UI_Pic ;
    private String UI_Sex ;
    private Long RA_ID ;
    private Long RA_Subject_ID ;
    private String RA_Title ;
    private String RA_Pic ;
    private String RA_Desc ;
    private Long RA_Read ;
    private Long RA_Like ;
    private String RA_Text;

    public String getRA_Text() {
        return RA_Text;
    }

    public void setRA_Text(String RA_Text) {
        this.RA_Text = RA_Text;
    }

    public Long getUI_UID() {
        return UI_UID;
    }

    public void setUI_UID(Long UI_UID) {
        this.UI_UID = UI_UID;
    }

    public String getUI_Nickname() {
        return UI_Nickname;
    }

    public void setUI_Nickname(String UI_Nickname) {
        this.UI_Nickname = UI_Nickname;
    }

    public String getUI_Pic() {
        return UI_Pic;
    }

    public void setUI_Pic(String UI_Pic) {
        this.UI_Pic = UI_Pic;
    }

    public String getUI_Sex() {
        return UI_Sex;
    }

    public void setUI_Sex(String UI_Sex) {
        this.UI_Sex = UI_Sex;
    }

    public Long getRA_ID() {
        return RA_ID;
    }

    public void setRA_ID(Long RA_ID) {
        this.RA_ID = RA_ID;
    }

    public Long getRA_Subject_ID() {
        return RA_Subject_ID;
    }

    public void setRA_Subject_ID(Long RA_Subject_ID) {
        this.RA_Subject_ID = RA_Subject_ID;
    }

    public String getRA_Title() {
        return RA_Title;
    }

    public void setRA_Title(String RA_Title) {
        this.RA_Title = RA_Title;
    }

    public String getRA_Pic() {
        return RA_Pic;
    }

    public void setRA_Pic(String RA_Pic) {
        this.RA_Pic = RA_Pic;
    }

    public String getRA_Desc() {
        return RA_Desc;
    }

    public void setRA_Desc(String RA_Desc) {
        this.RA_Desc = RA_Desc;
    }

    public Long getRA_Read() {
        return RA_Read;
    }

    public void setRA_Read(Long RA_Read) {
        this.RA_Read = RA_Read;
    }

    public Long getRA_Like() {
        return RA_Like;
    }

    public void setRA_Like(Long RA_Like) {
        this.RA_Like = RA_Like;
    }

    @Override
    public String toString() {
        return "SolrInsertItem{" +
                "UI_UID=" + UI_UID +
                ", UI_Nickname='" + UI_Nickname + '\'' +
                ", UI_Pic='" + UI_Pic + '\'' +
                ", UI_Sex='" + UI_Sex + '\'' +
                ", RA_ID=" + RA_ID +
                ", RA_Subject_ID=" + RA_Subject_ID +
                ", RA_Title='" + RA_Title + '\'' +
                ", RA_Pic='" + RA_Pic + '\'' +
                ", RA_Desc='" + RA_Desc + '\'' +
                ", RA_Read=" + RA_Read +
                ", RA_Like=" + RA_Like +
                ", RA_Text='" + RA_Text + '\'' +
                '}';
    }

}
