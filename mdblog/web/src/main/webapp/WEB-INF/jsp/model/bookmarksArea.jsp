<%--
  Created by IntelliJ IDEA.
  User: loadi
  Date: 2017/3/1
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container bookmarks" id="js-page-top" ng-app="bookmarkApp" ng-controller="bookmarkCtrl">
    <div class="row">
        <div class="col-xs-18 col-xs-offset-3 main">
            <img class="tag-banner" src="/img/collect-note.png" alt="Collect note">
            <!-- 文章列表模块 -->
            <ul class="note-list">
                <div ng-repeat=" x in records">
                    <li id="note-7714031" data-note-id="7714031" class="have-img">
                        <a class="wrap-img" href="/a/{{ra.raId}}" target="_blank">
                            <img src="{{x.raPic}}">
                        </a>
                        <div class="content">
                            <div class="author">
                                <a class="avatar" target="_blank" href="/uinfo/u/{{x.raUid}}">
                                    <img src="${uif.uiPic}"
                                         alt="96">
                                </a>
                                <div class="name">
                                    <a class="blue-link" target="_blank"
                                       href="/uinfo/u/{{x.raUid}}">${uif.uiNickname}</a>
                                    <span class="time"
                                          data-shared-at="">{{ x.raCreatetime | date:'yyyy-MM-dd' }} {{ x.raCreatetime | date:'HH:mm:ss' }}</span>
                                </div>
                            </div>
                            <a class="title" target="_blank" href="/a/{{x.raId}}">{{x.raTitle}}</a>
                            <p class="abstract">
                                {{x.raDesc}}
                            </p>
                            <div class="meta">
                                <a target="_blank" href="/a/{{ra.raId}}">
                                    <i class="iconfont ic-list-read"></i> {{x.raRead}}
                                </a>
                                <a hidden="hidden" target="_blank" href="/a/{{ra.raId}}">
                                    <i class="iconfont ic-list-comments"></i> 4
                                </a>
                                <span><i class="iconfont ic-list-like"></i> {{x.raLike}}</span>
                                <%--<a  class="cancel">取消收藏</a>--%>
                            </div>
                        </div>
                    </li>
                </div>
                <button class="btn load-more" style="margin-bottom:100px;" ng-click="getmore(num)">点击加载更多</button>
            </ul>
        </div>
    </div>
    <div>
        <!---->
    </div>
    <div class="side-tool">
        <ul>
            <li data-placement="left" data-toggle="tooltip" data-container="body" data-original-title="回到顶部"
                style="display: none;"><a href="#" class="function-button"><i class="iconfont ic-backtop"></i></a></li>
            <!----> <!----> <!----></ul>
    </div>
</div>
<script>
    var app = angular.module("bookmarkApp", []);
    app.controller("bookmarkCtrl", function ($scope, $http) {

        // 默认加载5篇,按照最新的开始排
        $scope.num = 5;
        $http({
            url: "/bookmarks/0/5",
            method: 'POST',
            params: {token: '${token}'},
            headers: {'Content-Type': 'application/x-www-form-urlencoded'}
        }).success(function (response) {
            // 回调函数
            $scope.records = response.data;
            console.log($scope.records);
        })

        // 点击按钮添加更多文章每次加5篇
        $scope['getmore'] = getmoreFun = function (num) {
            $http({
                url: "/bookmarks/" + num + "/5",
                method: 'POST',
                params: {token: '${token}'},
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function (response) {
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