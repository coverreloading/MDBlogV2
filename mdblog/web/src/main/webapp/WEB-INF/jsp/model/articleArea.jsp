<%--
  Created by IntelliJ IDEA.
  User: Vincent
  Date: 16/11/1
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="main-bar" style="background-color: #ffffff;width:70%;position:relative;top:55px;left: 30%;">
    <div id="article-area" style="width:90%; position: absolute; left: 5%;">
        <div>
            <script src="/js/lib/utils.js" type="text/javascript"></script>
            <script>
                $(document).ready(function () {
                    var uid = 0;
//                  异步获取文章信息,展示
                    $.get(window.location.href + "/getall", function (data) {
                        var obj = new Function("return" + data)();

                        if (obj.status == 200) {
                            $("#ra-title,#page-title").html(obj.data.releaseArticle.raTitle);
                            $("#ra-text").html(obj.data.releaseArticle.raText);
                            $("#ra-like").html("点赞" + obj.data.releaseArticle.raLike);
                            $("#ra-read").html("阅读" + obj.data.releaseArticle.raRead);
                            $("#ra-createtime").html($.myTime.UnixToDate(obj.data.releaseArticle.raCreatetime));
                            $(".ui-uipic").attr("src", obj.data.userInfo.uiPic);
                            $(".ui-uiname").html(obj.data.userInfo.uiNickname);
                            uid = obj.data.userInfo.uiUid;
                        }
                    });
                    $(".following").hide();
                    $(".follow").hide();
                    // todo 2017-2-18  判断是否关注以显示对应按钮


                    setTimeout(function checkExit(){
                        if ("${token}" == "") {
                            console.log("未登陆");
                        } else {
                            $.post("/follow/checkExit",
                                    {
                                        token: "${token}",
                                        uid: uid
                                    },
                                    function (data) {
                                        var obj = new Function("return" + data)();
                                        if (obj.status == 401) {
//                                            alert(obj.msg);
                                            $(".following").show(200);
                                        }
                                        else {
                                            $(".follow").show(200);
                                        }
                                    });
                        }
                    }, 300);

                    $(".follow").click(function () {
                        if ("${token}" == "") {
                            swal("还没有登陆", "请登录", "error");
                            $window.location.href = '/login';
                        }
                        $.post("/follow/add",
                                {
                                    token: "${token}",
                                    uid: uid
                                },
                                function (data) {
                                    $(".follow").hide(200);
                                    $(".following").show(200);
                                });
                    });
                    $(".following").click(function () {
                        if ("${token}" == "") {
                            swal("还没有登陆", "请登录", "error");
                            $window.location.href = '/login';
                        }
                        $.post("/follow/remove",
                                {
                                    token: "${token}",
                                    uid: uid
                                },
                                function (data) {
                                    $(".following").hide(200);
                                    $(".follow").show(200);
                                });
                    });
                })
//                raLike 1
//                raRead 1
//                raTitle 1
//                raCreatetime 1
//                raUpdatetime
//                raPic
//                raSubjectId
//                raText 1
//                raUid
//                msg
//                status
//                alert(obj.data.raText);

//                userInfo

