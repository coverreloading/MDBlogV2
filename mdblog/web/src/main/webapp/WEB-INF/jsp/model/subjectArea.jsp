<%--
  Created by IntelliJ IDEA.
  User: loadi
  Date: 2017/3/3
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div ng-app="subApp" ng-controller="subCtrl">
    <div class="container collection">
        <div class="row">
            <div class="col-xs-24 col-sm-16 main">
                <!-- 专题头部模块 -->
                <div class="main-top">
                    <a class="avatar-collection" href="/c/5cc4460bb4a0">
                        <img src="${sub.sPic}"
                             alt="240">
                    </a> <a class="btn btn-success follow"><i class="iconfont ic-follow"></i><span>关注</span></a>
                    <div class="btn btn-hollow js-contribute-button">
                        投稿
                    </div>
                    <div class="title">
                        <a class="name" href="/c/5cc4460bb4a0">${sub.sTitle}</a>
                    </div>
                    <div class="info">
                        收录了992篇文章 · 19679人关注
                    </div>
                </div>
                <ul class="trigger-menu" data-pjax-container="#list-container">
                    <li class="active"><a href="/c/5cc4460bb4a0?order_by=commented_at"><i
                            class="iconfont ic-latestcomments"></i> 最新评论</a></li>
                    <li class=""><a href="/c/5cc4460bb4a0?order_by=added_at"><i class="iconfont ic-articles"></i>
                        最新收录</a></li>
                    <li class=""><a href="/c/5cc4460bb4a0?order_by=top"><i class="iconfont ic-hot"></i> 热门</a></li>
                </ul>
                <div id="list-container">
                    <!-- 文章列表模块 -->
                    <ul class="note-list" infinite-scroll-url="/c/5cc4460bb4a0?order_by=commented_at">
                        <div ng-repeat="x in records">
                            <li id="note-9722123" data-note-id="9722123" class="have-img">
                                <a class="wrap-img" href="/a/{{x.ra.raId}}" target="_blank">
                                    <img src="{{x.ra.raPic}}">
                                </a>
                                <div class="content">
                                    <div class="author">
                                        <a class="avatar" target="_blank" href="/uinfo/u/{{x.ra.raUid}}">
                                            <img src="{{x.ui.uiPic}}"
                                                 alt="96">
                                        </a>
                                        <div class="name">
                                            <a class="blue-link" target="_blank" href="/uinfo/u/{{x.ui.uiUid}}">{{x.ui.uiNickname}}</a>
                                            <span class="time"
                                                  data-shared-at="{{ x.ra.raCreatetime | date:'yyyy-MM-dd' }} {{ x.ra.raCreatetime | date:'HH:mm:ss' }}">{{ x.ra.raCreatetime | date:'yyyy-MM-dd' }} {{ x.ra.raCreatetime | date:'HH:mm:ss' }}</span>
                                        </div>
                                    </div>
                                    <a class="title" target="_blank" href="/a/{{x.ra.raId}}">{{x.ra.raTitle}}</a>
                                    <p class="abstract">
                                        {{x.ra.raDesc}}
                                    </p>
                                    <div class="meta">
                                        <a target="_blank" href="/a/{{x.ra.raId}}">
                                            <i class="iconfont ic-list-read"></i> {{x.ra.raRead}}
                                        </a>
                                        <a hidden target="_blank" href="/a/{{x.ra.raId}}#comments">
                                            <i hidden class="iconfont ic-list-comments"></i> 2
                                        </a> <span><i class="iconfont ic-list-like"></i> {{x.ra.raLike}}</span>
                                    </div>
                                </div>
                            </li>
                        </div>
                    </ul>
                    <button class="btn load-more" style="margin-bottom:100px;" ng-click="getmore(num)">点击加载更多</button>
                </div>
            </div>
            <div class="col-xs-24 col-sm-7 col-sm-offset-1 aside">
                <p class="title">专题公告</p>
                <div class="description js-description"><p></p>
                    ${sub.sDesc}
                    <div class="share">
                        <span>分享至</span>
                        <a href="javascript:void((function(s,d,e,r,l,p,t,z,c){var%20f='http://v.t.sina.com.cn/share/share.php?appkey=1881139527',u=z||d.location,p=['&amp;url=',e(u),'&amp;title=',e(t||d.title),'&amp;source=',e(r),'&amp;sourceUrl=',e(l),'&amp;content=',c||'gb2312','&amp;pic=',e(p||'')].join('');function%20a(){if(!window.open([f,p].join(''),'mb',['toolbar=0,status=0,resizable=1,width=440,height=430,left=',(s.width-440)/2,',top=',(s.height-430)/2].join('')))u.href=[f,p].join('');};if(/Firefox/.test(navigator.userAgent))setTimeout(a,0);else%20a();})(screen,document,encodeURIComponent,'','','http://upload.jianshu.io/collections/images/333582/886781021493292960.jpg', '推荐专题《谈笑风生》（ 分享自 @简书 ）','http://www.jianshu.com/c/5cc4460bb4a0?utm_campaign=maleskine&amp;utm_content=collection&amp;utm_medium=reader_share&amp;utm_source=weibo','页面编码gb2312|utf-8默认gb2312'));"><i
                                class="iconfont ic-share-weibo"></i></a>
                        <a data-action="weixin-share"><i class="iconfont ic-share-wechat"></i></a>
                        <a class="" href=""><i class="iconfont ic-share-more"></i></a>
                    </div>
                    <div>
                        <div><p class="title">管理员</p>
                            <ul class="list collection-editor">
                                <li><a href="/u/yZq3ZV" target="_blank" class="avatar"><img
                                        src="http://upload.jianshu.io/users/upload_avatars/259/0eeb76652869.png?imageMogr2/auto-orient/strip|imageView2/1/w/96/h/96"></a>
                                    <a href="/u/yZq3ZV" target="_blank" class="name">简书</a> <span class="tag">创建者</span>
                                </li>
                                <li><a href="/u/b91e5b946e33" target="_blank" class="avatar"><img
                                        src="http://upload.jianshu.io/users/upload_avatars/4626821/1b619ae75c68.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/96/h/96"></a>
                                    <a href="/u/b91e5b946e33" target="_blank" class="name">杨喜爱</a> <!----></li>
                                <li><!----> <!----></li>
                            </ul>
                        </div>
                        <div>
                            <div class="title">关注的人(19679)</div>
                            <ul class="list collection-follower">
                                <li><a href="/u/11783ead1212" target="_blank" class="avatar"><img
                                        src="http://upload.jianshu.io/users/upload_avatars/5015470/de909daa-7e00-4fd7-9423-26ee5e5b8d7b?imageMogr/thumbnail/90x90/quality/100"
                                        data-toggle="tooltip" data-placement="bottom" title=""
                                        data-original-title="C守护L · 几秒前 关注"></a></li>
                                <li><a href="/u/479e84bea72a" target="_blank" class="avatar"><img
                                        src="http://upload.jianshu.io/users/upload_avatars/5015458/674e0bed-0448-4f72-9c9f-1b7292a555eb?imageMogr/thumbnail/90x90/quality/100"
                                        data-toggle="tooltip" data-placement="bottom" title=""
                                        data-original-title="猴子捞了个月 · 1 分钟前 关注"></a></li>
                                <li><a href="/u/0309fd4c9154" target="_blank" class="avatar"><img
                                        src="http://cdn-qn0.jianshu.io/assets/default_avatar/9-cceda3cf5072bcdd77e8ca4f21c40998.jpg"
                                        data-toggle="tooltip" data-placement="bottom" title=""
                                        data-original-title="大罗金仙 · 1 分钟前 关注"></a></li>
                                <li><a href="/u/3263b582cd53" target="_blank" class="avatar"><img
                                        src="http://cdn-qn0.jianshu.io/assets/default_avatar/1-04bbeead395d74921af6a4e8214b4f61.jpg"
                                        data-toggle="tooltip" data-placement="bottom" title=""
                                        data-original-title="燕燕妈 · 1 分钟前 关注"></a></li>
                                <li><a href="/u/1f2799b06d08" target="_blank" class="avatar"><img
                                        src="http://cdn-qn0.jianshu.io/assets/default_avatar/2-9636b13945b9ccf345bc98d0d81074eb.jpg"
                                        data-toggle="tooltip" data-placement="bottom" title=""
                                        data-original-title="半截儿 · 2 分钟前 关注"></a></li>
                                <li><a href="/u/a7db988f6181" target="_blank" class="avatar"><img
                                        src="http://upload.jianshu.io/users/upload_avatars/5015447/5ba8cfe7-01d7-44bf-8ddb-0acf264b77f7?imageMogr/thumbnail/90x90/quality/100"
                                        data-toggle="tooltip" data-placement="bottom" title=""
                                        data-original-title="NaMio · 2 分钟前 关注"></a></li>
                                <li><a href="/u/981759a269f2" target="_blank" class="avatar"><img
                                        src="http://cdn-qn0.jianshu.io/assets/default_avatar/12-aeeea4bedf10f2a12c0d50d626951489.jpg"
                                        data-toggle="tooltip" data-placement="bottom" title=""
                                        data-original-title="果上随缘 · 2 分钟前 关注"></a></li>
                                <li><a href="/u/b170184560b8" target="_blank" class="avatar"><img
                                        src="http://upload.jianshu.io/users/upload_avatars/5015416/9f96578e-3de8-47cd-8a2a-b53a91b2d381?imageMogr/thumbnail/90x90/quality/100"
                                        data-toggle="tooltip" data-placement="bottom" title=""
                                        data-original-title="生如夏花_e75e · 3 分钟前 关注"></a></li>
                                <a class="function-btn"><i class="iconfont ic-others"></i></a> <!----></ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="side-tool">
    <ul>
        <li data-placement="left" data-toggle="tooltip" data-container="body" data-original-title="回到顶部"><a href="#"
                                                                                                            class="function-button"><i
                class="iconfont ic-backtop"></i></a></li> <!----> <!----> <!----></ul>
</div>
<script>
    var app = angular.module("subApp", []);
    app.controller("subCtrl", function ($scope, $http) {

        // todo
        // 默认加载10篇,按照最新的开始排
        $scope.num = 10;
        $http.post("/a/${sub.sId}/0/" + $scope.num)
                .success(function (response) {
                    $scope.records = response.data;
                    console.log($scope.records);
                });
        // 点击按钮添加更多文章每次加5篇
        $scope['getmore'] = getmoreFun = function (num) {
            $http.post("/a/${sub.sId}/" + num + "/5")
                    .success(function (response) {
                        angular.forEach(response.data, function (data) {
                            //data等价于array[index]
                            $scope.records.push(data);
                        });
                        console.log($scope.records);
                    });
            $scope.num += 5;
        }
    });
</script>