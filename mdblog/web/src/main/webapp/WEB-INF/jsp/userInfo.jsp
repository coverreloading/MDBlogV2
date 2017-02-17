<%--
  Created by IntelliJ IDEA.
  User: loadi
  Date: 2016/11/8
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>文章</title>
    <script src="${request.getContextPath()}/js/jquery.min.js"></script>
    <%--<link href="${request.getContextPath()}/css/bootstrap.min.css" rel='stylesheet' type='text/css'/>--%>
    <%--<script src="${request.getContextPath()}/js/bootstrap.min.js"></script>--%>
    <script src="${request.getContextPath()}/js/angular.min.js"></script>
    <link rel="stylesheet" href="${request.getContextPath()}/layui/css/layui.css">
    <script src="${request.getContextPath()}/layui/layui.js"></script>
    <script src="${request.getContextPath()}/layui/lay/dest/layui.all.js"></script>
    <%-- sweetalert --%>
    <script src="${request.getContextPath()}/js/sweetalert.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/sweetalert.css">
    <%--页面Js文件的引用--%>
    <style>
        body {
            background-color: #eeeeee;
        }
    </style>
</head>
<body>
<div style="position: relative;">
    <div id="left-bar" style="background-color: black;width:10%;float: left;">
        <ul class="layui-nav layui-nav-tree layui-nav-side" id="L_demoNav2" style="display: block;width: 10%;">
            <li class="layui-nav-item">
                <a href="">MDBlog</a>
            </li>
            <li class="layui-nav-item">
                <a href="" ng-click="subjectManage()">首页</a>
            </li>
            <li class="layui-nav-item  layui-this">
                <a href="" ng-click="userManage()">完善个人信息</a>
            </li>
            <!--<li class="layui-nav-item"><a href="javascript:;" onclick="L_demoNav2.style.display='none';">关闭该导航演示</a></li>-->
            <span class="layui-nav-bar" style="top: 22.5px; height: 0px; opacity: 0;"></span></ul>
        <!--<button class="layui-btn layui-btn-normal" onclick="L_demoNav2.style.display='block'; L_demoNav2.className='layui-nav layui-nav-tree layui-nav-side';">显示侧边导航示例</button>-->
    </div>
    <%--<div id="left-bar2" style="background-color: cornflowerblue;width:20%; position: fixed;left: 10%;;overflow: hidden">--%>
    <%--<img id="left-bar2-img" src="">--%>
    <%--</div>--%>
    <div id="top-bar"
         style="background-color: #575d6d;width:90%;height: 55px; float: left;position: absolute;right: 0px;box-shadow: 0 1px 4px #2f2f2f;z-index: 999">
        <div id="user-btn" style="background-color: #008800; width:41px;height: 41px;float: right;margin: 6px;">
            <button id="testbtn" class="layui-btn layui-btn-small" style="width: 100%;height: 100%;"><i
                    class="layui-icon"></i></button>
        </div>
    </div>
    <div id="main-bar" style="width:90%;position:relative;top:55px;left: 10%;">
        <div id="article-area" style="width:90%; position: absolute; left: 5%;">
            <div style="position: absolute;top: 100px;left: 30%;right: 30%;">
                <div style="height:750px;text-align: center;">
                    <div id="md-title">
                        <p style="font-size: 40px;">完善信息</p>
                    </div>
                    <br/>
                    <div style="text-align: left;">
                        <form id="info-form" class="layui-form layui-form-pane" action="" method="post">
                            <%--隐藏参数uid--%>
                            <div class="layui-form-item">
                                <input hidden="hidden" id="token" name="token" value="${token}"/>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">昵称</label>
                                <div class="layui-input-block">
                                    <input type="text" name="uiNickname" lay-verify="required" autocomplete="off"
                                           placeholder=""
                                           class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                头像:<input type="file" name="uploadFile" class="layui-upload-file">
                                <img hidden="hidden" style="height: 100px;" id="LAY_demo_upload">
                                <input id="newSubjectPicUrl" hidden="hidden" name="uiPic" lay-verify="sPic">
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">性别</label>
                                <div class="layui-input-block">
                                    <input type="radio" name="uiSex" value="男" title="男" checked="">
                                    <input type="radio" name="uiSex" value="女" title="女">
                                    <input type="radio" name="uiSex" value="密" title="保密">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <div class="layui-inline">
                                    <label class="layui-form-label">生日</label>
                                    <div class="layui-input-block">
                                        <input type="text" name="uiBirth-str" id="date" autocomplete="off"
                                               class="layui-input" lay-verify="required"
                                               onclick="layui.laydate({elem: this})">
                                    </div>
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">职业</label>
                                <div class="layui-input-block">
                                    <input type="text" name="uiOccupation" autocomplete="off" placeholder=""
                                           class="layui-input" lay-verify="required">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">行内选择框</label>
                                <div class="layui-input-inline">
                                    <select name="quiz1">
                                        <option value="">请选择省</option>
                                        <option value="浙江" selected="">浙江省</option>
                                        <option value="你的工号">江西省</option>
                                        <option value="你最喜欢的老师">福建省</option>
                                    </select>
                                </div>
                                <div class="layui-input-inline">
                                    <select name="quiz2">
                                        <option value="">请选择市</option>
                                        <option value="杭州">杭州</option>
                                        <option value="宁波">宁波</option>
                                        <option value="温州">温州</option>
                                        <option value="温州">台州</option>
                                        <option value="温州">绍兴</option>
                                    </select>
                                </div>
                                <div class="layui-input-inline">
                                    <select name="quiz3">
                                        <option value="">请选择县/区</option>
                                        <option value="西湖区">西湖区</option>
                                        <option value="余杭区">余杭区</option>
                                        <option value="拱墅区">临安市</option>
                                    </select>
                                </div>
                            </div>
                            <div class="layui-form-item layui-form-text">
                                <label class="layui-form-label">个人简介</label>
                                <div class="layui-input-block">
                                    <textarea placeholder="请输入内容" name="uiDesc" class="layui-textarea"></textarea>
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <button class="layui-btn" lay-submit="" lay-filter="info-sub-btn">完成</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<script>
    $(document).ready(function () {
        var winowHeight = document.body.clientHeight;
        $("#main-bar").css("height", winowHeight - 55);
    });
    // layui
    layui.use(['form', 'layedit', 'laydate', 'upload'], function () {
        var form = layui.form()
                , layer = layui.layer
                , layedit = layui.layedit
                , laydate = layui.laydate
        layui.upload({
            url: '/pic/user/${token}'
            , method: 'post' //上传接口的http类型
            , success: function (res) {
                LAY_demo_upload.src = res.url;
                $('#LAY_demo_upload').show();
                $('#newSubjectPicUrl').val(res.url);
            }
        });
        // 自定义图片校验
        form.verify({
            sPic: function (value) {
                if (value == "0") {
                    return '还没上传图片';
                }
            }
        });

        $('#newSubjectPicUrl').val("0");

        //监听提交

        form.on('submit(info-sub-btn)', function (data) {

            $.post("/uinfo/update",$("#info-form").serialize(),function (result) {
                var obj = new Function("return" + result)()
                swal(obj.msg);
                if(obj.status==200) {
                    swal("成功", "信息已经保存");
                }
            });
//            layer.alert(JSON.stringify(data.field), {
//                title: '最终的提交信息'
//            })
            return false;
        });

    });

</script>
</html>
