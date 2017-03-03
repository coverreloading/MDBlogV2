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

    <link rel="stylesheet" href="${request.getContextPath()}/layui/css/layui.css">
    <script src="${request.getContextPath()}/layui/layui.js"></script>
    <script src="${request.getContextPath()}/layui/lay/dest/layui.all.js"></script>
    <%-- sweetalert --%>
    <script src="${request.getContextPath()}/js/sweetalert.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/sweetalert.css">
    <%--<link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jianshucss/base.css">--%>
    <%--<link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jianshucss/base-read-mode.css">--%>
    <%--<link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jianshucss/reading-note.css">--%>
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jianshucss/new-web.css">
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jianshucss/entry-jianshu-index.css">
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jianshucss/web-jianshu.css">
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jianshucss/sign.css">
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script src="${request.getContextPath()}/js/jquery.min.js"></script>
    <script src="${request.getContextPath()}/js/bootstrap.min.js"></script>
    <script src="${request.getContextPath()}/js/angular.min.js"></script>
</head>
<body style="background-color: #f1f1f1;">
<div style="position: relative;">
    <jsp:include page="model/leftBar1.jsp"/>
    <div id="main-bar" style="background-color: #f1f1f1;width:90%;position:relative;top:0px;left: 10%;">
        <jsp:include page="model/registerArea.jsp"/>
    </div>
</div>
</body>
</html>
<script>
    $(document).ready(function () {
        var winowHeight = document.body.clientHeight;
        $("#left-bar2").css("height", winowHeight);
        $('#left-bar2-img').attr("src", "${request.getContextPath()}/img/bing/" + parseInt(8 * Math.random()) + ".jpg");
        $('#left-bar2-img').css("max-width", "none");
        $("#left-bar2-img").css("height", winowHeight);
//        $("#main-bar").css("height", winowHeight - 55);
    });
</script>