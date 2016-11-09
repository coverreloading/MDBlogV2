<%--
  Created by IntelliJ IDEA.
  User: Vincent
  Date: 16/9/17
  Time: 上午12:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <link rel="stylesheet" href="${request.getContextPath()}/css/bootstrap.min.css">
    <script src="${request.getContextPath()}/js/jquery.min.js"></script>
    <script src="${request.getContextPath()}/js/bootstrap.min.js"></script>
    <script src="${request.getContextPath()}/js/angular.min.js"></script>

    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <script src="${request.getContextPath()}/js/jquery.min.js"></script>
    <script src="${request.getContextPath()}/js/bootstrap.min.js"></script>
    <script src="${request.getContextPath()}/js/angular.min.js"></script>
    <%-- sweetalert --%>
    <script src="${request.getContextPath()}/js/sweetalert.min.js"></script>
    <%-- Tagit --%>

    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/sweetalert.css">

    <title>登录</title>
</head>
<body>
<div ng-app="registApp" ng-controller="resgistCtrl" class="well"
     style="max-width: 400px; margin: 0 auto 10px; margin-top: 150px">
    <h1 align="center">MD Blog登录</h1>
    <form ng-submit="formSub()">
        <div class="form-group">
            <h3>邮箱</h3><input class="form-control bg-info " type="email" name="email" ng-model="email">
        </div>
        <div class="form-group">
            <h3>密码</h3><input class="form-control bg-info " type="password" name="password" ng-model="password">
        </div>
        <button class="btn btn-info btn-block btn-lg" type="submit">登录</button>
        <div style="padding-top: 15px; padding-bottom: 20px;">
            <a class="pull-left " onclick="resetPassword()"><h5>忘记密码</h5></a>
            <a class="pull-right" href="${request.getContextPath()}/register"><h5>注册</h5></a>
        </div>
    </form>
</div>
</body>
<script>
    function resetPassword() {
        swal("忘了就忘了", "关我嗨事", "error");
    }
</script>
<script>
    var app = angular.module("registApp", []);
    app.controller("resgistCtrl", function ($scope, $http, $timeout, $window) {

        $scope.formSub = function () {
            $http({
                method: 'POST',
                url: '${request.getContextPath()}/user/login',
                data: "email=" + $scope.email + "&password=" + $scope.password,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            })
                    .success(function (data) {
                        console.log(data);
                        if (data.status == 200) {
//                            $scope.msg = "登录成功,跳转到主页";
                            $timeout(function () {
                                $window.location.href = '${request.getContextPath()}/main';
                            }, 2000);
                            swal({
                                title: "登录成功",
                                text: "恭喜你，成功登陆MD Blog",
                                type: "success",
                                showCancelButton: false,
                                confirmButtonColor: "#aedef4",
                                confirmButtonText: "跳转到首页",
                                closeOnConfirm: false
                            }, function () {
                                $window.location.href = '${request.getContextPath()}/main';
                            });


                        } else {
                            swal("登录失败", data.msg, "error");
                        }
                    });
        }
    });
</script>
</html>
