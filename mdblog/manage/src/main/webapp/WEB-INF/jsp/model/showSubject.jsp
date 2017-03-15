<%--
  Created by IntelliJ IDEA.
  User: Vincent
  Date: 16/10/29
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<div ng-app="modelApp" ng-controller="modelCtrl">
    <div class="panel-body" style="padding-bottom:0px;">
        <div id="toolbar" class="btn-group">
            <%--<button id="btn_add" type="button" class="btn btn-default"  >--%>
            <%--<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增--%>
            <%--</button>--%>
            <button hidden id="btn_edit" type="button" class="btn btn-default" ng-click="resource_edit();">
                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
            </button>
            <button id="btn_delete" type="button" class="btn btn-default" onclick="resource_delete();">
                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
            </button>
        </div>
        <table id="subject_table"></table>
    </div>
    <!-- 模态框（Modal） -->
    <div class="modal fade" id="subjectModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
         aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title" id="myModalLabel">修改专题</h4>
                </div>
                <div class="modal-body">
                    <form class="layui-form layui-form-pane" method="post"
                          action="${request.getContextPath()}/subject/update">
                        <input id="sId" name="sId" hidden>
                        <div class="layui-form-item">
                            <label class="layui-form-label">标题</label>
                            <div class="layui-input-inline">
                                <input type="text" name="sTitle" lay-verify="required" id="uploadsTitle"
                                       autocomplete="off"
                                       class="layui-input">
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <input type="file" name="uploadFile" class="layui-upload-file"><br>
                            <img style="height: 100px;" id="LAY_upload">
                        </div>
                        <input id="SubjectPicUrl" hidden="hidden" name="sPic" lay-verify="sPic">
                        <div class="layui-form-item layui-form-text">
                            <label class="layui-form-label">专题描述</label>
                            <div class="layui-input-block">
                                <textarea name="sDesc" placeholder="请输入内容" class="layui-textarea"></textarea>
                            </div>
                        </div>
                        <div class="layui-form-item">
                            <button class="layui-btn" lay-submit="" lay-filter="NSForm">提交</button>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div>
    <!-- /.modal -->

