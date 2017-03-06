<%--
  Created by IntelliJ IDEA.
  User: loadi
  Date: 2017/3/3
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div hidden class="well"
     style="max-width: 400px; margin: 0 auto 10px; margin-top: 150px">
    <h1 align="center">MD Blog 注册</h1>
    <form ng-submit="formSub()">
        <div class="form-group">
            <h3>邮箱</h3><input class="form-control bg-info " type="email" name="email" ng-model="email" ng-blur="emailCheck()">
            <span id="emailCheckSuccessMsg1" hidden="hidden" style="color: green" >可以使用该邮箱</span>
            <span id="emailCheckfailMsg1" hidden="hidden" style="color: red">该邮箱已被注册</span>
        </div>
        <div class="form-group">
            <h3>密码</h3><input id="psw11" class="form-control bg-info " name="password" type="password" ng-model="password"onchange="passwordcheck()">
        </div>
        <div class="form-group">
            <h3>密码</h3><input id="psw22" class="form-control bg-info " type="password" ng-model="user.passwordCheck"onchange="passwordcheck()">
            <span id="pswCheck" hidden="hidden" style="color: red">密码不一致</span>
        </div>
        <button id="registBtn1" disabled="disabled" class="btn btn-info btn-block btn-lg" ng-click="regist()">注册</button>
        <div style="padding-top: 15px; padding-bottom: 20px;">
            <a class="pull-left" href="${request.getContextPath()}/login"><h5>登录</h5></a>
        </div>
    </form>
    {{msg}}
</div>



<div ng-app="registApp" ng-controller="resgistCtrl" class="sign">
    <div class="main">
        <h4 class="title">
            <div class="normal-title">
                <a class="" href="/login">登录</a>
                <b>·</b>
                <a id="js-sign-up-btn" class="active" href="/register">注册</a>
            </div>
        </h4>
        <div class="js-sign-up-container">
            <form class="new_user"  accept-charset="UTF-8" ng-submit="formSub()">
                <span id="emailCheckSuccessMsg" hidden style="color: green" >可以使用该邮箱</span>
                <span id="emailCheckfailMsg" hidden="hidden" style="color: red">该邮箱已被注册</span>
                <div class="input-prepend restyle">
                    <input placeholder="你的邮箱"  type="email" name="email" ng-model="email"ng-blur="emailCheck()">
                    <i class="iconfont ic-user"></i>
                </div>
                <input type="hidden" name="security_number" id="security_number">
                <div class="input-prepend">
                    <input placeholder="设置密码"  id="psw1" name="password" type="password" ng-model="password"onchange="passwordcheck()">
                    <i class="iconfont ic-password"></i>
                    <input placeholder="确认密码"  id="psw2" name="password" type="password" onchange="passwordcheck()">
                    <i class="iconfont ic-password"></i>
                </div>
                <button id="registBtn" disabled="disabled" class="btn btn-info btn-block btn-lg" ng-click="regist()">注册</button>
                <%--<button id="registBtn2" disabled="disabled" class="sign-up-button" ng-click="regist()">注册</button>--%>
                <p class="sign-up-msg">点击 “注册” 即表示您同意并愿意遵守<br> <a target="_blank" href="http://www.jianshu.com/p/c44d171298ce">用户协议</a> 和 <a target="_blank" href="http://www.jianshu.com/p/2ov8x3">隐私政策</a> 。</p>
            </form>
            <!-- 更多注册方式 -->
            <div class="more-sign">
                <h6>社交帐号直接注册</h6>
                <ul>
                    <li><a class="weibo" href="/users/auth/weibo"><i class="iconfont ic-weibo"></i></a></li>
                    <li><a class="weixin" href="/users/auth/wechat"><i class="iconfont ic-wechat"></i></a></li>
                    <li><a class="qq" href="/users/auth/qq_connect"><i class="iconfont ic-qq_connect"></i></a></li>
                </ul>

            </div>
        </div>

    </div>
</div>

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