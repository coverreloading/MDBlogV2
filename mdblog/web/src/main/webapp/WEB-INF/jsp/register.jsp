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
    <title>注册-MdBlog</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${request.getContextPath()}/css/bootstrap.min.css">
    <script src="${request.getContextPath()}/js/jquery.min.js"></script>
    <script src="${request.getContextPath()}/js/bootstrap.min.js"></script>
    <script src="${request.getContextPath()}/js/angular.min.js"></script>
<%-- sweetalert --%>
    <script src="${request.getContextPath()}/js/sweetalert.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/sweetalert.css">
</head>
<body>
<div ng-app="registApp" ng-controller="resgistCtrl" class="well"
     style="max-width: 400px; margin: 0 auto 10px; margin-top: 150px">
    <h1 align="center">MD Blog 注册</h1>
    <form ng-submit="formSub()">
        <div class="form-group">
            <h3>邮箱</h3><input class="form-control bg-info " type="email" name="email" ng-model="email"ng-blur="emailCheck()">
            <span id="emailCheckSuccessMsg" hidden="hidden" style="color: green" >可以使用该邮箱</span>
            <span id="emailCheckfailMsg" hidden="hidden" style="color: red">该邮箱已被注册</span>
        </div>
        <div class="form-group">
            <h3>密码</h3><input id="psw1" class="form-control bg-info " name="password" type="password" ng-model="password"onchange="passwordcheck()">
        </div>
        <div class="form-group">
            <h3>密码</h3><input id="psw2" class="form-control bg-info " type="password" ng-model="user.passwordCheck"onchange="passwordcheck()">
            <span id="pswCheck" hidden="hidden" style="color: red">密码不一致</span>
        </div>
        <button id="registBtn" disabled="disabled" class="btn btn-info btn-block btn-lg" ng-click="regist()">注册</button>
        <div style="padding-top: 15px; padding-bottom: 20px;">
            <a class="pull-left" href="${request.getContextPath()}/login"><h5>登录</h5></a>
        </div>
    </form>
    {{msg}}
</div>

</body>
<script>
    var passwordcheck=function () {
        if($('#psw1').val()==$('#psw2').val())
        {
            $('#pswCheck').hide();
            $('#registBtn').removeAttr('disabled');
        }else{
            $('#pswCheck').show();
            $('#registBtn').attr("disabled","disabled");
        };
    }
    var app = angular.module("registApp", []);
    app.controller("resgistCtrl", function ($scope, $http, $timeout, $window) {
        // 注册提交函数
        $scope['regist'] = function () {
            $http({
                method: 'POST',
                url: '${request.getContextPath()}/user/regist',
                data: "uEmail=" + $scope.email + "&uPassword=" + $scope.password,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            })
                    .success(function (data) {
                        console.log(data);
                        if (data.status == 200) {
                            $timeout(function () {
                                $window.location.href = '${request.getContextPath()}/login';
                            }, 2000);
                            swal({
                                title: "注册成功",
                                text: "恭喜你，成功MD BLog的新成员,正在跳转到登录页",
                                type: "success",
                                showCancelButton: false,
                                confirmButtonColor: "#aedef4",
                                confirmButtonText: "跳转到登录页",
                                closeOnConfirm: false
                            }, function () {
                                $window.location.href = '${request.getContextPath()}/login';
                            });
                        } else {
                            swal("恭喜你", "搞事失败", "error");
                        }
                    });
        }
        // 邮箱重名验证函数
        $scope['emailCheck'] = function () {
            $http({
                method: 'POST',
                url: '${request.getContextPath()}/user/check/'+$scope.email+"/2",
                data: "",
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            })
                    .success(function (data) {
                        console.log(data);
                        if (data.status == 200) {
                            $('#emailCheckSuccessMsg').show();
                            $('#emailCheckfailMsg').hide();
                            $('#registBtn').removeAttr('disabled');
                            $timeout(2000);
                            $('#emailCheckSuccessMsg').fadeOut(2000);
                        } else {
                            $('#emailCheckfailMsg').show();
                            $('#emailCheckSuccessMsg').hide();
                            $('#registBtn').attr("disabled","disabled");
                        }
                    });
        }
    });
</script>
</html>
