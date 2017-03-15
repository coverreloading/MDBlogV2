<%--
  Created by IntelliJ IDEA.
  User: Vincent
  Date: 16/10/29
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<div class="panel-body" style="padding-bottom:0px;">
    <div id="toolbar2" class="btn-group">
        <%--<button  id="btn_add" type="button" class="btn btn-default">--%>
        <%--<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增--%>
        <%--</button>--%>
        <%--<button  hidden id="btn_edit" type="button" class="btn btn-default">--%>
        <%--<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改--%>
        <%--</button>--%>
        <%--<button id="btn_delete" type="button" class="btn btn-default">--%>
        <%--<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除--%>
        <%--</button>--%>
    </div>
    <table id="user_departments"></table>
</div>
<script>
    $(function () {

        //1.初始化Table
        var userTable = new UserTableInit();
        userTable.Init();
        //2.初始化Button的点击事件
//        var userButtonInit = new ButtonInit();
//        userButtonInit.Init();
    });
    var UserTableInit = function () {
        var userTableInit = new Object();
        //初始化Table
        userTableInit.Init = function () {
            $('#user_departments').bootstrapTable({
                url: '/user/get',         //请求后台的URL（*）
//                method: 'get',                      //请求方式（*）
                method: 'post',
                contentType: "application/x-www-form-urlencoded",
                toolbar: '#toolbar2',               //工具按钮用哪个容器
                striped: true,                      //是否显示行间隔色
                cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
                pagination: true,                   //是否显示分页（*）
                sortable: false,                     //是否启用排序
                sortOrder: "asc",                   //排序方式
                queryParams: userTableInit.queryParams,//传递参数（*）
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
                columns: [{
                    checkbox: true
                }, {
                    field: 'user.uId',
                    title: '用户id',
                    formatter: function(value,row,index){
                        return '<a href="localhost:8080/uinfo/u/'+value+'" target="blank">'+value+'</a>';
                    }
                }, {
                    field: 'user.uEmail',
                    title: '邮箱',
                    width: 200
                }, {
                    field: 'userInfo.uiNickname',
                    title: '昵称',
                }, {
                    field: 'userInfo.uiPic',
                    title: '头像',
                    width: 70,
                    formatter: function (value, row, index) {
                        return '<img  src="' + value + '" class="img-rounded" width="50px">';
                    }
                }, {
                    field: 'userInfo.uiSex',
                    title: '性别',
                    width: 100
                }, {
                    field: 'userInfo.uiCreatetime',
                    title: '注册时间',
                    width: 200,
                    formatter: function (value) {
                        var unixTimestamp = new Date(value)
                        return commonTime = unixTimestamp.toLocaleString();
                    }
                }]
            });
        };

        //得到查询的参数
        userTableInit.queryParams = function (params) {
            var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
                limit: params.limit,   //页面大小
                offset: params.offset,  //页码
                departmentname: $("#txt_search_departmentname").val(),
                statu: $("#txt_search_statu").val()
            };
            return temp;
        };
        return userTableInit;
    };
    /*
     // 工具栏按钮
     var ButtonInit = function () {
     var oInit = new Object();
     var postdata = {};

     oInit.Init = function () {
     //初始化页面上面的按钮事件
     };
     return oInit;
     };
     */


</script>
