<%--
  Created by IntelliJ IDEA.
  User: loadi
  Date: 2017/2/15
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title id="page-title">你要找的页面失踪了-MdBlog</title>
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jianshucss/new-web.css">
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jianshucss/entry-jianshu-index.css">
    <style type="text/css" media="all" rel="stylesheet">
        a {
            color: #333333;
            cursor: pointer;
            text-decoration: none;
        }
        a:hover, a:focus {
            color: #2F2F2F;
            text-decoration: none;
        }
        a:focus {
            outline: none;
        }
        .error-page-logo {
            position: absolute;
            left: 40px;
            top: 40px;
            width: 300px;
        }
        .error {
            width: 100%;
            max-width: 1440px;
            min-width: 768px;
            margin: 0 auto;
            text-align: center;
        }
        .error-block {
            padding-top: 80px;
            padding-bottom: 20px;
        }
        .main-img {
            width: 220px;
        }
        h3 {
            margin: 40px 0 20px 0;
            font-weight: bold;
        }
        .sub-title {
            margin: 10px 0 30px 0;
            font-size: 14px;
        }
        .follow {
            padding: 13px 0;
            width: 160px;
            font-size: 15px;
            border-radius: 40px;
            color: #ffffff;
            background-color: #42C02E;
            border-color: #42C02E;
            display: inline-block;
            text-align: center;
            vertical-align: middle;
            touch-action: manipulation;
            cursor: pointer;
            background-image: none;
            border: 1px solid transparent;
            white-space: nowrap;
            user-select: none;
        }
        .follow:hover, .follow:focus {
            color: #ffffff;
            background-color: #28A014;
            border-color: #28A014;
        }
        .error-footer {
            margin-top: 40px;
            border-top: 1px solid #F0F0F0;
        }
        .part {
            float: left;
            width: 33%;
            padding: 30px 0;
        }
        .part:nth-child(2) {
            border-left: 1px solid #F0F0F0;
            border-right: 1px solid #F0F0F0;
        }
        .part:last-child {
            padding: 20px 0;
        }
        .res-warp {
            display: inline-block;
        }
        .res-warp img {
            margin-right: 15px;
            width: 80px;
            height: 80px;
            vertical-align: middle;
        }
        .res-warp .app, .res-warp .weibo {
            width: auto;
            height: 60px;
        }
        .info {
            padding-top: 10px;
            text-align: left;
            vertical-align: middle;
            display: inline-block;
        }
        .info a {
            font-size: 14px;
            font-weight: bold;
        }
        .info p {
            font-size: 12px;
            color: #9B9B9B;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="error">
        <div class="error-block" style="top: 150px">
            <img class="main-img" src="/img/img_404.png" alt="Img 404">
            <h3>您要找的页面不存在</h3>
            <div class="sub-title">可能是因为您的链接地址有误、该文章已经被作者删除或转为私密状态。</div>
            <a class="follow" href="/">返回首页</a>
        </div>
    </div>
</div>
</body>
</html>
