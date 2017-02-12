package com.mdblog.pojo;

import com.mdblog.po.Comments;
import com.mdblog.po.ReleaseArticle;
import com.mdblog.po.User;
import com.mdblog.po.UserInfo;

/**
 * Created by loadi on 2017/2/10.
 */
public class UserArticleComment {
    private ReleaseArticle releaseArticle;
    private UserInfo userInfo;
    private Comments comments;

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public ReleaseArticle getReleaseArticle() {
        return releaseArticle;
    }

    public void setReleaseArticle(ReleaseArticle releaseArticle) {
        this.releaseArticle = releaseArticle;
    }



    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "UserArticleComment{" +
                "releaseArticle=" + releaseArticle.toString() +
                ", user=" + userInfo.toString() +
                ", comments=" + comments.toString() +
                '}';
    }
}
