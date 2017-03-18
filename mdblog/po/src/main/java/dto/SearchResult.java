package dto;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/18.16:37.
 */
import java.util.List;

public class SearchResult {

    //商品列表
    private List<SolrInsertItem> itemList;
    //总记录数
    private long recordCount;
    //总页数
    private long pageCount;
    //当前页
    private long curPage;

    public List<SolrInsertItem> getItemList() {
        return itemList;
    }
    public void setItemList(List<SolrInsertItem> itemList) {
        this.itemList = itemList;
    }
    public long getRecordCount() {
        return recordCount;
    }
    public void setRecordCount(long recordCount) {
        this.recordCount = recordCount;
    }
    public long getPageCount() {
        return pageCount;
    }
    public void setPageCount(long pageCount) {
        this.pageCount = pageCount;
    }
    public long getCurPage() {
        return curPage;
    }
    public void setCurPage(long curPage) {
        this.curPage = curPage;
    }

}
