<%--
  Created by IntelliJ IDEA.
  User: Vincent
  Date: 16/10/29
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<div >
    <div>
        <input type="file" name="uploadFile" class="layui-upload-file"><br>
        <img style="height: 100px;" id="LAY_demo_upload">
    </div>
    <br>
    <form class="layui-form layui-form-pane" method="post" action="${request.getContextPath()}/subject/add">
        <div class="layui-form-item">
            <label class="layui-form-label">标题</label>
            <div class="layui-input-inline">
                <input type="text" name="sTitle" lay-verify="required" placeholder="请输入" autocomplete="off"
                       class="layui-input">
            </div>
        </div>

        <input id="newSubjectPicUrl" hidden="hidden" name="sPic" lay-verify="sPic">

        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">专题描述</label>
            <div class="layui-input-block">
                <textarea name="sDesc" placeholder="请输入内容" class="layui-textarea"></textarea>
            </div>
        </div>
        <div class="layui-form-item">
            <button class="layui-btn" lay-submit="" lay-filter="NSForm" >提交</button>
        </div>
    </form>
    <br>
    <button class="layui-btn"  ng-click="setRedis()">刷新专题缓存</button>
    <button class="layui-btn"  ng-click="updateRA()">保存文章阅读喜欢数</button>
</div>

<script>
    layui.use(['form', 'upload'], function () {
        var form = layui.form()
                , layer = layui.layer
        layui.upload({
            url: '/pic/subjectPic'
            , method: 'post' //上传接口的http类型
            , success: function (res) {
                LAY_demo_upload.src = res.url;
                $('#newSubjectPicUrl').val(res.url);
            }
        });
        // 自定义图片校验
        form.verify({
            sPic: function(value){
                if(value=="0"){
                    return '还没上传图片';
                }
            }
        });


//        监听提交
//        form.on('submit(NSForm)', function (data) {
//            layer.alert(JSON.stringify(data.field), {
//                title: '最终的提交信息'
//            })
//            return false;
//        });
    });

    $('#newSubjectPicUrl').val("0");


</script>