//                uiUid; 1
//                uiNickname; 1
//                uiPic; 1
//                uiDesc;
//                uiSex;
//                uiBirth;
//                uiOccupation;
//                uiLivePlace;
//                uiCreatetime;
//                uiDel;



            </script>
            <div class="note">
                <div class="post">
                    <div class="article">
                        <h1 id="ra-title" class="title">简书</h1>

                        <!-- 作者区域 -->
                        <div class="author">
                            <a class="avatar" href="">
                                <img class="ui-uipic" src="" alt="">
                            </a>
                            <div class="info">
                                <span class="tag">作者</span>
                                <span class="name"><a class="ui-uiname" href=""></a></span>
                                <!-- 关注用户按钮 -->
                                <a class="btn btn-success follow"><i class="iconfont ic-follow"></i><span>关注</span></a>
                                <a class="btn btn-default following"><i
                                        class="iconfont ic-followed"></i><span>已关注</span></a>
                                <!-- 文章数据信息 -->
                                <div class="meta">
                                    <span id="ra-createtime" class="publish-time"></span>
                                    <%--<span class="wordage">字数 2830</span>--%>
                                    <span id="ra-read" class="views-count"></span><span
                                        class="comments-count">评论 1</span><span id="ra-like" class="likes-count"></span>
                                </div>
                            </div>
                            <!-- 如果是当前作者，加入编辑按钮 -->
                        </div>
                        <!-- -->

                        <!-- 文章内容 -->
                        <div id="ra-text" class="show-content">

                            <!--  -->

                            <div class="show-foot">
                                <a class="notebook" href="/nb/135489">
                                    <i class="iconfont ic-search-notebook"></i> <span>日记本</span>
                                </a>
                                <div class="copyright" data-toggle="tooltip" data-html="true"
                                     data-original-title="转载请联系作者获得授权。">
                                    © 著作权归作者所有
                                </div>
                                <div class="modal-wrap" data-report-note="">
                                    <a id="report-modal">举报文章</a>
                                </div>
                            </div>
                        </div>

                        <!-- 文章底部作者信息 -->
                        <div class="follow-detail">
                            <div class="info">
                                <a class="avatar" href="">
                                    <img class="ui-uipic" src="" alt="">
                                </a> <a class="btn btn-success follow"><i class="iconfont ic-follow"></i><span>关注</span></a>
                                <a class="title ui-uiname" href=""></a>
                                <p>写了 174713 字，被 316 人关注，获得了 289 个喜欢</p></div>
                        </div>

                        <div class="support-author"><p>如果觉得我的文章对您有用，请随意打赏。您的支持将鼓励我继续创作！</p>
                            <div class="btn btn-pay">赞赏支持</div> <!----> <!----> <!----></div>

                        <div class="meta-bottom">
                            <div class="like">
                                <div class="btn like-group">
                                    <div class="btn-like"><a><i class="iconfont ic-like"></i>喜欢</a></div>
                                    <div class="modal-wrap"><a>9</a></div>
                                </div> <!----></div>
                            <div class="share-group">
                                <a class="share-circle" data-action="weixin-share" data-toggle="tooltip"
                                   data-original-title="分享到微信">
                                    <i class="iconfont ic-wechat"></i>
                                </a>
                                <a class="share-circle" data-toggle="tooltip"
                                   href="javascript:void((function(s,d,e,r,l,p,t,z,c){var%20f='http://v.t.sina.com.cn/share/share.php?appkey=1881139527',u=z||d.location,p=['&amp;url=',e(u),'&amp;title=',e(t||d.title),'&amp;source=',e(r),'&amp;sourceUrl=',e(l),'&amp;content=',c||'gb2312','&amp;pic=',e(p||'')].join('');function%20a(){if(!window.open([f,p].join(''),'mb',['toolbar=0,status=0,resizable=1,width=440,height=430,left=',(s.width-440)/2,',top=',(s.height-430)/2].join('')))u.href=[f,p].join('');};if(/Firefox/.test(navigator.userAgent))setTimeout(a,0);else%20a();})(screen,document,encodeURIComponent,'','','http://cwb.assets.jianshu.io/notes/images/9160389/weibo/image_1652a0d39d81.jpg', '推荐 谁动了我的窝头 的文章《中统、军统，密码技术哪家强》（ 分享自 @简书 ）','http://www.jianshu.com/p/1697a93b0113?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=reader_share&amp;utm_source=weibo','页面编码gb2312|utf-8默认gb2312'));"
                                   data-original-title="分享到微博">
                                    <i class="iconfont ic-weibo"></i>
                                </a>
                                <a class="share-circle" data-toggle="tooltip"
                                   href="http://cwb.assets.jianshu.io/notes/images/9160389/weibo/image_1652a0d39d81.jpg"
                                   target="_blank" data-original-title="下载长微博图片">
                                    <i class="iconfont ic-picture"></i>
                                </a>
                                <a class="share-circle more-share" tabindex="0" data-toggle="popover"
                                   data-placement="top" data-html="true" data-trigger="focus" href="javascript:void(0);"
                                   data-content="
          <ul class=&quot;share-list&quot;>
            <li><a href=&quot;javascript:void(function(){var d=document,e=encodeURIComponent,r='http://sns.qzone.qq.com/cgi-bin/qzshare/cgi_qzshare_onekey?url='+e('http://www.jianshu.com/p/1697a93b0113?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=reader_share&amp;utm_source=qzone')+'&amp;title='+e('推荐 谁动了我的窝头 的文章《中统、军统，密码技术哪家强》'),x=function(){if(!window.open(r,'qzone','toolbar=0,resizable=1,scrollbars=yes,status=1,width=600,height=600'))location.href=r};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})();&quot;><i class=&quot;social-icon-sprite social-icon-zone&quot;></i><span>分享到QQ空间</span></a></li>
            <li><a href=&quot;javascript:void(function(){var d=document,e=encodeURIComponent,r='https://twitter.com/share?url='+e('http://www.jianshu.com/p/1697a93b0113?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=reader_share&amp;utm_source=twitter')+'&amp;text='+e('推荐 谁动了我的窝头 的文章《中统、军统，密码技术哪家强》（ 分享自 @jianshucom ）')+'&amp;related='+e('jianshucom'),x=function(){if(!window.open(r,'twitter','toolbar=0,resizable=1,scrollbars=yes,status=1,width=600,height=600'))location.href=r};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})();&quot;><i class=&quot;social-icon-sprite social-icon-twitter&quot;></i><span>分享到Twitter</span></a></li>
            <li><a href=&quot;javascript:void(function(){var d=document,e=encodeURIComponent,r='https://www.facebook.com/dialog/share?app_id=483126645039390&amp;display=popup&amp;href=http://www.jianshu.com/p/1697a93b0113?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=reader_share&amp;utm_source=facebook',x=function(){if(!window.open(r,'facebook','toolbar=0,resizable=1,scrollbars=yes,status=1,width=450,height=330'))location.href=r};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})();&quot;><i class=&quot;social-icon-sprite social-icon-facebook&quot;></i><span>分享到Facebook</span></a></li>
            <li><a href=&quot;javascript:void(function(){var d=document,e=encodeURIComponent,r='https://plus.google.com/share?url='+e('http://www.jianshu.com/p/1697a93b0113?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=reader_share&amp;utm_source=google_plus'),x=function(){if(!window.open(r,'google_plus','toolbar=0,resizable=1,scrollbars=yes,status=1,width=450,height=330'))location.href=r};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})();&quot;><i class=&quot;social-icon-sprite social-icon-google&quot;></i><span>分享到Google+</span></a></li>
            <li><a href=&quot;javascript:void(function(){var d=document,e=encodeURIComponent,s1=window.getSelection,s2=d.getSelection,s3=d.selection,s=s1?s1():s2?s2():s3?s3.createRange().text:'',r='http://www.douban.com/recommend/?url='+e('http://www.jianshu.com/p/1697a93b0113?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=reader_share&amp;utm_source=douban')+'&amp;title='+e('中统、军统，密码技术哪家强')+'&amp;sel='+e(s)+'&amp;v=1',x=function(){if(!window.open(r,'douban','toolbar=0,resizable=1,scrollbars=yes,status=1,width=450,height=330'))location.href=r+'&amp;r=1'};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})()&quot;><i class=&quot;social-icon-sprite social-icon-douban&quot;></i><span>分享到豆瓣</span></a></li>
          </ul>
        " data-original-title="" title="">更多分享</a>
                            </div>
                        </div>
                        <div>
                            <div id="comment-list" class="comment-list">
                                <div>
                                    <form class="new-comment"><a class="avatar"><img
                                            src="http://upload.jianshu.io/users/upload_avatars/3404627/f8aa0b67f6ee?imageMogr2/auto-orient/strip|imageView2/1/w/114/h/114"></a>
                                        <textarea placeholder="写下你的评论..."></textarea> <!----></form>
                                </div>
                                <div id="normal-comment-list" class="normal-comment-list">
                                    <div>
                                        <div>
                                            <div class="top"><span>1条评论</span> <a class="author-only">只看作者</a> <a
                                                    class="close-btn" style="display: none;">关闭评论</a>
                                                <div class="pull-right"><a class="active">按喜欢排序</a><a class="">按时间正序</a><a
                                                        class="">按时间倒序</a></div>
                                            </div>
                                        </div> <!----> <!---->
                                        <div id="comment-8052051" class="comment">
                                            <div>
                                                <div class="author"><a href="/u/62af0be6907c" target="_blank"
                                                                       class="avatar"><img
                                                        src="http://upload.jianshu.io/users/upload_avatars/3919921/d6b39fc21e1b.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/114/h/114"></a>
                                                    <div class="info"><a href="/u/62af0be6907c" target="_blank"
                                                                         class="name">麦川小镇</a> <!---->
                                                        <div class="meta"><span>2楼 · 2017.02.16 13:16</span></div>
                                                    </div>
                                                </div>
                                                <div class="comment-wrap"><p>德军的写写</p>
                                                    <div class="tool-group"><a><i class="iconfont ic-zan"></i>
                                                        <span>赞</span></a> <a><i class="iconfont ic-comment"></i>
                                                        <span>回复</span></a>
                                                        <a class="report"><span>举报</span></a> <!----></div>
                                                </div>
                                            </div>
                                            <div class="sub-comment-list hide"><!----> <!----></div>
                                        </div>
                                        <div class="comments-placeholder" style="display: none;">
                                            <div class="author">
                                                <div class="avatar"></div>
                                                <div class="info">
                                                    <div class="name"></div>
                                                    <div class="meta"></div>
                                                </div>
                                            </div>
                                            <div class="text"></div>
                                            <div class="text animation-delay"></div>
                                            <div class="tool-group"><i class="iconfont ic-zan-active"></i>
                                                <div class="zan"></div>
                                                <i class="iconfont ic-list-comments"></i>
                                                <div class="zan"></div>
                                            </div>
                                        </div>
                                    </div>
                                </div> <!----> <!----></div>
                        </div>
                    </div>

                    <div class="side-tool">
                        <ul>
                            <li data-placement="left" data-toggle="tooltip" data-container="body"
                                data-original-title="回到顶部">
                                <a href="#"><i class="iconfont ic-backtop"></i></a>
                            </li>
                            <li data-placement="left" data-toggle="tooltip" data-container="body"
                                data-original-title="将文章加入专题">
                                <a class="js-add-to-collection">
                                    <i class="iconfont ic-addcollectionmodal"></i>
                                </a>
                            </li>
                            <li data-original-title="" title="">
                                <a data-action="toggle-bookmark-note" href="javascript:void(null);">
                                    <i class="iconfont ic-mark"></i>
                                </a></li>
                            <li data-share-note="" data-placement="left" data-toggle="tooltip" data-container="body"
                                data-original-title="分享文章">
                                <a tabindex="0" data-toggle="popover" data-placement="left" data-html="true"
                                   data-trigger="focus" href="javascript:void(0);" data-content="
          <ul class=&quot;share-list&quot;>
            <li><a class data-action=&quot;weixin-share&quot;><i class=&quot;social-icon-sprite social-icon-weixin&quot;></i><span>分享到微信</span></a></li>
            <li><a href=&quot;javascript:void((function(s,d,e,r,l,p,t,z,c){var%20f='http://v.t.sina.com.cn/share/share.php?appkey=1881139527',u=z||d.location,p=['&amp;url=',e(u),'&amp;title=',e(t||d.title),'&amp;source=',e(r),'&amp;sourceUrl=',e(l),'&amp;content=',c||'gb2312','&amp;pic=',e(p||'')].join('');function%20a(){if(!window.open([f,p].join(''),'mb',['toolbar=0,status=0,resizable=1,width=440,height=430,left=',(s.width-440)/2,',top=',(s.height-430)/2].join('')))u.href=[f,p].join('');};if(/Firefox/.test(navigator.userAgent))setTimeout(a,0);else%20a();})(screen,document,encodeURIComponent,'','','http://cwb.assets.jianshu.io/notes/images/9160389/weibo/image_1652a0d39d81.jpg', '推荐 谁动了我的窝头 的文章《中统、军统，密码技术哪家强》（ 分享自 @简书 ）','http://www.jianshu.com/p/1697a93b0113?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=reader_share&amp;utm_source=weibo','页面编码gb2312|utf-8默认gb2312'));&quot;><i class=&quot;social-icon-sprite social-icon-weibo&quot;></i><span>分享到微博</span></a></li>
              <li><a href=&quot;http://cwb.assets.jianshu.io/notes/images/9160389/weibo/image_1652a0d39d81.jpg&quot; target=&quot;_blank&quot;><i class=&quot;social-icon-sprite social-icon-picture&quot;></i><span>下载长微博图片</span></a></li>
            <li><a href=&quot;javascript:void(function(){var d=document,e=encodeURIComponent,r='http://sns.qzone.qq.com/cgi-bin/qzshare/cgi_qzshare_onekey?url='+e('http://www.jianshu.com/p/1697a93b0113?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=reader_share&amp;utm_source=qzone')+'&amp;title='+e('推荐 谁动了我的窝头 的文章《中统、军统，密码技术哪家强》'),x=function(){if(!window.open(r,'qzone','toolbar=0,resizable=1,scrollbars=yes,status=1,width=600,height=600'))location.href=r};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})();&quot;><i class=&quot;social-icon-sprite social-icon-zone&quot;></i><span>分享到QQ空间</span></a></li>
            <li><a href=&quot;javascript:void(function(){var d=document,e=encodeURIComponent,r='https://twitter.com/share?url='+e('http://www.jianshu.com/p/1697a93b0113?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=reader_share&amp;utm_source=twitter')+'&amp;text='+e('推荐 谁动了我的窝头 的文章《中统、军统，密码技术哪家强》（ 分享自 @jianshucom ）')+'&amp;related='+e('jianshucom'),x=function(){if(!window.open(r,'twitter','toolbar=0,resizable=1,scrollbars=yes,status=1,width=600,height=600'))location.href=r};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})();&quot;><i class=&quot;social-icon-sprite social-icon-twitter&quot;></i><span>分享到Twitter</span></a></li>
            <li><a href=&quot;javascript:void(function(){var d=document,e=encodeURIComponent,r='https://www.facebook.com/dialog/share?app_id=483126645039390&amp;display=popup&amp;href=http://www.jianshu.com/p/1697a93b0113?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=reader_share&amp;utm_source=facebook',x=function(){if(!window.open(r,'facebook','toolbar=0,resizable=1,scrollbars=yes,status=1,width=450,height=330'))location.href=r};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})();&quot;><i class=&quot;social-icon-sprite social-icon-facebook&quot;></i><span>分享到Facebook</span></a></li>
            <li><a href=&quot;javascript:void(function(){var d=document,e=encodeURIComponent,r='https://plus.google.com/share?url='+e('http://www.jianshu.com/p/1697a93b0113?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=reader_share&amp;utm_source=google_plus'),x=function(){if(!window.open(r,'google_plus','toolbar=0,resizable=1,scrollbars=yes,status=1,width=450,height=330'))location.href=r};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})();&quot;><i class=&quot;social-icon-sprite social-icon-google&quot;></i><span>分享到Google+</span></a></li>
            <li><a href=&quot;javascript:void(function(){var d=document,e=encodeURIComponent,s1=window.getSelection,s2=d.getSelection,s3=d.selection,s=s1?s1():s2?s2():s3?s3.createRange().text:'',r='http://www.douban.com/recommend/?url='+e('http://www.jianshu.com/p/1697a93b0113?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=reader_share&amp;utm_source=douban')+'&amp;title='+e('中统、军统，密码技术哪家强')+'&amp;sel='+e(s)+'&amp;v=1',x=function(){if(!window.open(r,'douban','toolbar=0,resizable=1,scrollbars=yes,status=1,width=450,height=330'))location.href=r+'&amp;r=1'};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})()&quot;><i class=&quot;social-icon-sprite social-icon-douban&quot;></i><span>分享到豆瓣</span></a></li>
          </ul>
        " data-original-title="" title=""><i class="iconfont ic-share"></i></a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <br>
        </div>
    </div>