<%--
  Created by IntelliJ IDEA.
  User: loadi
  Date: 2017/2/14 valentine's Day
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<nav id="top-bar" style="background-color: #3f3f3f;width:70%;height: 55px; float: left;position: absolute;right: 0px;">
    <%--搜索框--%>
    <ul class="nav navbar-nav">
        <li class="search">
            <form target="_blank" action="/search" accept-charset="UTF-8" method="get"><input name="utf8" type="hidden"
                                                                                              value="✓">
                <input type="text" name="q" id="q" value="" placeholder="搜索" class="search-input">
                <a class="search-btn" href="javascript:void(null)"
                   style="border-radius: 50%; color: rgb(255, 255, 255) !important; background-color: rgb(150, 150, 150);"><i
                        class="iconfont ic-search"></i></a>
                <!-- <div id="navbar-trending-search"></div> -->
            </form>
        </li>
    </ul>

    <%--<i class="layui-icon top-bar-icon">&#xe606;</i>--%>
    <a class="btn write-btn" target="_blank" href="/main">
        <i class="iconfont ic-write"></i>写文章
    </a>
    <div class="un-log" hidden="hidden">
        <a class="btn sign-up" href="/register">注册</a>
        <a class="btn log-in" href="/login">登录</a>
    </div>
    <div class="login-in">
        <div id="user" class="user">
            <div data-hover="dropdown">
                <div class="avatar" ><img id="uipic"
                        src=""
                        alt="100"></div>
            </div>
            <ul class="dropdown-menu" style="z-index:9999">
                <li>
                    <a href="/u/8814489783cd">
                        <i class="iconfont ic-navigation-profile"></i><span>我的主页</span>
                    </a></li>
                <li>
                    <!-- TODO bookmarks_path -->
                    <a href="/bookmarks">
                        <i class="iconfont ic-navigation-mark"></i><span>收藏的文章</span>
                    </a></li>
                <li>
                    <a href="/users/8814489783cd/liked_notes">
                        <i class="iconfont ic-navigation-like"></i><span>喜欢的文章</span>
                    </a></li>
                <li>
                    <a href="/uinfo/userinfo">
                        <i class="iconfont ic-navigation-settings"></i><span>设置</span>
                    </a></li>
                <li>
                    <a href="/contact" se_prerender_url="complete">
                        <i class="iconfont ic-navigation-feedback"></i><span>帮助与反馈</span>
                    </a></li>
                <li>
                    <a rel="nofollow" data-method="delete" href="/sign_out">
                        <i class="iconfont ic-navigation-signout"></i><span>退出</span>
                    </a></li>
            </ul>
        </div>
    </div>
</nav>

</div>
<script>
    $("document").ready(function () {
        if ("${token}" != "") {
            <%--alert("${token}");--%>
            $.post("/uinfo/uibtok/${token}", function (data) {
                var obj = new Function("return" + data)();
                console.log("已登录");
//                console.log(obj.data);
//                console.log(obj.data.uiPic);
                $("#uipic").attr("src", obj.data.uiPic);
                $(".un-log").hide();
                $(".login-in").show();
            })
        } else {
            console.log("尚未登录");
            $(".un-log").show();
            $(".login-in").hide();
        }
    })
//    用户下拉栏
    $("#user").hover(function(){
        $("#user").addClass("open");
    },function(){
        $("#user").removeClass("open");
    });
</script>