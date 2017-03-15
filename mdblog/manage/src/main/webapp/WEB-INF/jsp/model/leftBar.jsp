<%--
  Created by IntelliJ IDEA.
  User: Vincent
  Date: 17/3/14
  Time: 14:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="left-bar" style="background-color: black;width:10%;float: left;">
    <ul class="layui-nav layui-nav-tree layui-nav-side" id="L_demoNav2" style="display: block;width: 10%;">
        <li class="layui-nav-item">
            <a href="">管理</a>
        </li>
        <li id="sub_nav" class="layui-nav-item">
            <a href="/">专题管理</a>
        </li>
        <li id="user_nav" class="layui-nav-item">
            <a href="/user">用户管理</a>
        </li>
        <li id="msg_nav" class="layui-nav-item">
            <a href="" ng-click="messageManage()">通知管理</a>
        </li>
        <li id="tip_nav" class="layui-nav-item">
            <a href="" ng-click="tipsManage">标签库查看</a>
        </li>
        <!--<li class="layui-nav-item"><a href="javascript:;" onclick="L_demoNav2.style.display='none';">关闭该导航演示</a></li>-->
        <span class="layui-nav-bar" style="top: 22.5px; height: 0px; opacity: 0;"></span></ul>
    <!--<button class="layui-btn layui-btn-normal" onclick="L_demoNav2.style.display='block'; L_demoNav2.className='layui-nav layui-nav-tree layui-nav-side';">显示侧边导航示例</button>-->
</div>
<div id="left-bar2" style="background-color: cornflowerblue;width:20%;margin-left:10%; float: left;">
    <img id="left-bar2-img" src="">
</div>

<script>
    $(document).ready(function () {
        var winowHeight = document.documentElement.clientHeight;
//        $("#left-bar").css("height", winowHeight);
        $("#left-bar2").css("height", winowHeight);
        $("#left-bar2-img").css("height", winowHeight);
        $("#main-bar").css("height", winowHeight);
        $("#subject-tab-item").css("height", winowHeight - 98);
        $('#left-bar2-img').attr("src", "${request.getContextPath()}/img/bing/" + parseInt(8 * Math.random()) + ".jpg");

        var flag = 0;
        $(".layui-nav-item").hover(function () {
            if (!$(this).hasClass('fixed')) {
                $(this).addClass('layui-this');
            }
        }, function () {
            if (!$(this).hasClass('fixed')) {
                $(this).removeClass('layui-this');
            }
        });

    });
</script>