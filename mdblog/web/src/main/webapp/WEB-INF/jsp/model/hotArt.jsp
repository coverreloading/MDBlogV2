<%--
  Created by IntelliJ IDEA.
  User: loadi
  Date: 2017/2/20
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="/js/angular.min.js"></script>
<script type="text/javascript" src="/js/lib/utils.js"></script>
<div ng-app="ngHotArt" ng-controller="HotCtrl">


    <div id="main-bar" style="background-color: #ffffff;width:70%;position:relative;top:55px;left: 30%;">
        <div class="container index">
            <div class="row" style=" position: absolute; left: 25%;">
                <div class="col-xs-16 main" style="width: 625px;">
                    <!-- Banner -->
                    <div id="indexCarousel" class="carousel slide">
                        <ol class="carousel-indicators">
                            <li data-target="#indexCarousel" data-slide-to="0" class=""></li>
                            <li data-target="#indexCarousel" data-slide-to="1" class="active"></li>
                            <li data-target="#indexCarousel" data-slide-to="2" class=""></li>
                            <li data-target="#indexCarousel" data-slide-to="3" class=""></li>
                            <li data-target="#indexCarousel" data-slide-to="4" class=""></li>
                            <li data-target="#indexCarousel" data-slide-to="5" class=""></li>
                            <li data-target="#indexCarousel" data-slide-to="6" class=""></li>
                        </ol>
                        <div class="carousel-inner">
                            <div class="item">
                                <a target="_blank"
                                   href="http://www.jianshu.com/p/829ac0c17ac4?utm_medium=index-banner&amp;utm_source=desktop"><img
                                        src="http://upload.jianshu.io/admin_banners/web_images/2779/bbad7843f6dcf21c2f425d198c98ca357940f772.jpg"
                                        alt="Bbad7843f6dcf21c2f425d198c98ca357940f772"></a>
                            </div>
                            <div class="item active">
                                <a target="_blank"
                                   href="http://www.jianshu.com/p/1074c23c731b?utm_medium=index-banner&amp;utm_source=desktop"><img
                                        src="http://upload.jianshu.io/admin_banners/web_images/2778/e61142498769c69719542197e1cdffadbd9b8861.jpg"
                                        alt="E61142498769c69719542197e1cdffadbd9b8861"></a>
                            </div>
                            <div class="item">
                                <a target="_blank"
                                   href="http://www.jianshu.com/p/9348cbf32aad?utm_medium=index-banner&amp;utm_source=desktop"><img
                                        src="http://upload.jianshu.io/admin_banners/web_images/2295/dcc46ceef44b1df38b934c68043e43b1dd7d6f4d.jpg"
                                        alt="Dcc46ceef44b1df38b934c68043e43b1dd7d6f4d"></a>
                            </div>
                            <div class="item">
                                <a target="_blank"
                                   href="http://www.jianshu.com/collection/e048f1a72e3d?utm_medium=index-banner&amp;utm_source=desktop"><img
                                        src="http://upload.jianshu.io/admin_banners/web_images/2474/259a36ccbca577c3064c68ab3c0f1834d77456d7.png"
                                        alt="259a36ccbca577c3064c68ab3c0f1834d77456d7"></a>
                            </div>
                            <div class="item">
                                <a target="_blank"
                                   href="http://www.jianshu.com/p/6fe482032ee2?utm_medium=index-banner&amp;utm_source=desktop"><img
                                        src="http://upload.jianshu.io/admin_banners/web_images/2771/eb70e179eeddedbbde81b9c3797dba62982f0ec9.png"
                                        alt="Eb70e179eeddedbbde81b9c3797dba62982f0ec9"></a>
                            </div>
                            <div class="item">
                                <a target="_blank"
                                   href="http://www.jianshu.com/p/e8ec9d9df830?utm_medium=index-banner&amp;utm_source=desktop"><img
                                        src="http://upload.jianshu.io/admin_banners/web_images/2780/de646bb129527708e2efc5fd266f360291b43395.jpg"
                                        alt="De646bb129527708e2efc5fd266f360291b43395"></a>
                            </div>
                            <div class="item">
                                <a target="_blank"
                                   href="http://www.jianshu.com/p/21756e3fdb59?utm_medium=index-banner&amp;utm_source=desktop"><img
                                        src="http://upload.jianshu.io/admin_banners/web_images/2754/70e464075f9833fa8e527e2a04931e03e04c4d37.jpg"
                                        alt="70e464075f9833fa8e527e2a04931e03e04c4d37"></a>
                            </div>
                        </div>
                        <a class="left carousel-control" href="#indexCarousel" role="button" data-slide="prev"><i
                                class="iconfont ic-previous-s"></i></a>
                        <a class="right carousel-control" href="#indexCarousel" role="button" data-slide="next"><i
                                class="iconfont ic-next-s"></i></a>
                    </div>
                    <!-- Banner -->
                    <div hidden="hidden" class="recommend-collection">
                        <div class="top-line">
                            <div class="row">
                                <a class="col-xs-4 col-lg-3 back-drop" target="_blank"
                                   href="/c/qQB2Zn?utm_medium=index-collections&amp;utm_source=desktop">
                                    <img src="http://upload.jianshu.io/collections/images/9/2009031609140019346.jpg?imageMogr2/auto-orient/strip%7CimageView2/1/w/195/h/195"
                                         alt="195">
                                    <div class="name">想法</div>
                                    <div class="mask"></div>
                                </a> <a class="col-xs-4 col-lg-3 back-drop" target="_blank"
                                        href="/c/RfYyQj?utm_medium=index-collections&amp;utm_source=desktop">
                                <img src="http://upload.jianshu.io/collections/images/12/1239240801.jpg?imageMogr2/auto-orient/strip%7CimageView2/1/w/195/h/195"
                                     alt="195">
                                <div class="name">散文</div>
                                <div class="mask"></div>
                            </a> <a class="col-xs-4 col-lg-3 back-drop" target="_blank"
                                    href="/c/snqjhw?utm_medium=index-collections&amp;utm_source=desktop">
                                <img src="http://upload.jianshu.io/collections/images/59/sports.jpg?imageMogr2/auto-orient/strip%7CimageView2/1/w/195/h/195"
                                     alt="195">
                                <div class="name">运动&amp;健身</div>
                                <div class="mask"></div>
                            </a> <a class="col-xs-4 col-lg-3 back-drop" target="_blank"
                                    href="/c/vHz3Uc?utm_medium=index-collections&amp;utm_source=desktop">
                                <img src="http://upload.jianshu.io/collections/images/38/409px-William-Adolphe_Bouguereau_%281825-1905%29_-_Homer_and_his_Guide_%281874%29.jpg?imageMogr2/auto-orient/strip%7CimageView2/1/w/195/h/195"
                                     alt="195">
                                <div class="name">诗</div>
                                <div class="mask"></div>
                            </a> <a class="col-xs-4 col-lg-3 back-drop" target="_blank"
                                    href="/c/YZRvCb?utm_medium=index-collections&amp;utm_source=desktop">
                                <img src="http://upload.jianshu.io/collections/images/29/240039589470723391.png?imageMogr2/auto-orient/strip%7CimageView2/1/w/195/h/195"
                                     alt="195">
                                <div class="name">健康&amp;养生</div>
                                <div class="mask"></div>
                            </a> <a class="col-xs-4 col-lg-3 back-drop" target="_blank"
                                    href="/c/70b8514fb442?utm_medium=index-collections&amp;utm_source=desktop">
                                <img src="http://upload.jianshu.io/collections/images/256739/461792731394569594.jpg?imageMogr2/auto-orient/strip%7CimageView2/1/w/195/h/195"
                                     alt="195">
                                <div class="name">婚姻育儿</div>
                                <div class="mask"></div>
                            </a> <a class="col-xs-4 col-lg-3 back-drop" target="_blank"
                                    href="/c/e2XTpa?utm_medium=index-collections&amp;utm_source=desktop">
                                <img src="http://upload.jianshu.io/collections/images/20/%E5%9B%BE.jpg?imageMogr2/auto-orient/strip%7CimageView2/1/w/195/h/195"
                                     alt="195">
                                <div class="name">青春</div>
                                <div class="mask"></div>
                            </a> <a class="col-xs-4 col-lg-3" target="_blank"
                                    href="/recommendations/collections?utm_medium=index-collections&amp;utm_source=desktop">
                                <div class="more-hot-collection">更多热门专题 <i class="iconfont ic-link"></i></div>
                            </a></div>
                        </div>
                    </div>
                    <br>
                    <div id="list-container">
                        <!-- 文章列表模块 -->
                        <ul class="note-list" infinite-scroll-url="/">
                            <div ng-repeat="x in records">
                                <li id="note-{{x.ra.raId}}" data-note-id="9332115" class="have-img">
                                    <a class="wrap-img" href="/a/{{x.ra.raId}}" target="_blank">
                                        <img src="{{x.ra.raPic}}">
                                    </a>
                                    <div class="content">
                                        <div class="author">
                                            <a class="avatar" target="_blank" href="/u/{{x.ui.uiUid}}">
                                                <img src="{{x.ui.uiPic}}"
                                                     alt="96">
                                            </a>
                                            <div class="name">
                                                <a class="blue-link" target="_blank" href="/u/{{x.ui.uiUid}}">{{x.ui.uiNickname}}</a>
                                                <span id="ra-time-{{x.ra.raId}}" class="time" data-shared-at="" >{{x.ra.raCreatetime}}</span>
                                            </div>
                                        </div>
                                        <a class="title" target="_blank" href="/a/{{x.ra.raId}}"
                                           se_prerender_url="complete">{{x.ra.raTitle}}</a>
                                        <p class="abstract" >
                                            {{x.ra.raDesc}}
                                        </p>
                                        <div class="meta">
                                            <a class="collection-tag" target="_blank" href="/c/V2CqjW">@IT·互联网</a>
                                            <a target="_blank" href="/a/{{x.ra.raId}}">
                                                <i class="iconfont ic-list-read"></i> {{x.ra.raRead}}
                                            </a> <a hidden="hidden" target="_blank" href="/p/48590c669feb#comments">
                                            <i class="iconfont ic-list-comments"></i> 13
                                        </a> <span><i class="iconfont ic-list-like"></i> {{x.ra.raLike}}</span>
                                            <span hidden="hidden"><i class="iconfont ic-list-money"></i> 2</span>
                                        </div>
                                    </div>
                                </li>
                            </div>
                        </ul>
                        <!-- 文章列表模块 -->
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script>
    var app = angular.module('ngHotArt', []);
    app.controller('HotCtrl', function ($scope, $http) {
        $http.post("/a/hot/0/5")
                .success(function (response) {
                    $scope.records = response.data;
                });
    });
</script>