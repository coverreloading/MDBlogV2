<%--
  Created by IntelliJ IDEA.
  User: loadi
  Date: 2017/2/14 valentine's Day
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="left-bar" style="background-color: black;width:10%;float: left;">
    <ul class="layui-nav layui-nav-tree layui-nav-side" id="L_demoNav2" style="display: block;width: 10%;margin:0;">
        <li class="layui-nav-item">
            <a href="/"></span>MDBlog</a>
        </li>
        <li class="layui-nav-item layui-this">
            <a href="/" ng-click="subjectManage()"><span class="layui-icon">&#xe609;</span> 首页</a>
        <li class="layui-nav-item">
            <a href="" ng-click="userManage()"><span class="layui-icon ">&#xe62a;</span> 专题</a>
        </li>
        <li class="layui-nav-item login-in">
            <a href="" ng-click="messageManage()"><span class="layui-icon ">&#xe613;</span> 简友圈</a>
        </li>
        <li class="layui-nav-item login-in">
            <a href="" ng-click="tipsManage"><span class="layui-icon ">&#xe642;</span> 写文章</a>
        </li>
        <!--<li class="layui-nav-item"><a href="javascript:;" onclick="L_demoNav2.style.display='none';">关闭该导航演示</a></li>-->
        <span class="layui-nav-bar" style="top: 22.5px; height: 0px; opacity: 0;"></span></ul>
    <!--<button class="layui-btn layui-btn-normal" onclick="L_demoNav2.style.display='block'; L_demoNav2.className='layui-nav layui-nav-tree layui-nav-side';">显示侧边导航示例</button>-->
</div>
<script>
    $("document").ready(function () {
        if ("${token}" != "") {
            $.post("/uinfo/uibtok/${token}", function (data) {
                var obj = new Function("return" + data)();
                console.log("已登录");
//                console.log(obj.data);
//                console.log(obj.data.uiPic);
                $("#uipic").attr("src", obj.data.uiPic);

            })
            $(".un-log").hide();
            $(".login-in").show();
        } else {
            console.log("尚未登录");
            $(".un-log").show();
            $(".login-in").hide();
        }
    })
</script>