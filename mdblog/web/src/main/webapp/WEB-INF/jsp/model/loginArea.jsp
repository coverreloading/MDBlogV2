<%--
  Created by IntelliJ IDEA.
  User: loadi
  Date: 2017/3/3
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="sign" ng-app="registApp" ng-controller="resgistCtrl">
    <div hidden  class="well"
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
    <div class="main">
        <h4 class="title">
            <div class="normal-title">
                <a class="active" href="/login">登录</a>
                <b>·</b>
                <a id="js-sign-up-btn" class="" href="/register">注册</a>
            </div>
        </h4>
        <div class="js-sign-in-container">
            <form  accept-charset="UTF-8" method="post"ng-submit="formSub()">
                <div class="input-prepend restyle js-normal ">
                    <input placeholder="手机号或邮箱" type="text"  name="email" ng-model="email" >
                    <i class="iconfont ic-user"></i>
                </div>
                <div class="input-prepend">
                    <input placeholder="密码" type="password" name="password" ng-model="password" >
                    <i class="iconfont ic-password"></i>
                </div>

                <div class="remember-btn">
                    <input type="checkbox" value="true" checked="checked" name=""
                           id="remember_me"><span>记住我</span>
                </div>
                <div class="forget-btn">
                    <a class="" data-toggle="dropdown" href="">登录遇到问题?</a>
                    <ul class="dropdown-menu">
                        <li><a href="/users/password/mobile_reset">用手机号重置密码</a></li>
                        <li><a href="/users/password/email_reset">用邮箱重置密码</a></li>
                        <li><a target="_blank" href="/p/9058d0b8711d">无法用海外手机号登录</a></li>
                        <li><a target="_blank" href="/p/498a9fa7da08">无法用 Google 帐号登录</a></li>
                    </ul>
                </div>
                <input type="submit"  value="登录" class="sign-in-button">
            </form>
            <!-- 手机验证码登录modal -->

            <!-- 更多登录方式 -->
            <div class="more-sign">
                <h6>社交帐号登录</h6>
                <ul>
                    <li><a class="weibo" href="/users/auth/weibo"><i class="iconfont ic-weibo"></i></a></li>
                    <li><a class="weixin" href="/users/auth/wechat"><i class="iconfont ic-wechat"></i></a></li>
                    <li><a class="qq" href="/users/auth/qq_connect"><i class="iconfont ic-qq_connect"></i></a></li>
                    <li class="js-more-method"><a href="javascript:void(0);"><i class="iconfont ic-more"></i></a>
                    </li>
                    <li class="js-hide-method hide"><a class="douban" href="/users/auth/douban"><i
                            class="iconfont ic-douban"></i></a></li>
                </ul>

            </div>
        </div>

    </div>
</div>

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
                                $window.location.href = '${request.getContextPath()}/';
                            }, 2000);
                            /*
                             swal({
                             title: "登录成功",
                             text: "恭喜你，成功登陆MD Blog",
                             type: "success",
                             showCancelButton: false,
                             confirmButtonColor: "#aedef4",
                             confirmButtonText: "跳转到首页",
                             closeOnConfirm: false
                             }, function () {
                             $window.location.href = '
                            <%--${request.getContextPath()}/';--%>
                             });
                             */
                            $window.location.href = '${request.getContextPath()}/';

                        } else {
                            swal("登录失败", data.msg, "error");
                        }
                    });
        }
    });
</script>