</div>
<script>
    /*
     layui.use(['form', 'upload'], function () {
     var form = layui.form()
     , layer = layui.layer
     layui.upload({
     url: '/pic/subjectPic'
     , method: 'post' //上传接口的http类型
     , success: function (res) {
     $('#SubjectPicUrl').val(res.url);
     $('#LAY_upload').removeAttribute('src');
     $('#LAY_upload').attr('src',res.url);
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
     })*/
    $(function () {
        //1.初始化Table
        var oTable = new TableInit();
        oTable.Init();

        //2.初始化Button的点击事件
        var oButtonInit = new ButtonInit();
        oButtonInit.Init();

    });

    var $subjectTable = $("#subject_table");
    var TableInit = function () {
        var oTableInit = new Object();
        //初始化Table
        oTableInit.Init = function () {
            $('#subject_table').bootstrapTable({
                url: '/subject/get',         //请求后台的URL（*）
//                method: 'get',                      //请求方式（*）
                method: 'post',
                contentType: "application/x-www-form-urlencoded",
                toolbar: '#toolbar',                //工具按钮用哪个容器
                striped: true,                      //是否显示行间隔色
                cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
                pagination: true,                   //是否显示分页（*）
                sortable: false,                     //是否启用排序
                sortOrder: "asc",                   //排序方式
                queryParams: oTableInit.queryParams,//传递参数（*）
                sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
                pageNumber: 1,                       //初始化加载第一页，默认第一页
                pageSize: 5,                       //每页的记录行数（*）
                pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
                search: true,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
                strictSearch: true,
                showColumns: true,                  //是否显示所有的列
                showRefresh: true,                  //是否显示刷新按钮
                minimumCountColumns: 2,             //最少允许的列数
                clickToSelect: true,                //是否启用点击选中行
                height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
                uniqueId: "sId",                     //每一行的唯一标识，一般为主键列
                showToggle: true,                    //是否显示详细视图和列表视图的切换按钮
                cardView: false,                    //是否显示详细视图
                detailView: false,                   //是否显示父子表
                idField: 'sId',
                columns: [{
                    checkbox: true
                }, {
                    field: 'sId',
                    title: '专题id',
                    width: 20
                }, {
                    field: 'sTitle',
                    title: '标题',
                    width: 100
                }, {
                    field: 'sPic',
                    title: '图片',
                    formatter: function (value, row, index) {
                        return '<img  src="' + value + '" class="img-rounded" width="50px">';
                    }
                }, {
                    field: 'sDesc',
                    title: '描述'
                },{
                    field: 'sCreatetime',
                    title: '创建时间',
                    width: 200,
                    formatter: function (value) {
                        var unixTimestamp = new Date(value)
                        return commonTime = unixTimestamp.toLocaleString();
                    }
                }, {
                    field: 'operate',
                    title: '操作',
                    align: 'center',
                    events: operateEvents,
                    formatter: operateFormatter
                }]
            });
        };

        //得到查询的参数
        oTableInit.queryParams = function (params) {
            var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
                limit: params.limit,   //页面大小
                offset: params.offset,  //页码
                departmentname: $("#txt_search_departmentname").val(),
                statu: $("#txt_search_statu").val()
            };
            return temp;
        };
        return oTableInit;
    };
    var ButtonInit = function () {
        var oInit = new Object();
        var postdata = {};
        oInit.Init = function () {
            //初始化页面上面的按钮事件
        };

        return oInit;
    };
    // 删除
    resource_delete = function () {
        var selectIndex = $('input[name="btSelectItem"]:checked ').val();
        deleteItem($subjectTable, "/subject/del", selectIndex, true);
    };
    function deleteItem($table, requestUrl, selectIndex, reLoad) {
        var selRow = $table.bootstrapTable('getSelections');
        var idField = $table.bootstrapTable("getOptions").idField;
        var className = $table.bootstrapTable("getOptions").className;
        if (className != null && className.length > 0) {
            className += "."
        } else {
            className = "";
        }
        var datas = className + idField + "=" + eval('selRow[0].' + idField) + "&currenttime=" + new Date().getTime();
        console.log(datas);
        if (selRow != null) {
            qiao.bs.confirm({'title': '提示', 'msg': '此操作不可逆，确认删除第' + selectIndex + '行吗？'}, function () {
                $.ajax({
                    type: "POST",
                    cache: false,
                    async: true,
                    dataType: "json",
                    url: requestUrl,
                    data: datas,
                    success: function (data) {
                        alert(data.msg);
                        if (data.status == 200) {
                            $table.bootstrapTable('hideRow', {index: selectIndex});
                            if (reLoad) {
                                $table.bootstrapTable('refresh');
                            }
                        }
                    }
                });
            })
        } else {
            alert('请选取要删除的数据行！');
        }
    }

    // ng
    var app = angular.module("modelApp", []);
    app.controller("modelCtrl", function ($scope, $http) {
        // 编辑
        $scope['resource_edit'] = function () {
            var selRow = $subjectTable.bootstrapTable('getSelections');
            var idField = $subjectTable.bootstrapTable("getOptions").idField;
            var className = $subjectTable.bootstrapTable("getOptions").className;
            if (className != null && className.length > 0) {
                className += "."
            } else {
                className = "";
            }
            var datas = className + idField + "=" + eval('selRow[0].' + idField);
            console.log(datas);
            $http({
                method: 'POST',
                url: '${request.getContextPath()}/ss/ss',
                data: datas,
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
    })
    // 按钮事件
    function operateFormatter(value, row, index) {
        return [
            '<button type="button" class="RoleOfA btn btn-default  btn-success" style="margin-right:15px;">编辑</button>',
            //'<button type="button" class="RoleOfB btn btn-default  btn-sm" style="margin-right:15px;">B row</button>',
            //'<button type="button" class="RoleOfC btn btn-default  btn-sm" style="margin-right:15px;">C value</button>',
        ].join('');
    }
    window.operateEvents = {
        'click .RoleOfA': function (e, value, row, index) {
            console.log(row);
            $('#subjectModal').modal('show');
            $('#LAY_upload').attr('src', row.sPic);
            $('#SubjectPicUrl').val(row.sPic);
            $('#sId').val(row.sId);
            $('.layui-textarea').val(row.sDesc);
            $('#uploadsTitle').val(row.sTitle);
        }
        /*
         ,'click .RoleOfB': function (e, value, row, index) {
         alert("B" + row);
         console.log(row);
         },'click .RoleOfC': function (e, value, row, index) {
         alert("C" + value);
         }
         */
    }


</script>
