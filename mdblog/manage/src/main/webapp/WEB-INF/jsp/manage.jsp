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
    <title>管理</title>
    <script src="${request.getContextPath()}/js/jquery.min.js"></script>
    <link href="${request.getContextPath()}/css/bootstrap.min.css" rel='stylesheet' type='text/css'/>
    <script src="${request.getContextPath()}/js/bootstrap.min.js"></script>
    <script src="${request.getContextPath()}/js/angular.min.js"></script>
    <link rel="stylesheet" href="${request.getContextPath()}/layui/css/layui.css">
    <script src="${request.getContextPath()}/layui/layui.js"></script>
    <script src="${request.getContextPath()}/layui/lay/dest/layui.all.js"></script>
    <%-- sweetalert --%>
    <script src="${request.getContextPath()}/js/sweetalert.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/sweetalert.css">

    <%--bootstrap table组件以及中文包的引用--%>
    <script src="${request.getContextPath()}/bootstrap-table/bootstrap-table.js"></script>
    <link href="${request.getContextPath()}/bootstrap-table/bootstrap-table.css" rel="stylesheet" />
    <script src="${request.getContextPath()}/bootstrap-table/bootstrap-table-zh-CN.js"></script>

    <%--页面Js文件的引用--%>

</head>
<body>
<body ng-app="indexApp" ng-controller="indexCtrl">
<div>
    <div id="left-bar" style="background-color: black;width:10%;float: left;">
        <ul class="layui-nav layui-nav-tree layui-nav-side" id="L_demoNav2" style="display: block;width: 10%;">
            <li class="layui-nav-item">
                <a href="">管理</a>
            </li>
            <li class="layui-nav-item layui-this">
                <a href="" ng-click="subjectManage()">专题管理</a>
            </li>
            <li class="layui-nav-item">
                <a href="" ng-click="userManage()">用户管理</a>
            </li>
            <li class="layui-nav-item">
                <a href="" ng-click="messageManage()">通知管理</a>
            </li>
            <li class="layui-nav-item">
                <a href="" ng-click="tipsManage">标签库查看</a>
            </li>
            <!--<li class="layui-nav-item"><a href="javascript:;" onclick="L_demoNav2.style.display='none';">关闭该导航演示</a></li>-->
            <span class="layui-nav-bar" style="top: 22.5px; height: 0px; opacity: 0;"></span></ul>
        <!--<button class="layui-btn layui-btn-normal" onclick="L_demoNav2.style.display='block'; L_demoNav2.className='layui-nav layui-nav-tree layui-nav-side';">显示侧边导航示例</button>-->
    </div>
    <div id="left-bar2" style="background-color: cornflowerblue;width:20%;margin-left:10%; float: left;">
        <img id="left-bar2-img" src="">
    </div>
    <div id="top-bar" style="background-color: #00AAAA;width:70%;height: 55px; float: left;position: relative;">
        <div id="user-btn" style="background-color: #008800; width:41px;height: 41px;float: right;margin: 6px;">
            <button id="testbtn" class="layui-btn layui-btn-small" style="width: 100%;height: 100%;"><i
                    class="layui-icon"></i></button>
        </div>
    </div>
    <div id="main-bar" style="background-color: #ffffff;width:70%;float: left;">
        <div>
            <div class="layui-tab layui-tab-brief" lay-filter="docDemoTabBrief"
                 style="background-color: #ffffff;margin: 0px ">
                <ul class="layui-tab-title">
                    <li class="layui-this">新增专题</li>
                    <li>专题管理</li>
                </ul>
                <div id="subject-tab-item" class="layui-tab-content" style="height: 100px;overflow-y: auto;overflow-x: hidden">
                    <div class="layui-tab-item layui-show">
                        <jsp:include page="newSubject.jsp"></jsp:include>
                    </div>
                    <div class="layui-tab-item">
                        <jsp:include page="showSubject.jsp"></jsp:include>
                    </div>
                </div>
            </div>
            <script>
                layui.use('element', function () {
                    var element = layui.element(); //Tab的切换功能，切换事件监听等，需要依赖element模块

                });
            </script>
        </div>
        <div id="subject" hidden="hidden">
            <div id="demo2"></div>
        </div>

    </div>
</div>
</body>
</body>
</html>

<script>
    $(document).ready(function () {
        var winowHeight = document.documentElement.clientHeight;
//        $("#left-bar").css("height", winowHeight);
        $("#left-bar2").css("height", winowHeight);
        $("#left-bar2-img").css("height", winowHeight);
        $("#main-bar").css("height", winowHeight - 55);
        $("#subject-tab-item").css("height", winowHeight - 98);
        $('#left-bar2-img').attr("src", "${request.getContextPath()}/img/bing/" + parseInt(8 * Math.random()) + ".jpg");
    });
    var app = angular.module("indexApp", []);
    app.controller("indexCtrl", function ($scope, $http) {
        // newSubject页面方法
        $scope['setRedis'] = setRedisFun = function () {
            $http({
                method: 'POST',
                url: '${request.getContextPath()}/subject/setRedis',
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            })
                    .success(function (data) {
                        console.log(data);
                        if (data.status == 200) {
                            swal("成功", "", "success");
                        } else {
                            swal("失败", "请重新添加", "error");
                        }
                    });
        }
        $scope['updateRA'] = updateRAFun = function () {
            $http({
                method: 'POST',
                url: '${request.getContextPath()}/readlike/update',
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            })
                    .success(function (data) {
                        console.log(data);
                        if (data.status == 200) {
                            swal("成功",data.data, "success");
                        } else {
                            swal("失败", "请重试", "error");
                        }
                    });
        }


        $scope['subjectManage'] = subjectManageFun = function () {
            $http({
                method: 'GET',
                url: '${request.getContextPath()}/subjectManage',
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            })
                    .success(function (data) {
                        console.log(data);
                        if (data.status == 200) {

                        } else {
                            swal("session过期", "请重新登录6", "error");
                            $window.location.href = '${request.getContextPath()}/login';
                        }
                    });
        }
        $scope['userManage'] = userManageFun = function () {
        }
        $scope['messageManage'] = MessageManageFun = function () {
        }
        $scope['tipsManage'] = tipsManageFun = function () {
        }
    })
    // layui
    var selfDesign = "<div id=\"top-bar\" style=\"background-color: #00AAAA;width:70%;height: 55px; float: left;\"><div id=\"user-btn\" style=\"background-color: #008800; width:41px;height: 41px;float: right;margin: 6px;\"><button id=\"testbtn\" class=\"layui-btn layui-btn-small\" style=\"width: 100%;height: 100%;\"><i class=\"layui-icon\"></i></button></div></div>"
    $('#testbtn').on('click', function () {
        layer.open({
            type: 1,
            area: ['600px', '360px'],
            shadeClose: true, //点击遮罩关闭
            content: '\<\div style="padding:20px;">' + selfDesign + '\<\/div>'
        });
    });

    layui.use(['laypage', 'layer'], function () {
        var laypage = layui.laypage
                , layer = layui.layer;
        laypage({
            cont: 'demo2'
            , pages: 100
            , skin: '#1E9FFF'
        });
    });

</script>