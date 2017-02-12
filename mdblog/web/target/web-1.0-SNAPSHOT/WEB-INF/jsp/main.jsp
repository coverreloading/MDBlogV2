<%--
  Created by IntelliJ IDEA.
  User: Vincent
  Date: 16/9/16
  Time: 下午11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html style="overflow-y: hidden; ">
<head>
    <title>Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="${request.getContextPath()}/css/style.css" rel='stylesheet' type='text/css'/>
    <link href="${request.getContextPath()}/css/custom.css" rel="stylesheet">
    <link href="${request.getContextPath()}/css/bootstrap.min.css" rel='stylesheet' type='text/css'/>
    <script src="${request.getContextPath()}/editormd/js/jquery.min.js"></script>
    <script src="${request.getContextPath()}/js/bootstrap.min.js"></script>
    <!--<script src="js/jquery.min.js"></script>-->
    <script src="${request.getContextPath()}/js/angular.min.js"></script>
    <!--mdEditor-->
    <script src="${request.getContextPath()}/editormd/lib/marked.min.js"></script>
    <script src="${request.getContextPath()}/editormd/lib/prettify.min.js"></script>
    <script src="${request.getContextPath()}/editormd/editormd.min.js"></script>
    <!-- mdEditor-->
    <link rel="stylesheet" href="${request.getContextPath()}/editormd/css/editormd.preview.min.css"/>
    <link rel="stylesheet" href="${request.getContextPath()}/editormd/css/editormd.min.css"/>
    <%-- sweetalert --%>
    <script src="${request.getContextPath()}/js/sweetalert.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/sweetalert.css">
    <%-- Tagit --%>
    <script src="${request.getContextPath()}/js/jquery-ui.min.js"></script>
    <script src="${request.getContextPath()}/js/tag-it.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jquery-ui.min.css">
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/jquery.tagit.css">
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/tagit.ui-zendesk.css">
    <%-- fileinput --%>
    <link rel="stylesheet" type="text/css" href="${request.getContextPath()}/css/fileinput.min.css">
    <script src="${request.getContextPath()}/js/fileinput.min.js"></script>
    <script src="${request.getContextPath()}/js/locale/zh.js"></script>

