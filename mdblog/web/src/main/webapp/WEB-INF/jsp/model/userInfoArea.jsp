<%--
  Created by IntelliJ IDEA.
  User: loadi
  Date: 2017/2/27
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div id="main-bar" style="width:90%;position:relative;top:55px;left: 10%;">
    <div id="article-area" style="width:90%; position: absolute; left: 5%;">
        <div style="position: absolute;top: 20px;left: 30%;right: 30%;">
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
                                       value="${uif.uiNickname}"
                                       class="layui-input">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            头像:<input type="file" name="uploadFile" class="layui-upload-file">
                            <c:if test="${empty uif.uiPic}}">
                                <p>lasdjkfklj</p>
                                <img hidden="hidden" style="height: 100px;" id="LAY_demo_upload">
                                <input id="newSubjectPicUrl" hidden="hidden" name="uiPic" lay-verify="sPic">
                            </c:if>
                            <c:if test="${not empty uif.uiPic}">
                                <img style="height: 100px;" id="LAY_demo_upload" src="${uif.uiPic}">
                                <input id="newSubjectPicUrl" hidden="hidden" name="uiPic" lay-verify="sPic"
                                       value="${uif.uiPic}">
                            </c:if>
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
                                           onclick="layui.laydate({elem: this})" value="">
                                </div>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <label class="layui-form-label">职业</label>
                            <div class="layui-input-block">
                                <input type="text" name="uiOccupation" autocomplete="off" value="${uif.uiOccupation}"
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
                                <textarea placeholder="请输入内容" name="uiDesc"
                                          class="layui-textarea">${uif.uiDesc}</textarea>
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
<script src="/js/lib/utils.js" type="text/javascript"></script>
<script>
    $(document).ready(function () {

        // 格式化日期
        if ("${uif.uiBirth}" != "") {
            $("#date").val($.myTime.UnixToDateNoHour(${uif.uiBirth}));
        }
        // 调整高度
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
        if ("${uif.uiPic}" == "") {
            form.verify({
                sPic: function (value) {
                    if (value == "0") {
                        return '还没上传图片';
                    }
                }
            });
        }


        //监听提交

        form.on('submit(info-sub-btn)', function (data) {

            $.post("/uinfo/update", $("#info-form").serialize(), function (result) {
                var obj = new Function("return" + result)()
                swal(obj.msg);
                if (obj.status == 200) {
                    swal({
                        title: '成功',
                        text: '信息已经保存',
                        type: 'sucess',
                        showCancelButton: false,
                        confirmButtonText: 'Yes, delete it!',
                        cancelButtonText: 'No, keep it',
                    }).then(function (isConfirm) {
                        if (isConfirm === true) {
                            location.reload();
                        }
                    });
                }
            });
             /*layer.alert(JSON.stringify(data.field), {
                title: '最终的提交信息'
            })*/
            return false;
        });

    });

</script>