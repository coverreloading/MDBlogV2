import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

/**
 * Created by loading2013(win10) for project(mdblog) on 2017/3/18.15:39.
 */
public class SolrjTest {


    @Test
    public void testAddDocument() throws Exception {
        HttpSolrClient solrClient = new HttpSolrClient("http://localhost:8983/solr/mdblog");

        SolrInputDocument document = new SolrInputDocument();
        document.setField("id", 1);
        document.setField("UI_Nickname", "123");
        document.setField("UI_Pic", "123");
        document.setField("UI_Sex", "123");
        document.setField("UI_UID", 1);
        document.setField("RA_Title", "123");
        document.setField("RA_Pic", "123");
        document.setField("RA_Desc", "123");
        document.setField("RA_Read", 1);
        document.setField("RA_Like", 1);
        document.setField("RA_Text", "123");
        //写入索引库
        solrClient.add(document);
        solrClient.commit();
        solrClient.close();
    }

}
