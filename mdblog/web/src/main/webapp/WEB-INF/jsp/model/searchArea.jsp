<%--
  Created by IntelliJ IDEA.
  User: loadi
  Date: 2017/3/18
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script>
    var app = angular.module('searchApp', []);
    app.config(['$locationProvider', function ($locationProvider) {
        // $locationProvider.html5Mode(true);
        $locationProvider.html5Mode({
            enabled: true,
            requireBase: false
        });
    }]);
    app.controller('searchCtrl', function ($scope, $http, $location) {
        $('#q').val($location.search().query);
        $scope.getmore = true;
        $scope.num = 1;
        $http.post("/search/param?query=" + $location.search().query + "&page=" + $scope.num + "&row=10")
                .success(function (response) {
                    $scope.records = response.itemList;
                    $scope.recordCount = response.recordCount;
                    console.log(response.itemList);
                    if (response.itemList.length < 10) {
                        $scope.getmore = false;
                    }
                });
        // 点击按钮添加更多文章
        $scope['getmore'] = getmoreFun = function (num) {
            $scope.num += 1;
            $http.post("/search/param?query=" + $location.search().query + "&page=" + $scope.num + "&row=10")
                    .success(function (response) {
                        if (response.itemList.length < 5) {
                            $scope.getmore = false;
                        }
                        angular.forEach(response.itemList, function (data, index, array) {
                            //data等价于array[index]
                            $scope.records.push(data);
                        });
                        console.log($scope.records);
                    });
        };
    });
</script>
<div ng-app="searchApp" ng-controller="searchCtrl" class="container search">
    <div class="row">
        <div class="col-xs-16 main" style="margin-left: 20%;margin-top: 50px;">

            <div class="search-content">

                <div class="result">{{recordCount}} 个结果</div>
                <br/>
                <ul ng-repeat="x in records" class="note-list">
                    <li>
                        <div class="content">
                            <div class="author"><a href="/uinfo/u/{{x.uI_UID}}" target="_blank" class="avatar"><img
                                    src="{{x.uI_Pic}}"></a>
                                <div class="name"><a href="/uinfo/u/{{x.uI_UID}}">{{x.uI_Nickname}}</a> <span
                                        class="time">
          </span></div>
                            </div>
                            <a href="/a/{{x.rA_ID}}" target="_blank" class="title">{{x.rA_Title}}</a>
                            <p class="abstract" style="text-overflow : clip;">
                                {{x.rA_Text}}
                            </p>
                            <div class="meta"><a href="/a/{{x.rA_ID}}" target="_blank"><i class="iconfont ic-list-read"></i> {{x.rA_Read}} </a>
                                <a hidden href="/p/ca185fff7ccb#comments" target="_blank"><i class="iconfont ic-list-comments"></i> 30 </a>
                                <span><i class="iconfont ic-list-like"></i> {{x.rA_Like}} </span>
                                <span hidden><i class="iconfont ic-list-money"></i> 1 </span>
                            </div>
                        </div>
                    </li>
                </ul> <!----> <!----> <!---->
                <button ng-show="getmore" class="btn load-more" style="margin-bottom:100px;" ng-click="getmore(num)">
                    点击加载更多
                </button>
            </div>
        </div>
    </div>
</div>
