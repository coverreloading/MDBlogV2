<%--
  Created by IntelliJ IDEA.
  User: Vincent
  Date: 16/10/28
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title id="page-title">文章</title>
    <script src="${request.getContextPath()}/js/jquery.min.js"></script>
    <%--<link href="${request.getContextPath()}/css/bootstrap.min.css" rel='stylesheet' type='text/css'/>--%>
    <script src="${request.getContextPath()}/js/bootstrap.min.js"></script>
    <script src="${request.getContextPath()}/js/angular.min.js"></script>
    <link rel="stylesheet" href="${request.getContextPath()}/layui/css/layui.css">
    <script src="${request.getContextPath()}/layui/layui.js"></script>
    <script src="${request.getContextPath()}/layui/lay/dest/layui.all.js"></script>
    <%-- sweetalert --%>
    <script src="${request.getContextPath()}/js/sweetalert.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/sweetalert.css">
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/mymdstyle.css">
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jianshucss/base.css">
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jianshucss/base-read-mode.css">
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jianshucss/reading-note.css">


</head>
<body>
<body ng-app="indexApp" ng-controller="indexCtrl">
<div style="position: relative;">
    <div id="left-bar" style="background-color: black;width:10%;float: left;">
        <ul class="layui-nav layui-nav-tree layui-nav-side" id="L_demoNav2" style="display: block;width: 10%;margin:0;">
            <li class="layui-nav-item">
                <a href="">MDBlog</a>
            </li>
            <li class="layui-nav-item layui-this">
                <a href="" ng-click="subjectManage()">首页</a>
            </li>
            <li class="layui-nav-item">
                <a href="" ng-click="userManage()">专题</a>
            </li>
            <li class="layui-nav-item">
                <a href="" ng-click="messageManage()">简友圈</a>
            </li>
            <li class="layui-nav-item">
                <a href="" ng-click="tipsManage">写文章</a>
            </li>
            <!--<li class="layui-nav-item"><a href="javascript:;" onclick="L_demoNav2.style.display='none';">关闭该导航演示</a></li>-->
            <span class="layui-nav-bar" style="top: 22.5px; height: 0px; opacity: 0;"></span></ul>
        <!--<button class="layui-btn layui-btn-normal" onclick="L_demoNav2.style.display='block'; L_demoNav2.className='layui-nav layui-nav-tree layui-nav-side';">显示侧边导航示例</button>-->
    </div>
    <div id="left-bar2" style="background-color: cornflowerblue;width:20%; position: fixed;left: 10%;;overflow: hidden">
        <img id="left-bar2-img" src="">
    </div>
    <div id="top-bar" style="background-color: #00AAAA;width:70%;height: 55px; float: left;position: absolute;right: 0px;">
        <div id="user-btn" style="background-color: #008800; width:41px;height: 41px;float: right;margin: 6px;">
            <button id="testbtn" class="layui-btn layui-btn-small" style="width: 100%;height: 100%;"><i
                    class="layui-icon"></i></button>
        </div>
    </div>
    <div id="main-bar" style="background-color: #ffffff;width:70%;position:relative;top:55px;left: 30%;">
        <div id="article-area" style="width:90%; position: absolute; left: 5%;">
            <jsp:include page="articleArea.jsp"/>
            <br>
        </div>
    </div>
</div>
</body>
</body>
</html>

<script>
    $(document).ready(function () {
//        var winowHeight = document.documentElement.clientHeight;
        var winowHeight = document.body.clientHeight ;
//        alert(winowHeight);
//        $("#left-bar").css("height", winowHeight);
        $("#left-bar2").css("height", winowHeight);
        $('#left-bar2-img').attr("src", "${request.getContextPath()}/img/bing/" + parseInt(8 * Math.random()) + ".jpg");
        $('#left-bar2-img').css("max-width","none");
//        $("#test").attr("style",{"display":"none"});
        $("#left-bar2-img").css("height", winowHeight);
        $("#main-bar").css("height", winowHeight - 55);
    });
    var app = angular.module("indexApp", []);
    app.controller("indexCtrl", function ($scope, $http, $location) {

        $scope.nglocation = $location.absUrl();
        <%--if ($location.absUrl() == '${basepath}') {--%>
            <%--// getArticle--%>
            <%--$http({--%>
                <%--method: 'POST',--%>
                <%--url: '${request.getContextPath()}/a/get/${RaId}',--%>
                <%--headers: {'Content-Type': 'application/x-www-form-urlencoded'}--%>
            <%--})--%>
                    <%--.success(function (data) {--%>
                        <%--console.log(data);--%>
                        <%--if (data.status == 200) {--%>
                            <%--$scope.article = data.data;--%>
                            <%--$('#raText').value(data.data.raText);--%>

                        <%--} else {--%>

                        <%--}--%>
                    <%--});--%>
        <%--}--%>


        // newSubject页面方法
        $scope['setRedis'] = setRedisFun = function () {
            $http({
                method: 'POST',
                url: '${request.getContextPath()}/a/get/${RaId}',
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            })
                    .success(function (data) {
                        console.log(data);
                        if (data.status == 200) {

                        } else {

                        }
                    });
        }
    })
</script>