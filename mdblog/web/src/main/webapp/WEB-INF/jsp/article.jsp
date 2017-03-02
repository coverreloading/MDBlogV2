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
    <title id="page-title">文章-MdBlog</title>
    <script src="${request.getContextPath()}/js/jquery.min.js"></script>
    <%--<link href="${request.getContextPath()}/css/bootstrap.min.css" rel='stylesheet' type='text/css'/>--%>
    <script src="${request.getContextPath()}/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${request.getContextPath()}/layui/css/layui.css">
    <script src="${request.getContextPath()}/layui/layui.js"></script>
    <script src="${request.getContextPath()}/layui/lay/dest/layui.all.js"></script>
    <%-- sweetalert --%>
    <script src="${request.getContextPath()}/js/sweetalert.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/sweetalert.css">
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/mymdstyle.css">
    <%--<link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jianshucss/base.css">--%>
    <%--<link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jianshucss/base-read-mode.css">--%>
    <%--<link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jianshucss/reading-note.css">--%>

    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jianshucss/new-web.css">
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jianshucss/entry-jianshu.css">


</head>
<body>
<div style="position: relative;">
    <jsp:include page="model/leftBar1.jsp"/>
    <jsp:include page="model/leftBar2.jsp"/>
    <jsp:include page="model/topBar.jsp"/>
    <jsp:include page="model/articleArea.jsp"/>
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
        $("#main-bar").css("height", winowHeight - 55);
    });
</script>