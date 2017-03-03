<%--
  Created by IntelliJ IDEA.
  User: loadi
  Date: 2017/3/1
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
    <div class="container subscription" ng-app="followApp" ng-controller="followCtrl">
        <div class="row">
            <div class="aside"><a data-toggle="dropdown" class="change-type">全部关注<i class="iconfont ic-filter"></i></a>
                <ul class="dropdown-menu arrow-top">
                    <li><a>全部关注</a></li>
                    <li><a>只看作者</a></li>
                    <li><a>只看专题</a></li>
                    <li><a>只看文集</a></li>
                    <li><a>只看推送更新</a></li>
                </ul>
                <a hidden href="#/recommendation" class="add-people"><i class="iconfont ic-addpeople"></i>
                    <span>添加关注</span></a>
                <ul class="js-subscription-list">
                    <div ng-repeat="x in followRecords">
                        <li class="">
                            <a ng-click="getuif(x.ulUid2)" href="#litop" class="wrap">
                                <div class="avatar"><img src="{{x.ulPic}}"></div>
                                <div class="name">{{x.ulNickname}}</div> <!---->
                            </a>
                        </li>
                    </div>
                </ul> <!----> <!----></div>
            <div class="col-xs-16 col-xs-offset-8 main">
                <div>
                    <ul class="note-list" >
                        <div id="litop"></div>
                        <div ng-repeat="x in records">
                            <li class="have-img"><a href="" target="_blank" class="wrap-img">
                                <img src="{{uif.uiPic}}"></a>
                                <div class="content">
                                    <div class="author"><a href="/uinfo/u/{{uif.uiUid}}" target="_blank" class="avatar"><img
                                            src="{{uif.uiPic}}"></a>
                                        <div class="name"><a href="/uinfo/u/{{uif.uiUid}}" target="_blank">{{uif.uiNickname}}</a><span>发布了文章 · {{ x.raCreatetime | date:'yyyy-MM-dd' }} {{ x.raCreatetime | date:'HH:mm:ss' }}</span>
                                        </div>
                                    </div>
                                    <a href="/a/{{x.raId}}" target="_blank" class="title">{{x.raTitle}}</a>
                                    <p class="abstract">{{x.raDesc}}</p>
                                    <div class="meta">
                                        <div class="origin-author"><a href="/uinfo/u/{{uif.uiUid}}" target="_blank">{{uif.uiNickname}}</a> </div>
                                        <a href="" target="_blank"><i class="iconfont ic-list-read"> </i> {{x.raRead}}</a>
                                        <a hidden href="/p/d0fec78f4333#comments" target="_blank"> <i class="iconfont ic-list-comments"></i> 16</a>
                                        <span><i class="iconfont ic-list-like"></i> {{x.raLike}}</span>
                                        <span hidden><i class="iconfont ic-list-money"></i> 5</span>
                                    </div>
                                </div>
                            </li>
                        </div>
                        <a class="load-more" ng-click="getmore(num,uid)">加载更多</a>
                    </ul> <!---->
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    var app = angular.module("followApp", []);
    app.controller("followCtrl", function ($scope, $http) {
        //获取关注用户列表
        $http({
            url: "/follow/getAll",
            method: 'POST',
            params: {token: '${token}'},
            headers: {'Content-Type': 'application/x-www-form-urlencoded'}
        }).success(function (response) {
            // 回调函数
            $scope.followRecords = response.data;
            console.log($scope.records);
        });
        // 获取用户信息以及对应文章
        $scope['getuif'] = getuifFun = function (uid) {
            // 初始化  默认加载5篇,按照最新的开始排
            $scope.num = 5;
            $scope.uid = uid;
            //  获取用户文章
            $http({
                url: "/uinfo/u",
                method: 'POST',
                params: {uid: uid},
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function (response) {
                // 回调函数
                $scope.uif = response.data;
                console.log("用户信息:" + $scope.uif);
            });
            $http({
                url: "/a/hot/" + uid + "/0/" + $scope.num,
                method: 'POST',
                params: {uid: uid},
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            }).success(function (response) {
                // 回调函数
                $scope.records = response.data;
                console.log("文章列表:" + $scope.records);
            })
        };

        // 点击按钮添加更多文章每次加5篇
        $scope['getmore'] = getmoreFun = function (num,uid) {
            $http({
                url: "/a/hot/" + uid +"/"+ num + "/5",
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