</head>
<body style="overflow-y: hidden; ">
<div ng-app="articleApp" ng-controller="articleCtrl">
    <div id="wrapper">
        <!-- Navigation -->
        <nav class="top1 navbar navbar-default navbar-static-top" role="navigation"
             style="margin-bottom: 0;background-color: #337ab7">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="main">MarkDownBlog</a>
            </div>

            <form hidden="hidden" class="navbar-form navbar-right">
                <input type="text" class="form-control" value="搜索...">
            </form>
            <div class="navbar-default sidebar" role="navigation">
                <div>
                    <a href="#" class="list-group-item active" ng-click="addArticle()">新建文章</a>
                </div>
                <div style="overflow:scroll; overflow-x:hidden; height:{{articleListHeight}}px;background-color:#337ab7; ">

                    <div ng-repeat="article in articles">
                        <a class="list-group-item " ng-click="getArticle(article.aId)">{{article.aTitle}}</a>
                    </div>

                </div>
            </div>
        </nav>
        <div id="page-wrapper">
            <div style="position: relative">
                <div class="editormd" id="test-editormd">
                    <textarea class="editormd-markdown-textarea"
                              name="test-editormd-markdown-doc">{{getArticle}}</textarea>
                    <!-- 第二个隐藏文本域，用来构造生成的HTML代码，方便表单POST提交，这里的name可以任意取，后台接受时以这个name键为准 -->
                    <textarea class="editormd-html-textarea" name="text"></textarea>
                </div>
                <div style="width: 100px;height: 20px;position:absolute;right:15px;bottom: 45px;">
                    <a class="btn btn-info btn-block btn-lg" ng-click="updateArticle(articleInActiveaId)">保存</a>
                    {{user.email}}
                </div>
                <div style="width: 100px;height: 20px;position:absolute;right:15px;bottom: 100px;">
                    <a class="btn btn-info btn-block btn-lg" ng-click="delArticle(articleInActiveaId)">删除</a>
                </div>
                <div style="width: 100px;height: 20px;position:absolute;right:15px;bottom: 155px;">
                    <a class="btn btn-info btn-block btn-lg" data-toggle="modal"
                       data-target=".download-type-modal">下载</a>
                </div>
                <div style="width: 100px;height: 20px;position:absolute;right:15px;bottom: 210px;">
                    <a class="btn btn-info btn-block btn-lg" data-toggle="modal"
                       data-target=".release-article-modal" ng-click="getSubject()">发布</a>
                </div>
                <div id="addSuccessMsg" hidden="hidden"
                     style="width: 100px;height: 20px;position:absolute;right:15px;bottom: 265px;">
                    <a class="btn  btn-block btn-lg" style="background-color: #5cb85c"><span
                            style="color: #d9edf7">新建成功</span></a>
                </div>
                <div id="updateSuccessMsg" hidden="hidden"
                     style="width: 100px;height: 20px;position:absolute;right:15px;bottom: 210px;">
                    <a class="btn  btn-block btn-lg" style="background-color: #5cb85c"><span
                            style="color: #d9edf7">自动保存成功</span></a>
                </div>
                <div id="delSuccessMsg" hidden="hidden"
                     style="width: 100px;height: 20px;position:absolute;right:15px;bottom: 210px;">
                    <a class="btn  btn-block btn-success btn-lg">删除成功</a>
                </div>
                <!-- 下载模态框 START-->
                <div class="modal fade download-type-modal" tabindex="-1" role="dialog"
                     aria-labelledby="mySmallModalLabel" aria-hidden="true">
                    <div class="modal-dialog modal-sm">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal"><span
                                        aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                                <h4 class="modal-title">请选择你要下载的文件格式</h4>
                            </div>
                            <div class="modal-body">
                                <button class="btn btn-primary"
                                        ng-click="downloadArticle('md')">MarkDown
                                </button>
                                <button class="btn btn-primary"
                                        ng-click="downloadArticle('html')">HTML
                                </button>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- 下载模态框 END -->
                <!-- 发布模态框 START-->
                <div class="modal fade release-article-modal" tabindex="-1" role="dialog"
                     aria-labelledby="mySmallModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal"><span
                                        aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                                <h4 class="modal-title">发布文章</h4>
                            </div>
                            <div class="modal-body">
                                <form ng-submit="articleFormSub()" class="well">
                                    <div class="form-group">
                                        <h3>标题</h3>
                                        <input class="form-control bg-info " type="text" ng-model="raTitle">
                                    </div>
                                    <h3>封面</h3>
                                    <div>
                                        <input id="file-Portrait" name="mainPic"
                                               class="form-control file-caption kv-fileinput-caption" type="file">
                                    </div>
                                    <div id="container">
                                        <p><b>输入标签</b></p>
                                        <ul id="myTags">
                                        </ul>
                                        <input type="hidden" id="articleTagsValues"/>
                                    </div>
                                    <div id="selectSubject">
                                        <p><b>选择专题</b></p>
                                        <select class="form-control" ng-model="selectSubject">
                                            <option ng-repeat="subject in subjects">{{subject.sId}}.{{subject.sTitle}}
                                            </option>
                                        </select>
                                    </div>
                                    <p><b>输入描述</b></p>
                                    <textarea class="form-control" rows="3" ng-model="raDesc"></textarea>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-success" ng-click="releaseArticle()">发布</button>
                                <button type="button" class="btn btn-info" data-dismiss="modal">取消</button>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- 发布模态框 END -->
                <div hidden="hidden">
                    // 临时放置被选中文章各参数
                    {{articleInActiveaId}}<br/>
                    {{articleInActiveaTitle}}<br/>
                    {{articleInActiveaText}}<br/>
                    {{articleInActiveaCreatetime}}<br/>
                    {{articleInActiveaUpdatetime}}<br/>
                    {{articleInActiveaDel}}<br/>
                    {{articleInActiveaUid}}<br/>

                    {{check}}
                </div>
            </div>
        </div>
    </div>
