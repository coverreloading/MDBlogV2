<%--
  Created by IntelliJ IDEA.
  User: loadi
  Date: 2017/2/25
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container person" ng-app="uifApp" ng-controller="uifCtrl">
    <div class="row">
        <div class="col-xs-16 main">
            <div class="main-top">
                <a class="avatar" href="/u/${uif.uiUid}">
                    <img src="${uif.uiPic}"
                         alt="240">
                </a>
                <a class="btn btn-success follow"><i class="iconfont ic-follow"></i><span>关注</span></a>
                <a class="btn btn-hollow" href="/notifications#/chats/new?mail_to=1703620">发简信</a>

                <div class="title">
                    <a class="name" href="/u/${uif.uiUid}">${uif.uiNickname}</a>
                </div>
                <div class="info">
                    <ul>
                        <li>
                            <div class="meta-block">
                                <p>1</p>
                                <a href="/users/e832b926acf9/following">
                                    关注 <i class="iconfont ic-arrow"></i>
                                </a></div>
                        </li>
                        <li>
                            <div class="meta-block">
                                <p>119</p>
                                <a href="/users/e832b926acf9/followers">
                                    粉丝 <i class="iconfont ic-arrow"></i>
                                </a></div>
                        </li>
                        <li>
                            <div class="meta-block">
                                <p>33</p>
                                <a href="/u/e832b926acf9">
                                    文章 <i class="iconfont ic-arrow"></i>
                                </a></div>
                        </li>
                        <li>
                            <div class="meta-block">
                                <p>96763</p>
                                <div>字数</div>
                            </div>
                        </li>
                        <li>
                            <div class="meta-block">
                                <p>261</p>
                                <div>收获喜欢</div>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>

            <ul class="trigger-menu" data-pjax-container="#list-container">
                <li class="active"><a href="/u/e832b926acf9?order_by=shared_at"><i class="iconfont ic-articles"></i> 文章</a>
                </li>
                <li class=""><a href="/users/e832b926acf9/timeline"><i class="iconfont ic-feed"></i> 动态</a></li>
                <li class=""><a href="/u/e832b926acf9?order_by=commented_at"><i class="iconfont ic-latestcomments"></i>
                    最新评论</a></li>
                <li class=""><a href="/u/e832b926acf9?order_by=top"><i class="iconfont ic-hot"></i> 热门</a></li>
            </ul>

            <div id="list-container">
                <!-- 文章列表模块 -->
                <ul class="note-list" infinite-scroll-url="/u/e832b926acf9?order_by=shared_at">
                    <div ng-repeat="x in records">
                        <li id="note-9521426" data-note-id="9521426" class="have-img">
                            <a class="wrap-img" href="/a/{{x.raId}}" target="_blank">
                                <img src="{{x.raPic}}">
                            </a>
                            <div class="content">
                                <div class="author">
                                    <a class="avatar" target="_blank" href="/u/{{x.raUid}}">
                                        <img src="${uif.uiPic}"
                                             alt="96">
                                    </a>
                                    <div class="name">
                                        <a class="blue-link" target="_blank"
                                           href="/u/{{x.raUid}}">${uif.uiNickname}</a>
                                        <span class="time" data-shared-at="">{{ x.raCreatetime | date:'yyyy-MM-dd' }} {{ x.raCreatetime | date:'HH:mm:ss' }}</span>
                                    </div>
                                </div>
                                <a class="title" target="_blank" href="/a/{{x.raId}}">{{x.raTitle}}</a>
                                <p class="abstract">
                                    {{x.raDesc}}
                                </p>
                                <div class="meta">
                                    <a target="_blank" href="/a/{{x.raId}}">
                                        <i class="iconfont ic-list-read"></i> {{x.raRead}}
                                    </a> <a hidden="hidden" target="_blank" href="/a/{{x.raId}}">
                                    <i class="iconfont ic-list-comments"></i> 1
                                </a> <span><i class="iconfont ic-list-like"></i> {{x.raLike}}</span>
                                </div>
                            </div>
                        </li>
                    </div>
                    <button class="btn load-more" style="margin-bottom:100px;" ng-click="getmore(num)">点击加载更多</button>
                </ul>

            </div>
        </div>

        <div class="col-xs-7 col-xs-offset-1 aside">
            <div class="title">个人介绍</div>
            <div class="description">
                <div class="js-intro">${uif.uiDesc}</div>

                <a class="social-icon-sprite social-icon-weixin" data-toggle="popover" data-placement="bottom"
                   data-html="true" data-trigger="hover" href="javascript:void(0);" data-content="
  <div class=&quot;qrcode&quot;>
    <div class=&quot;arrow-top&quot;></div>
    <img thumbnail=&quot;320x320&quot; quality=&quot;100&quot; src=&quot;http://upload.jianshu.io/users/qrcodes/1703620/qrcode_for_gh_93e899e5f701_430.jpg?imageMogr/thumbnail/320x320/quality/100&quot; alt=&quot;Qrcode for gh 93e899e5f701 430&quot; />
  </div>
" data-original-title="" title=""></a>

            </div>
            <ul class="list user-dynamic">
                <li>
                    <a href="/users/e832b926acf9/subscriptions">
                        <i class="iconfont ic-collection"></i> <span>他关注的专题/文集</span>
                    </a>
                </li>
                <li>
                    <a href="/users/e832b926acf9/liked_notes">
                        <i class="iconfont ic-like"></i> <span>他喜欢的文章</span>
                    </a>
                </li>
            </ul>
            <!-- 专题和文集 -->
            <div>
                <div><!----> <!----></div> <!---->
                <div>
                    <div class="title">他的文集</div>
                    <ul class="list">
                        <li><a href="/nb/3487945" target="_blank"><i class="iconfont ic-search-notebook"></i></a> <a
                                href="/nb/3487945" target="_blank" class="name">随笔</a></li>
                        <li><a href="/nb/4259603" target="_blank"><i class="iconfont ic-search-notebook"></i></a> <a
                                href="/nb/4259603" target="_blank" class="name">古代史</a></li>
                        <li><a href="/nb/4259614" target="_blank"><i class="iconfont ic-search-notebook"></i></a> <a
                                href="/nb/4259614" target="_blank" class="name">说事儿</a></li>
                        <li><a href="/nb/4259626" target="_blank"><i class="iconfont ic-search-notebook"></i></a> <a
                                href="/nb/4259626" target="_blank" class="name">戏言</a></li>
                        <li><!----> <!----></li>
                    </ul>
                </div>
            </div>
            <div class="user-action">
                <a class="js-block-button" data-user-id="1703620" href="javascript:void(null);">加入黑名单</a>
                ·
                <a class="js-report-button" data-reportable-id="1703620" data-reportable-type="user">举报用户</a>
            </div>
        </div>
    </div>
</div>
<script>
    var app = angular.module("uifApp", []);
    app.controller("uifCtrl", function ($scope, $http) {

        // 默认加载10篇,按照最新的开始排
        $scope.num = 10;
        $http.post("/a/hot/${uif.uiUid}/0/10")
                .success(function (response) {
                    $scope.records = response.data;
                    console.log($scope.records);
                });
        // 点击按钮添加更多文章每次加5篇
        $scope['getmore'] = getmoreFun = function (num) {
            $http.post("/a/hot/${uif.uiUid}/"+num+"/5")
                    .success(function (response) {
                        angular.forEach(response.data, function(data){
                            //data等价于array[index]
                            $scope.records.push(data);
                        });
                        console.log($scope.records);
                    });
            $scope.num += 5;
        }
    });
</script>