</div>
</body>

<script type="text/javascript">
    // 页面高度
    var winowHeight = document.documentElement.clientHeight; //获取窗口高度

    winowHeight = winowHeight - 42;
    $(function () {
        testEditor = editormd("test-editormd", {
            width: "100%",
            height: winowHeight,
            toc: true,
            //atLink    : false,    // disable @link
            //emailLink : false,    // disable email address auto link
            todoList: true,
            path: 'editormd/lib/',
            imageUpload: true,
            imageFormats: ["jpg", "jpeg", "gif", "png", "bmp", "webp"],
            imageUploadURL: "/pic/uploadArticlePic/${token}",
            saveHTMLToTextarea: true
        });
    });
    var text = null;
    var app = angular.module("articleApp", []);
    app.controller("articleCtrl", function ($scope, $http, $window, $timeout, $interval) {
        $scope.articleListHeight = winowHeight - 51;
        // 未登录跳转
        if ("${token}" == "") {
            $window.location.href = '${request.getContextPath()}/login';
        }
        // 获取所有文章 check用于判断是从redis中获取数据 loadTheFirstArticle用于判断是否自动加载第一个文章(删除方法调用)
        $scope.check = 0;
        var getAllArticle = function (loadTheFirstArticle) {
            $http({
                method: 'POST',
                url: '${request.getContextPath()}/article/getAllArticle',
                data: "token=${token}&check=" + $scope.check,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            })
                    .success(function (data) {
                        console.log(data);
                        if (data.status == 200) {
                            $scope.articles = data.data;
                            $scope.check = 1;
                            if (loadTheFirstArticle == 1) {
                                getArticleFun(data.data[0].aId);
                            }
                        } else if (data.status == 500) {
                            $scope.check = 1;
                            swal("还没有文章", "点击左边新建文章开始写markdown", "warning");
                        }
                        else {
                            swal("session过期", "请重新登录1", "error");
                            $window.location.href = '${request.getContextPath()}/login';
                        }
                    });
        };

        // 获取所有文章
        $timeout(function () {
//            initMdEditor();
            getAllArticle(1);
        }, 1000);

        // 新建文章函数
        $scope['addArticle'] = function () {
            $http({
                method: 'POST',
                url: '${request.getContextPath()}/article/addArticle',
                data: "token=${token}",
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            })
                    .success(function (data) {
                        console.log(data);
                        if (data.status == 200) {
                            getAllArticle(1);
                            $('#addSuccessMsg').fadeIn("fast");
                            $('#addSuccessMsg').fadeOut(1000);
                        } else {
                            swal("session过期", "请重新登录2", "error");
                            $window.location.href = '${request.getContextPath()}/login';
                        }
                    });
        }
        // 编辑器初始化
        <%--function initMdEditor(articleId) {--%>
        <%--$http.get("${request.getContextPath()}/article/defaultShow")--%>
        <%--.success(function (data) {--%>
        <%--if (data.status == 200) {--%>

        <%--}--%>
        <%--else {--%>
        <%--alert(data.msg);--%>

        <%--}--%>
        <%--});--%>
        <%--};--%>

        $scope['getArticle'] = function (articleId) {
            getArticleFun(articleId);
        }
        var getArticleFun = function (articleId) {
            $http({
                method: 'POST',
                url: '${request.getContextPath()}/article/getArticle',
                data: "token=${token}&articleId=" + articleId,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            })
                    .success(function (respon) {
                        console.log(respon);
                        if (respon.status == 200) {
                            testEditor.setMarkdown(respon.data.aText);
                            $scope.articleInActiveaId = articleId;
                            $scope.articleInActiveaTitle = respon.data.aTitle;
                            $scope.articleInActiveaText = respon.data.aText;
                            $scope.articleInActiveaCreatetime = respon.data.aCreatetime;
                            $scope.articleInActiveaUpdatetime = respon.data.aUpdatetime;
                            $scope.articleInActiveaDel = respon.data.aDel;
                            $scope.articleInActiveaUid = respon.data.aUid;

                        } else {
                            swal("session过期", "请重新登录3", "error");
                            $window.location.href = '${request.getContextPath()}/login';
                        }
                    });
        }

        // 文章删除方法
        $scope['delArticle'] = function (articleId) {
            swal({
                title: "确定删除吗？",
                text: "你确定删除该文章吗？",
                type: "warning",
                showCancelButton: true,
                confirmButtonColor: "#DD6B55",
                confirmButtonText: "确定删除",
                cancelButtonText: "不,手滑了",
                closeOnConfirm: false,
                closeOnCancel: false
            }, function (isConfirm) {
                if (isConfirm) {
                    $http({
                        method: 'POST',
                        url: '${request.getContextPath()}/article/delArticle',
                        data: "token=${token}&articleId=" + articleId,
                        headers: {'Content-Type': 'application/x-www-form-urlencoded'}
                    })
                            .success(function (respon) {
                                console.log(respon);
                                if (respon.status == 200) {
                                    getAllArticle(1);
                                    swal("删除成功", "文章已成功删除", "success");
                                    $timeout(function () {
                                        swal.close();
                                    }, 2000);
                                } else if (respon.status == 400) {
                                    swal("出错啦", respon.msg, "error");
                                }
                                else {
                                    swal("session过期", "请重新登录4", "error");
                                    $window.location.href = '${request.getContextPath()}/login';
                                }
                            });
                } else {
                    swal("手滑了", "下次别再手滑了= = ", "error");
                }
            });
        };

        // 文章保存方法
        $scope['updateArticle'] = updateArticleFun = function (articleId) {
            if (articleId == "" || articleId == null) {
                swal("保存失败", "没有选中要保存的文章", "error");
                return;
            }
            $http({
                method: 'POST',
                url: '${request.getContextPath()}/article/updateArticle',
                data: "token=${token}&aId=" + articleId +
                "&aText=" + testEditor.getMarkdown() +
                "&aUid=" + $scope.articleInActiveaUid,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            })
                    .success(function (data) {
                        console.log(data);
                        if (data.status == 200) {
                            getAllArticle(0);
                            swal("保存成功", "文章" + $scope.articleInActiveaTitle + "已成功保存", "success");
                            $timeout(function () {
                                swal.close();
                            }, 2000);
                        } else if (data.status == 400) {
                            swal("错啦", data.msg + ",重新选中一篇文章开始编辑吧", "error");
                            $timeout(function () {
                                swal.close();
                            }, 2000);
                        }
                        else {
                            swal("session过期", "请重新登录5", "error");
                            $window.location.href = '${request.getContextPath()}/login';
                        }
                    });
        }
        // 文章自动保存方法
        var autpUpdate = function (articleId) {
            $http({
                method: 'POST',
                url: '${request.getContextPath()}/article/updateArticle',
                data: "token=${token}&aId=" + articleId +
                "&aText=" + testEditor.getMarkdown() +
                "&aUid=" + $scope.articleInActiveaUid,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            })
                    .success(function (data) {
                        console.log(data);
                        if (data.status == 200) {
                            getAllArticle(0);
                            $('#updateSuccessMsg').fadeIn("slow");
                            $('#updateSuccessMsg').fadeOut(3000);
                        } else {
                            swal("session过期", "请重新登录6", "error");
                            $window.location.href = '${request.getContextPath()}/login';
                        }
                    });
        }

        // 自动保存
        $interval(function () {
            autpUpdate($scope.articleInActiveaId);
        }, 300000);

        // 文章下载方法
        $scope['downloadArticle'] = downloadArticleFun = function (type) {
            var content = "";
            if (type == "md") {
                content = testEditor.getMarkdown();
            } else if (type == "html") {
                content = testEditor.getPreviewedHTML();
            }
            $http({
                method: 'POST',
                url: '${request.getContextPath()}/file/download/${token}/' + type,
                data: "content=" + content,
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            })
                    .success(function (data) {
                        console.log(data);
                        if (data != null) {
                            swal("下载成功", "success")
                        } else {
                            swal("session过期", "请重新登录7", "error");
                            $window.location.href = '${request.getContextPath()}/login';
                        }
                    });
        }
        // 发布文章前: 初始化上传插件, 获取专题
        $scope['getSubject'] = getSubjectFun = function () {

            //    调用上传插件
            initFileInput("file-Portrait", "/Pic/uploadAPic");

            $http({
                method: 'get',
                url: '${request.getContextPath()}/subject/getsubject',
                headers: {'Content-Type': 'application/x-www-form-urlencoded'}
            })
                    .success(function (data) {
                        console.log(data);
                        if (data != null) {
                            $scope.subjects = data.data;
                        } else {
                        }
                    });
        }
        // 发布文章
        $scope['releaseArticle'] = releaseArticleFun = function () {
            swal({
                title: "确定发布吗？",
                text: "你确定发布该文章吗？",
                type: "success",
                showCancelButton: true,
                confirmButtonColor: "#66ccff",
                confirmButtonText: "确定",
                cancelButtonText: "不,手滑了",
                closeOnConfirm: false,
                closeOnCancel: false
            }, function (isConfirm) {
                if (isConfirm) {
                    $http({
                        method: 'POST',
                        url: '${request.getContextPath()}/RA/new',
                        data: "token=${token}" +
                        "&articleId=" + $scope.articleInActiveaId +
                        "&tipJson=" + $('#articleTagsValues').val() +
                        "&raSubjectJson=" + $scope.selectSubject+
                        "&raTitle=" + $scope.raTitle +
                        "&raDesc=" + $scope.raDesc +
                        "&raText=" + testEditor.getPreviewedHTML(),
                        headers: {'Content-Type': 'application/x-www-form-urlencoded'}
                    })
                            .success(function (data) {
                                console.log(data);
                                if (data != null) {
                                    swal("发布成功", "success");
                                } else {
                                    swal("session过期", "请重新登录8", "error");
                                    $window.location.href = '${request.getContextPath()}/login';
                                }
                            });
                }
            });
        }

        // Tagit初始化
        $(function () {
//            var sampleTags = ['c++', 'java', 'php', 'coldfusion', 'javascript', 'asp', 'ruby', 'python', 'c', 'scala', 'groovy', 'haskell', 'perl', 'erlang', 'apl', 'cobol', 'go', 'lua'];
            $('#myTags').tagit({
                singleField: true,
                singleFieldNode: $('#articleTagsValues'),

                fieldName: "skills",
                availableTags: ["c++", "java", "php", "javascript", "ruby", "python", "c"],
                autocomplete: {delay: 0, minLength: 2},
                showAutocompleteOnFocus: false,
                removeConfirmation: false,
                caseSensitive: true,
                allowSpaces: false,
                singleFieldDelimiter: ',',
                tabIndex: null,
                placeholderText: null
            });
            $('#singleFieldTags').tagit({
                //输入提示
//                availableTags: sampleTags,
                // 与赋值操作有关
                singleField: true,
                allowSpaces: true, //标签中是否允许空格
                singleFieldNode: $('#mySingleField') //将值保存到mySingleField元素
            });

        });


        // 上传插件初始化
        //初始化fileinput控件（第一次初始化）
        function initFileInput(ctrlName, uploadUrl) {
            var control = $('#' + ctrlName);
            control.fileinput({
                language: 'zh', //设置语言
                uploadUrl: '/pic/uploadArticleMainPic/${token}/' + $scope.articleInActiveaId, //上传的地址
                allowedFileExtensions: ['jpg', 'png', 'gif'],//接收的文件后缀
                showUpload: true, //是否显示上传按钮
                showCaption: true,//是否显示标题
                browseClass: "btn btn-primary", //按钮样式
                previewFileIcon: "<i class='glyphicon glyphicon-king'></i>"
            });
        }
    });
</script>

</html>