<%--
  Created by IntelliJ IDEA.
  User: Vincent
  Date: 16/11/1
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="main-bar" style="background-color: #ffffff;width:70%;position:relative;top:55px;left: 30%;">
    <div id="article-area" style="width:90%; position: absolute; left: 5%;">
        <div>
            <%--<h1 id="ArticleAreaTitle" style="">${RA.raTitle}</h1>--%>
            <%--<div>--%>
            <%--<div>--%>
            <%--<img id="AuthorPic" src="${request.getContextPath}/img/test.jpg">--%>
            <%--</div>--%>
            <%--</div>--%>
            <%--<div id="raText">--%>
            <%--${RA.raText}--%>
            <%--</div>--%>
            <%----%>
            <script>
                $(document).ready(function () {
//                  异步获取文章信息,展示
                    $.get(window.location.href + "/getall", function (data) {
                        var obj = new Function("return" + data)();

                        if (obj.status == 200) {
                            $("#ra-title,#page-title").html(obj.data.raTitle);


                            $("#ra-like").html(obj.data.releaseArticle.raLike);
                            $("#ra-read").html(obj.data.releaseArticle.raRead);
                            $("#ra-text").html(obj.data.releaseArticle.raText);
                            // todo
//                raLike 1
//                raRead 1
//                raTitle 1
//                raCreatetime
//                raUpdatetime
//                raPic
//                raSubjectId
//                raText 1
//                raUid
//
//                msg
//                status
//                alert(obj.data.raText);
                        }
                    });
                })
            </script>
            <div class="container">
                <!-- Article activities for width under 768px -->
                <div class="related-avatar-group activities"></div>
                <div class="article">
                    <div class="preview">
                        <div class="author-info">
                            <div class="btn btn-small btn-success follow">
                                <a data-signin-link="true" data-toggle="modal" href="/sign_in"><i
                                        class="fa fa-plus"></i> <span>添加关注</span></a>
                            </div>
                            <a class="avatar" href="/users/fd0b03fc2a9e">
                                <img src="http://upload.jianshu.io/users/upload_avatars/3072624/6008e592f7ad.jpg?imageMogr/thumbnail/90x90/quality/100"
                                     alt="100">
                            </a> <span class="label">作者</span>
                            <a class="author-name blue-link" href="/users/fd0b03fc2a9e">
                                <span>快门奴隶</span>
                            </a> <span data-toggle="tooltip"
                                       data-original-title="最后编辑于 2016.11.13 10:42">2016.11.09 20:50*</span>
                            <div>
                                <span>阅读3421次</span><span>写了6510字</span>，<span>被34人关注</span>，<span>获得了45个喜欢</span>
                            </div>
                        </div>
                        <h1 class="title" id="ra-title">简书</h1>
                        <div class="meta-top">
                            <span hidden class="wordage">字数862</span>
                            <span class="views-count">阅读<span id="ra-read"/></span>
                            <span class="comments-count">评论16</span>
                            <span class="likes-count">喜欢<span id="ra-like"/></span>
                        </div>

                        <!-- Collection/Bookmark/Share for width under 768px -->
                        <div class="article-share"><a class="bookmark" data-signin-link="true" data-toggle="modal"
                                                      href="/sign_in"> <i
                                class="fa fa-bookmark-o"></i><span>收藏文章</span></a><span> <a href="javascript:void(null)"
                                                                                            data-toggle="dropdown"><i
                                class="fa fa-share-square-o"></i> 分享</a> <ul class="dropdown-menu arrow-top"> <li> <a
                                href="javascript:void((function(s,d,e,r,l,p,t,z,c){var%20f='http://v.t.sina.com.cn/share/share.php?appkey=1881139527',u=z||d.location,p=['&amp;url=',e(u),'&amp;title=',e(t||d.title),'&amp;source=',e(r),'&amp;sourceUrl=',e(l),'&amp;content=',c||'gb2312','&amp;pic=',e(p||'')].join('');function%20a(){if(!window.open([f,p].join(''),'mb',['toolbar=0,status=0,resizable=1,width=440,height=430,left=',(s.width-440)/2,',top=',(s.height-430)/2].join('')))u.href=[f,p].join('');};if(/Firefox/.test(navigator.userAgent))setTimeout(a,0);else%20a();})(screen,document,encodeURIComponent,'','','http://cwb.assets.jianshu.io/notes/images/6862760/weibo/image_5206504780a8.jpg', '推荐 快门奴隶 的文章《教你如何用手机小清新修图燃爆朋友圈！（一）》（ 分享自 @简书 ）','http://www.jianshu.com/p/823963dabe31','页面编码gb2312|utf-8默认gb2312'));"> <img
                                src="http://baijii-common.b0.upaiyun.com/social_icons/32x32/weibo.png"> </a> </li> <li> <a
                                href="javascript:void(function(){var d=document,e=encodeURIComponent,s1=window.getSelection,s2=d.getSelection,s3=d.selection,s=s1?s1():s2?s2():s3?s3.createRange().text:'',r='http://www.douban.com/recommend/?url='+e('http://www.jianshu.com/p/823963dabe31')+'&amp;title='+e('教你如何用手机小清新修图燃爆朋友圈！（一）')+'&amp;sel='+e(s)+'&amp;v=1',x=function(){if(!window.open(r,'douban','toolbar=0,resizable=1,scrollbars=yes,status=1,width=450,height=330'))location.href=r+'&amp;r=1'};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})()"> <img
                                src="http://baijii-common.b0.upaiyun.com/social_icons/32x32/douban.png"> </a> </li> <li> <a
                                href="javascript:void(function(){var d=document,e=encodeURIComponent,r='http://share.v.t.qq.com/index.php?c=share&amp;a=index&amp;url='+e('http://www.jianshu.com/p/823963dabe31')+'&amp;title='+e('推荐 快门奴隶 的文章《教你如何用手机小清新修图燃爆朋友圈！（一）》（ 分享自 @jianshuio ）'),x=function(){if(!window.open(r,'tweibo','toolbar=0,resizable=1,scrollbars=yes,status=1,width=600,height=600'))location.href=r};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})();"> <img
                                src="http://baijii-common.b0.upaiyun.com/social_icons/32x32/tweibo.png"> </a> </li> <li> <a
                                href="javascript:void(function(){var d=document,e=encodeURIComponent,r='http://sns.qzone.qq.com/cgi-bin/qzshare/cgi_qzshare_onekey?url='+e('http://www.jianshu.com/p/823963dabe31')+'&amp;title='+e('推荐 快门奴隶 的文章《教你如何用手机小清新修图燃爆朋友圈！（一）》'),x=function(){if(!window.open(r,'qzone','toolbar=0,resizable=1,scrollbars=yes,status=1,width=600,height=600'))location.href=r};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})();"> <img
                                src="http://baijii-common.b0.upaiyun.com/social_icons/32x32/qzone.png"> </a> </li> <li> <a
                                href="javascript:void(function(){var d=document,e=encodeURIComponent,r='https://twitter.com/share?url='+e('http://www.jianshu.com/p/823963dabe31')+'&amp;text='+e('推荐 快门奴隶 的文章《教你如何用手机小清新修图燃爆朋友圈！（一）》（ 分享自 @jianshucom ）')+'&amp;related='+e('jianshucom'),x=function(){if(!window.open(r,'twitter','toolbar=0,resizable=1,scrollbars=yes,status=1,width=600,height=600'))location.href=r};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})();"> <img
                                src="http://baijii-common.b0.upaiyun.com/social_icons/32x32/twitter.png"> </a> </li> <li> <a
                                href="javascript:void(function(){var d=document,e=encodeURIComponent,r='https://www.facebook.com/dialog/share?app_id=483126645039390&amp;display=popup&amp;href=http://www.jianshu.com/p/823963dabe31',x=function(){if(!window.open(r,'facebook','toolbar=0,resizable=1,scrollbars=yes,status=1,width=450,height=330'))location.href=r};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})();"> <img
                                src="http://baijii-common.b0.upaiyun.com/social_icons/32x32/facebook.png"> </a> </li> <li> <a
                                href="javascript:void(function(){var d=document,e=encodeURIComponent,r='https://plus.google.com/share?url='+e('http://www.jianshu.com/p/823963dabe31'),x=function(){if(!window.open(r,'google_plus','toolbar=0,resizable=1,scrollbars=yes,status=1,width=450,height=330'))location.href=r};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})();"> <img
                                src="http://baijii-common.b0.upaiyun.com/social_icons/32x32/google_plus.png"> </a> </li> <li> <a
                                href=""> <img
                                src="http://baijii-common.b0.upaiyun.com/social_icons/32x32/renren.png"> </a> </li> </ul></span>
                        </div>
                        <!-- -->

                        <div id="ra-text"></div>
                        <%--案例文本内容--%>
                        <div class="show-content" hidden="hidden">
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-78fddf260cf8ccc2.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-78fddf260cf8ccc2.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">图片发自简书App</div>
                            </div>
                            <p>&#65279;&#65279;</p>
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-390b8041ae3465d6.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-390b8041ae3465d6.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">图片发自简书App</div>
                            </div>
                            <p>&#65279;&#65279;</p>
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-5fe686896b49ce1e.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-5fe686896b49ce1e.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">图片发自简书App</div>
                            </div>
                            <p>&#65279;&#65279;</p>
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-8c99b44b868dc4d0.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-8c99b44b868dc4d0.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">图片发自简书App</div>
                            </div>
                            <p>&#65279;我玩儿摄影也有5年多了吧，从初一就开始用一台卡片机拍拍拍然后到现在高三感觉还是个渣渣...手机是5s然后相机有佳能m3和尼康d3200
                                108的头，最近很想入个定焦镜头可是穷啊！</p>
                            <p>直入正题好了，你们有没有听过一个神奇的软件：</p>
                            <h1>VSCO CAM</h1>
                            <p>就是这个神奇的软件，让很多没有胶片相机的父老乡亲们，拥有了自己的胶片大片！！！（clapppp～～）</p>
                            <p>燃鹅，并不是加一个滤镜就可以秒变大片的，需要一定的审美一定的技术一定的钱！因为你需要到淘宝花一块钱破解那一百多个滤镜，多值！多值！</p>
                            <p>❶首先，第一个缓缓入场的是：</p>
                            <p>午后阳光温暖日系静物摆拍调色篇</p>&#65279;
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-f737f8330b6dff6b.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-f737f8330b6dff6b.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">我们该如何去思考？</div>
                            </div>
                            <p>日系胶片，主要是青黄色&#65279;&#65279;对吧。这张照片整体较暗，看着没有日系的清新感。所以，首先要做细节调整，提高曝光度，色调减少这样照片看起来就会比较清新，色温也减少一点。&#65279;</p>
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-27705268c34b42c8.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-27705268c34b42c8.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">图片发自简书App</div>
                            </div>
                            <p>&#65279;然后我们去选滤镜，我比较喜欢的是A8，有一点蓝绿蓝绿的感觉……</p>
                            <p>加滤镜之后就稍微加点锐度，会有胶片的颗粒感。&#65279;这样就完成啦！</p>
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-18abe783b1e427c7.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-18abe783b1e427c7.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">图片发自简书App</div>
                            </div>
                            <p>&#65279;❷时尚时尚最时尚复古森系胶片风(特别是有朵小花的时候)</p>
                            <p>&#65279;</p>
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-8d0683509d5c27c5.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-8d0683509d5c27c5.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">图片发自简书App</div>
                            </div>
                            <p>&#65279;不得不说，原图还真丑……整张图片灰的可以，一点都没有生机。<br></p>
                            <p>所以要加点对比度呈现一种花和叶子有层次感的感觉。因为是复古风，所以亮度就不用太亮。色调增加可以让粉色的花更粉，暗角增加胶片感。&#65279;</p>
                            <p>比原来好很多吧。</p>
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-a836228bb053145e.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-a836228bb053145e.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">图片发自简书App</div>
                            </div>
                            <p>这张照片我用的是06滤镜 +5左右，再转一个角度，就可以当壁纸辣哈哈哈。&#65279;</p>
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-6fb54f0b8fb2e9bb.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-6fb54f0b8fb2e9bb.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">图片发自简书App</div>
                            </div>
                            &#65279;&#65279;
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-7bd8d75a71d62254.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-7bd8d75a71d62254.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">这张也是类似上面的做法，不过加了点褪色</div>
                            </div>
                            <p>❸韩国小清新死白死白&#65279;颗粒风</p>
                            <p>这个是我在小北老师那里学的&#65279;</p>
                            <p>这个图片也是他发给我们练习用的</p>
                            <p>so……自己领悟吧我不好多说</p>
                            <p>但大部分的韩风都是整体偏冷色调，有一点点过曝，然后拼命加锐度颗粒。&#65279;&#65279;</p>
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-0d23262a27a79617.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-0d23262a27a79617.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">图片发自简书App</div>
                            </div>
                            &#65279;
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-f9f69ba856c796c8.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-f9f69ba856c796c8.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">图片发自简书App</div>
                            </div>
                            &#65279;
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-f36203acf6aaa078.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-f36203acf6aaa078.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">图片发自简书App</div>
                            </div>
                            <p>&#65279;&#65279;</p>
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-fb5f091bca700bd1.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-fb5f091bca700bd1.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">这个是我按照老师做的作业。</div>
                            </div>
                            <p>&#65279;&#65279;❹蓝蓝滴天空小清新白云一朵朵风</p>
                            <p>&#65279;</p>
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-bce4c1ac8d818497.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-bce4c1ac8d818497.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">图片发自简书App</div>
                            </div>
                            <p>&#65279;天空深蓝色，可是如果要日系的话就得是浅蓝色。二话不说，拉高曝光度，拉到一种有点过曝的样子hhh。减色调（和之前的原因一样）！&#65279;加噪点！加一丢丢饱和度！不需要滤镜都是美美哒！</p>
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-78e87caa6b89df5a.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-78e87caa6b89df5a.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">图片发自简书App</div>
                            </div>
                            &#65279;&#65279;
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-6692cd92c32b9ae7.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-6692cd92c32b9ae7.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">图片发自简书App</div>
                            </div>
                            &#65279;&#65279;
                            <div class="image-package imagebubble" widget="ImageBubble">
                                <img src="http://upload-images.jianshu.io/upload_images/3072624-fa030708acd25d5d.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     data-original-src="http://upload-images.jianshu.io/upload_images/3072624-fa030708acd25d5d.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240"
                                     class="imagebubble-image"><br>
                                <div class="image-caption">是不是有种漫画即视感</div>
                            </div>
                            <p>并非专业人士，都是按照自己的感觉一点一点去摸索。但是人人审美不同是吧，哈哈我就喜欢这种。每个人都可以是修图大神，只有你肯花时间去做。当然我也在探索哈哈哈。</p>
                            <p>下次我会出人像美食篇，你们喜欢吗期待吗。我会努力，让你们的照片都燃爆朋友圈哒！&gt;•&lt;</p></div>
                    </div>
                </div>

                <div class="visitor_edit">
                    <!-- further readings -->
                    <div id="further-readings" data-user-slug="" data-user-nickname="">
                        <div id="further-reading-line" class="hide further-reading-line"></div>
                        <ul id="further-readings-list" class="reading-list unstyled"></ul>
                        <div id="further-reading-new" class="reading-edit">
                            <a data-signin-link="true" data-toggle="modal" href="/sign_in">
                                <i class="fa fa-plus-circle"></i> 推荐拓展阅读
                            </a>
                            <div id="further-reading-form"></div>
                        </div>
                    </div>
                    <div class="pull-right">
                        <!-- copyright -->
                        <div class="author-copyright pull-right" data-toggle="tooltip" data-html="true" title=""
                             data-original-title="转载请联系作者获得授权，并标注“简书作者”。">
                            <a><i class="fa fa-copyright"></i> 著作权归作者所有</a>
                        </div>
                    </div>
                </div>

                <!-- Reward / Support Author -->
                <div class="support-author">
                    <p>如果觉得我的文章对您有用，请随意打赏。您的支持将鼓励我继续创作！</p>
                    <a class="btn btn-pay" data-toggle="modal" href="#pay-modal">¥ 打赏支持</a>
                    <div class="avatar-list"></div>
                </div>

                <!-- article meta bottom -->
                <div class="meta-bottom clearfix">
                    <!--  Like Button -->
                    <div class="like ">
                        <div class="like-button">
                            <a id="like-note" class="like-content" data-signin-link="true" data-toggle="modal"
                               href="/sign_in">
                                <i class="fa fa-heart-o"></i> 喜欢
                            </a></div>
                        <span id="likes-count" data-toggle="tooltip" data-placement="right" title=""
                              data-original-title="查看所有喜欢的用户">71</span></div>
                    <!--  share group -->
                    <div class="share-group pull-right">
                        <a href="javascript:void((function(s,d,e,r,l,p,t,z,c){var%20f='http://v.t.sina.com.cn/share/share.php?appkey=1881139527',u=z||d.location,p=['&amp;url=',e(u),'&amp;title=',e(t||d.title),'&amp;source=',e(r),'&amp;sourceUrl=',e(l),'&amp;content=',c||'gb2312','&amp;pic=',e(p||'')].join('');function%20a(){if(!window.open([f,p].join(''),'mb',['toolbar=0,status=0,resizable=1,width=440,height=430,left=',(s.width-440)/2,',top=',(s.height-430)/2].join('')))u.href=[f,p].join('');};if(/Firefox/.test(navigator.userAgent))setTimeout(a,0);else%20a();})(screen,document,encodeURIComponent,'','','http://cwb.assets.jianshu.io/notes/images/6862760/weibo/image_5206504780a8.jpg', '推荐 快门奴隶 的文章《教你如何用手机小清新修图燃爆朋友圈！（一）》（ 分享自 @简书 ）','http://www.jianshu.com/p/823963dabe31','页面编码gb2312|utf-8默认gb2312'));"
                           data-name="weibo">
                            <i class="fa fa-weibo"></i><span>分享到微博</span>
                        </a>
                        <a data-toggle="modal" href="#share-weixin-modal" data-name="weixin">
                            <i class="fa fa-weixin"></i><span>分享到微信</span>
                        </a>
                        <div class="more">
                            <a href="javascript:void(0)" data-toggle="dropdown">更多分享<i class="fa fa-caret-down"></i></a>
                            <ul class="dropdown-menu arrow-top">
                                <li>
                                    <a href="http://cwb.assets.jianshu.io/notes/images/6862760/weibo/image_5206504780a8.jpg"
                                       target="_blank" data-name="changweibo"><i class="fa fa-arrow-circle-o-down"></i>
                                        下载长微博图片</a>
                                </li>
                                <li>
                                    <a data-name="tweibo"
                                       href="javascript:void(function(){var d=document,e=encodeURIComponent,r='http://share.v.t.qq.com/index.php?c=share&amp;a=index&amp;url='+e('http://www.jianshu.com/p/823963dabe31')+'&amp;title='+e('推荐 快门奴隶 的文章《教你如何用手机小清新修图燃爆朋友圈！（一）》（ 分享自 @jianshuio ）'),x=function(){if(!window.open(r,'tweibo','toolbar=0,resizable=1,scrollbars=yes,status=1,width=600,height=600'))location.href=r};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})();">
                                        <img src="http://baijii-common.b0.upaiyun.com/social_icons/32x32/tweibo.png"
                                             alt="Tweibo"> 分享到腾讯微博
                                    </a></li>
                                <li>
                                    <a data-name="qzone"
                                       href="javascript:void(function(){var d=document,e=encodeURIComponent,r='http://sns.qzone.qq.com/cgi-bin/qzshare/cgi_qzshare_onekey?url='+e('http://www.jianshu.com/p/823963dabe31')+'&amp;title='+e('推荐 快门奴隶 的文章《教你如何用手机小清新修图燃爆朋友圈！（一）》'),x=function(){if(!window.open(r,'qzone','toolbar=0,resizable=1,scrollbars=yes,status=1,width=600,height=600'))location.href=r};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})();">
                                        <img src="http://baijii-common.b0.upaiyun.com/social_icons/32x32/qzone.png"
                                             alt="Qzone">
                                        分享到QQ空间
                                    </a></li>
                                <li>
                                    <a data-name="twitter"
                                       href="javascript:void(function(){var d=document,e=encodeURIComponent,r='https://twitter.com/share?url='+e('http://www.jianshu.com/p/823963dabe31')+'&amp;text='+e('推荐 快门奴隶 的文章《教你如何用手机小清新修图燃爆朋友圈！（一）》（ 分享自 @jianshucom ）')+'&amp;related='+e('jianshucom'),x=function(){if(!window.open(r,'twitter','toolbar=0,resizable=1,scrollbars=yes,status=1,width=600,height=600'))location.href=r};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})();">
                                        <img src="http://baijii-common.b0.upaiyun.com/social_icons/32x32/twitter.png"
                                             alt="Twitter"> 分享到Twitter
                                    </a></li>
                                <li>
                                    <a data-name="facebook"
                                       href="javascript:void(function(){var d=document,e=encodeURIComponent,r='https://www.facebook.com/dialog/share?app_id=483126645039390&amp;display=popup&amp;href=http://www.jianshu.com/p/823963dabe31',x=function(){if(!window.open(r,'facebook','toolbar=0,resizable=1,scrollbars=yes,status=1,width=450,height=330'))location.href=r};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})();">
                                        <img src="http://baijii-common.b0.upaiyun.com/social_icons/32x32/facebook.png"
                                             alt="Facebook"> 分享到Facebook
                                    </a></li>
                                <li>
                                    <a data-name="google_plus"
                                       href="javascript:void(function(){var d=document,e=encodeURIComponent,r='https://plus.google.com/share?url='+e('http://www.jianshu.com/p/823963dabe31'),x=function(){if(!window.open(r,'google_plus','toolbar=0,resizable=1,scrollbars=yes,status=1,width=450,height=330'))location.href=r};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})();">
                                        <img src="http://baijii-common.b0.upaiyun.com/social_icons/32x32/google_plus.png"
                                             alt="Google plus"> 分享到Google+
                                    </a></li>
                                <li>
                                    <a data-name="douban"
                                       href="javascript:void(function(){var d=document,e=encodeURIComponent,s1=window.getSelection,s2=d.getSelection,s3=d.selection,s=s1?s1():s2?s2():s3?s3.createRange().text:'',r='http://www.douban.com/recommend/?url='+e('http://www.jianshu.com/p/823963dabe31')+'&amp;title='+e('教你如何用手机小清新修图燃爆朋友圈！（一）')+'&amp;sel='+e(s)+'&amp;v=1',x=function(){if(!window.open(r,'douban','toolbar=0,resizable=1,scrollbars=yes,status=1,width=450,height=330'))location.href=r+'&amp;r=1'};if(/Firefox/.test(navigator.userAgent)){setTimeout(x,0)}else{x()}})()">
                                        <img src="http://baijii-common.b0.upaiyun.com/social_icons/32x32/douban.png"
                                             alt="Douban"> 分享到豆瓣
                                    </a></li>
                            </ul>
                        </div>
                    </div>
                </div>

                <!-- Modals -->
                <div id="share-weixin-modal" class="modal hide fade share-weixin-modal" tabindex="-1" role="dialog"
                     aria-labelledby="myModalLabel" aria-hidden="true">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    </div>
                    <div class="modal-body"
                         title="http://www.jianshu.com/p/823963dabe31?utm_campaign=maleskine&amp;utm_content=note&amp;utm_medium=reader_share&amp;utm_source=weixin">
                        <h5>打开微信“扫一扫”，打开网页后点击屏幕右上角分享按钮</h5>
                        <canvas width="170" height="170" style="display: none;"></canvas>
                        <img src="data:image/png;base64,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"
                             style="display: block;"></div>
                </div>


                <div id="notebooks-menu" class="panel notebooks-menu arrow-top modal hide fade"><img class="loader-tiny"
                                                                                                     src="http://baijii-common.b0.upaiyun.com/loaders/tiny.gif"
                                                                                                     alt="Tiny"></div>
                <div id="collection-menu" class="panel collection-menu arrow-top modal hide fade"><img
                        class="loader-tiny"
                        src="http://baijii-common.b0.upaiyun.com/loaders/tiny.gif"
                        alt="Tiny"></div>

                <%--<div id="likes-modal" class="modal modal_new support_list-modal fullscreen hide fade" tabindex="-1"--%>
                     <%--role="dialog" aria-hidden="true">--%>
                    <%--<div class="modal-dialog">--%>
                        <%--<div class="modal-content">--%>
                            <%--<div class="modal-header">--%>
                                <%--<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>--%>
                                <%--<h3>喜欢的用户</h3>--%>
                            <%--</div>--%>
                            <%--<div class="modal-body">--%>
                                <%--<ul class="unstyled users">--%>
                                    <%--<li data-user-id="3276456"><a class="avatar" href="/users/304551ec5242"> <img--%>
                                            <%--src="http://upload.jianshu.io/users/upload_avatars/3276456/d6ea7e686e6e?imageMogr/thumbnail/90x90/quality/100">--%>
                                    <%--</a> <a class="blue-link" href="/users/304551ec5242">unique_sunshine</a> <span--%>
                                            <%--class="time">2016.11.15 11:15</span>--%>
                                    <%--</li>--%>
                                    <%--<li data-user-id="1496076"><a class="avatar" href="/users/9923b5af2f82"> <img--%>
                                            <%--src="http://upload.jianshu.io/users/upload_avatars/1496076/8cc1ba08bc31.jpeg?imageMogr/thumbnail/90x90/quality/100">--%>
                                    <%--</a> <a class="blue-link" href="/users/9923b5af2f82">凉川姑凉叫小柒</a> <span class="time">2016.11.15 11:15</span>--%>
                                    <%--</li>--%>
                                    <%--<li data-user-id="3660913"><a class="avatar" href="/users/e7b2006f52a5"> <img--%>
                                            <%--src="http://upload.jianshu.io/users/upload_avatars/3660913/bae812508ed4.jpeg?imageMogr/thumbnail/90x90/quality/100">--%>
                                    <%--</a> <a class="blue-link" href="/users/e7b2006f52a5">雪化</a> <span class="time">2016.11.15 11:14</span>--%>
                                    <%--</li>--%>
                                    <%--<li data-user-id="3304307"><a class="avatar" href="/users/4aff6baae17d"> <img--%>
                                            <%--src="http://upload.jianshu.io/users/upload_avatars/3304307/e6f3b59ee802.jpeg?imageMogr/thumbnail/90x90/quality/100">--%>
                                    <%--</a> <a class="blue-link" href="/users/4aff6baae17d">歌者海棠大海</a> <span class="time">2016.11.15 11:13</span>--%>
                                    <%--</li>--%>
                                    <%--<li data-user-id="1163100"><a class="avatar" href="/users/66828f6dd8dc"> <img--%>
                                            <%--src="http://upload.jianshu.io/users/upload_avatars/1163100/534d5748a12c.jpeg?imageMogr/thumbnail/90x90/quality/100">--%>
                                    <%--</a> <a class="blue-link" href="/users/66828f6dd8dc">边玩去</a> <span class="time">2016.11.15 11:12</span>--%>
                                    <%--</li>--%>
                                    <%--<li data-user-id="1806767"><a class="avatar" href="/users/3e7c3922aaf7"> <img--%>
                                            <%--src="http://upload.jianshu.io/users/upload_avatars/1806767/e665b2d334c1.jpeg?imageMogr/thumbnail/90x90/quality/100">--%>
                                    <%--</a> <a class="blue-link" href="/users/3e7c3922aaf7">流年易逝6</a> <span class="time">2016.11.15 11:09</span>--%>
                                    <%--</li>--%>
                                    <%--<li data-user-id="1881134"><a class="avatar" href="/users/ef87b1f8701d"> <img--%>
                                            <%--src="http://upload.jianshu.io/users/upload_avatars/1881134/0a425a903f43.jpeg?imageMogr/thumbnail/90x90/quality/100">--%>
                                    <%--</a> <a class="blue-link" href="/users/ef87b1f8701d">夏刻_清和</a> <span class="time">2016.11.15 11:06</span>--%>
                                    <%--</li>--%>
                                    <%--<li data-user-id="1744147"><a class="avatar" href="/users/340966be70a3"> <img--%>
                                            <%--src="http://upload.jianshu.io/users/upload_avatars/1744147/17b71243f904.jpg?imageMogr/thumbnail/90x90/quality/100">--%>
                                    <%--</a> <a class="blue-link" href="/users/340966be70a3">不会笑的向日葵</a> <span class="time">2016.11.15 11:04</span>--%>
                                    <%--</li>--%>
                                    <%--<li data-user-id="2103540"><a class="avatar" href="/users/c733380e3bb5"> <img--%>
                                            <%--src="http://upload.jianshu.io/users/upload_avatars/2103540/c5c58bd34a85.jpeg?imageMogr/thumbnail/90x90/quality/100">--%>
                                    <%--</a> <a class="blue-link" href="/users/c733380e3bb5">子双木扬</a> <span class="time">2016.11.15 11:02</span>--%>
                                    <%--</li>--%>
                                    <%--<li data-user-id="3557076"><a class="avatar" href="/users/716c0f828be9"> <img--%>
                                            <%--src="http://upload.jianshu.io/users/upload_avatars/3557076/2de61c1f127e.jpeg?imageMogr/thumbnail/90x90/quality/100">--%>
                                    <%--</a> <a class="blue-link" href="/users/716c0f828be9">朽年I</a> <span class="time">2016.11.15 11:01</span>--%>
                                    <%--</li>--%>
                                    <%--<li data-user-id="618364"><a class="avatar" href="/users/cab9b8c18f1b"> <img--%>
                                            <%--src="http://upload.jianshu.io/users/upload_avatars/618364/d273187483fa.jpeg?imageMogr/thumbnail/90x90/quality/100">--%>
                                    <%--</a> <a class="blue-link" href="/users/cab9b8c18f1b">大园子</a> <span class="time">2016.11.15 10:59</span>--%>
                                    <%--</li>--%>
                                    <%--<li data-user-id="3641048"><a class="avatar" href="/users/940f0e3e2cad"> <img--%>
                                            <%--src="http://cdn-qn0.jianshu.io/assets/default_avatar/1-cd1d6dd91a96ca16fafcc8896bbc7b32.jpg">--%>
                                    <%--</a> <a class="blue-link" href="/users/940f0e3e2cad">娄子一</a> <span class="time">2016.11.15 10:56</span>--%>
                                    <%--</li>--%>
                                    <%--<li data-user-id="3647504"><a class="avatar" href="/users/d0475b0d0dfe"> <img--%>
                                            <%--src="http://cdn-qn0.jianshu.io/assets/default_avatar/6-c3a19bc117a55e66cd3be55684d8191c.jpg">--%>
                                    <%--</a> <a class="blue-link" href="/users/d0475b0d0dfe">柳长啸</a> <span class="time">2016.11.15 10:55</span>--%>
                                    <%--</li>--%>
                                    <%--<li data-user-id="3427008"><a class="avatar" href="/users/5222068b2865"> <img--%>
                                            <%--src="http://upload.jianshu.io/users/upload_avatars/3427008/3410f399c17a.jpeg?imageMogr/thumbnail/90x90/quality/100">--%>
                                    <%--</a> <a class="blue-link" href="/users/5222068b2865">素浅倾华</a> <span class="time">2016.11.15 10:49</span>--%>
                                    <%--</li>--%>
                                    <%--<li data-user-id="3672537"><a class="avatar" href="/users/652339a4f576"> <img--%>
                                            <%--src="http://upload.jianshu.io/users/upload_avatars/3672537/85ceb1f6ee17.jpeg?imageMogr/thumbnail/90x90/quality/100">--%>
                                    <%--</a> <a class="blue-link" href="/users/652339a4f576">margreteyoyo</a> <span--%>
                                            <%--class="time">2016.11.15 10:49</span>--%>
                                    <%--</li>--%>
                                    <%--<a class="more hidden" data-max-id="44058702" href="javascript:void(null);"><i--%>
                                            <%--class="fa fa-ellipsis-h"></i></a></ul>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</div>--%>


                <!-- Comments -->
                <div id="comments" class="comment-list clearfix">
                    <div class="comment-head clearfix">
                        16条评论
                        <span class="order">
            （
            <a data-order="asc" class="active" href="javascript:void(0)">按时间正序</a>·
            <a data-order="desc" href="javascript:void(0)">按时间倒序</a>·
            <a data-order="likes_count" href="javascript:void(0)">按喜欢排序</a>
            ）
          </span>
                        <a class="goto-comment pull-right" data-signin-link="true" data-toggle="modal" href="/sign_in">
                            <i class="fa fa-pencil"></i>添加新评论
                        </a></div>
                    <div id="comment-list">


                        <div class="note-comment clearfix" id="comment-5553380">
                            <div class="content">
                                <div class="meta-top">
                                    <a class="avatar" href="/users/16ef34791729">
                                        <img src="http://upload.jianshu.io/users/upload_avatars/3609219/fc503936908f?imageMogr/thumbnail/90x90/quality/100"
                                             alt="100">
                                    </a>
                                    <p>
                                        <a class="author-name" href="/users/16ef34791729">兔小白在漫游</a>
                                    </p>
                                    <span class="reply-time">
          <small>2 楼 · </small>
          <a href="/p/823963dabe31/comments/5553380#comment-5553380">2016.11.11 04:58</a></span>
                                </div>
                                <p><img src="http://assets.jianshu.io/assets/emojis/+1.png" alt=":+1:" title=":+1:"
                                        class="emoji" width="20" height="20"></p>
                                <div class="comment-footer clearfix text-right">
                                    <a data-id="5553380" class="like pull-left" href="javascript:void(0)">
                                        <i class="fa fa-heart-o"></i>喜欢<span>(0)</span>
                                    </a>

                                    <a data-id="5553380" data-nickname="兔小白在漫游" class="reply" href="javascript:void(0)">回复</a>


                                </div>
                                <div class="child-comment-list ">
                                    <div class="child-comment" id="comment-5563269" data-id="5563269">
                                        <p>
                                            <a class="blue-link" href="/users/fd0b03fc2a9e">快门奴隶</a>：
                                            <a href="/users/16ef34791729" class="maleskine-author" target="_blank"
                                               data-user-slug="16ef34791729">@兔小白在漫游</a> <img
                                                src="http://assets.jianshu.io/assets/emojis/kissing_heart.png"
                                                alt=":kissing_heart:" title=":kissing_heart:" class="emoji" width="20"
                                                height="20">
                                        </p>
                                        <div class="child-comment-footer text-right clearfix">

                                            <a data-id="5553380" data-nickname="快门奴隶" class="reply"
                                               href="javascript:void(null)">回复</a>


                                            <span class="reply-time pull-left">
        <a href="/p/823963dabe31/comments/5563269#comment-5563269">2016.11.11 14:32</a></span>

                                        </div>
                                    </div>

                                    <div data-state="remaining-child-comments"></div>
                                    <div class="comment-toolbar clearfix">
          <span class="pull-right">
            <a data-id="5553380" class="reply" href="javascript:void(null)"><i class="fa fa-pencil"></i> 添加新回复</a>
          </span>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="note-comment clearfix" id="comment-5561238">
                            <div class="content">
                                <div class="meta-top">
                                    <a class="avatar" href="/users/4622fe3ccbf6">
                                        <img src="http://upload.jianshu.io/users/upload_avatars/2858147/4f2fc3030c23.jpg?imageMogr/thumbnail/90x90/quality/100"
                                             alt="100">
                                    </a>
                                    <p>
                                        <a class="author-name" href="/users/4622fe3ccbf6">穿长裙的风清扬</a>
                                    </p>
                                    <span class="reply-time">
          <small>3 楼 · </small>
          <a href="/p/823963dabe31/comments/5561238#comment-5561238">2016.11.11 13:01</a></span>
                                </div>
                                <p>黑白呢</p>
                                <div class="comment-footer clearfix text-right">
                                    <a data-id="5561238" class="like pull-left" href="javascript:void(0)">
                                        <i class="fa fa-heart-o"></i>喜欢<span>(0)</span>
                                    </a>

                                    <a data-id="5561238" data-nickname="穿长裙的风清扬" class="reply"
                                       href="javascript:void(0)">回复</a>


                                </div>
                                <div class="child-comment-list ">
                                    <div class="child-comment" id="comment-5563263" data-id="5563263">
                                        <p>
                                            <a class="blue-link" href="/users/fd0b03fc2a9e">快门奴隶</a>：
                                            <a href="/users/4622fe3ccbf6" class="maleskine-author" target="_blank"
                                               data-user-slug="4622fe3ccbf6">@穿长裙的风清扬</a> 我下一期会讲哦<img
                                                src="http://assets.jianshu.io/assets/emojis/smiley.png" alt=":smiley:"
                                                title=":smiley:" class="emoji" width="20" height="20">
                                        </p>
                                        <div class="child-comment-footer text-right clearfix">

                                            <a data-id="5561238" data-nickname="快门奴隶" class="reply"
                                               href="javascript:void(null)">回复</a>


                                            <span class="reply-time pull-left">
        <a href="/p/823963dabe31/comments/5563263#comment-5563263">2016.11.11 14:32</a></span>

                                        </div>
                                    </div>
                                    <div class="child-comment" id="comment-5592236" data-id="5592236">
                                        <p>
                                            <a class="blue-link" href="/users/4622fe3ccbf6">穿长裙的风清扬</a>：
                                            <a href="/users/fd0b03fc2a9e" class="maleskine-author" target="_blank"
                                               data-user-slug="fd0b03fc2a9e">@快门奴隶</a> 那你快点
                                        </p>
                                        <div class="child-comment-footer text-right clearfix">

                                            <a data-id="5561238" data-nickname="穿长裙的风清扬" class="reply"
                                               href="javascript:void(null)">回复</a>


                                            <span class="reply-time pull-left">
        <a href="/p/823963dabe31/comments/5592236#comment-5592236">2016.11.12 19:50</a></span>

                                        </div>
                                    </div>
                                    <div class="child-comment" id="comment-5598596" data-id="5598596">
                                        <p>
                                            <a class="blue-link" href="/users/fd0b03fc2a9e">快门奴隶</a>：
                                            <a href="/users/4622fe3ccbf6" class="maleskine-author" target="_blank"
                                               data-user-slug="4622fe3ccbf6">@穿长裙的风清扬</a> 其实黑白的话vsco 有很多种，每一种都很有feel
                                            啊。再针对照片本身基础调一下就会很好看
                                        </p>
                                        <div class="child-comment-footer text-right clearfix">

                                            <a data-id="5561238" data-nickname="快门奴隶" class="reply"
                                               href="javascript:void(null)">回复</a>


                                            <span class="reply-time pull-left">
        <a href="/p/823963dabe31/comments/5598596#comment-5598596">2016.11.12 23:41</a></span>

                                        </div>
                                    </div>

                                    <div data-state="remaining-child-comments"></div>
                                    <div class="comment-toolbar clearfix">
          <span class="pull-right">
            <a data-id="5561238" class="reply" href="javascript:void(null)"><i class="fa fa-pencil"></i> 添加新回复</a>
          </span>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="note-comment clearfix" id="comment-5608313">
                            <div class="content">
                                <div class="meta-top">
                                    <a class="avatar" href="/users/0f884507fc45">
                                        <img src="http://upload.jianshu.io/users/upload_avatars/3404954/0cc7771167be?imageMogr/thumbnail/90x90/quality/100"
                                             alt="100">
                                    </a>
                                    <p>
                                        <a class="author-name" href="/users/0f884507fc45">晚三水</a>
                                    </p>
                                    <span class="reply-time">
          <small>4 楼 · </small>
          <a href="/p/823963dabe31/comments/5608313#comment-5608313">2016.11.13 14:09</a></span>
                                </div>
                                <p><img src="http://assets.jianshu.io/assets/emojis/+1.png" alt=":+1:" title=":+1:"
                                        class="emoji" width="20" height="20"><img
                                        src="http://assets.jianshu.io/assets/emojis/+1.png" alt=":+1:" title=":+1:"
                                        class="emoji" width="20" height="20"></p>
                                <div class="comment-footer clearfix text-right">
                                    <a data-id="5608313" class="like pull-left" href="javascript:void(0)">
                                        <i class="fa fa-heart-o"></i>喜欢<span>(0)</span>
                                    </a>

                                    <a data-id="5608313" data-nickname="晚三水" class="reply"
                                       href="javascript:void(0)">回复</a>


                                </div>
                                <div class="child-comment-list hide">

                                    <div data-state="remaining-child-comments"></div>
                                </div>
                            </div>
                        </div>

                        <div class="note-comment clearfix" id="comment-5654825">
                            <div class="content">
                                <div class="meta-top">
                                    <a class="avatar" href="/users/457e28b8dfff">
                                        <img src="http://upload.jianshu.io/users/upload_avatars/33193/90d91adeddc6?imageMogr/thumbnail/90x90/quality/100"
                                             alt="100">
                                    </a>
                                    <p>
                                        <a class="author-name" href="/users/457e28b8dfff">望不到边的城</a>
                                    </p>
                                    <span class="reply-time">
          <small>5 楼 · </small>
          <a href="/p/823963dabe31/comments/5654825#comment-5654825">2016.11.15 08:49</a></span>
                                </div>
                                <p>不错，学习了</p>
                                <div class="comment-footer clearfix text-right">
                                    <a data-id="5654825" class="like pull-left" href="javascript:void(0)">
                                        <i class="fa fa-heart-o"></i>喜欢<span>(0)</span>
                                    </a>

                                    <a data-id="5654825" data-nickname="望不到边的城" class="reply" href="javascript:void(0)">回复</a>


                                </div>
                                <div class="child-comment-list hide">

                                    <div data-state="remaining-child-comments"></div>
                                </div>
                            </div>
                        </div>

                        <div class="note-comment clearfix" id="comment-5655775">
                            <div class="content">
                                <div class="meta-top">
                                    <a class="avatar" href="/users/f2f36c3bc00e">
                                        <img src="http://upload.jianshu.io/users/upload_avatars/3032998/a9d70e2b0836?imageMogr/thumbnail/90x90/quality/100"
                                             alt="100">
                                    </a>
                                    <p>
                                        <a class="author-name" href="/users/f2f36c3bc00e">chenen</a>
                                    </p>
                                    <span class="reply-time">
          <small>6 楼 · </small>
          <a href="/p/823963dabe31/comments/5655775#comment-5655775">2016.11.15 09:21</a></span>
                                </div>
                                <p>还好……</p>
                                <div class="comment-footer clearfix text-right">
                                    <a data-id="5655775" class="like pull-left" href="javascript:void(0)">
                                        <i class="fa fa-heart-o"></i>喜欢<span>(0)</span>
                                    </a>

                                    <a data-id="5655775" data-nickname="chenen" class="reply" href="javascript:void(0)">回复</a>


                                </div>
                                <div class="child-comment-list hide">

                                    <div data-state="remaining-child-comments"></div>
                                </div>
                            </div>
                        </div>

                        <div class="note-comment clearfix" id="comment-5655862">
                            <div class="content">
                                <div class="meta-top">
                                    <a class="avatar" href="/users/484e1c9f1ae9">
                                        <img src="http://upload.jianshu.io/users/upload_avatars/1334681/4ce8fe29ef38.png?imageMogr/thumbnail/90x90/quality/100"
                                             alt="100">
                                    </a>
                                    <p>
                                        <a class="author-name" href="/users/484e1c9f1ae9">菲拉兔</a>
                                    </p>
                                    <span class="reply-time">
          <small>7 楼 · </small>
          <a href="/p/823963dabe31/comments/5655862#comment-5655862">2016.11.15 09:25</a></span>
                                </div>
                                <p>还燃爆朋友圈。。。 <img src="http://assets.jianshu.io/assets/emojis/sweat.png" alt=":sweat:"
                                                  title=":sweat:" class="emoji" width="20" height="20"></p>
                                <div class="comment-footer clearfix text-right">
                                    <a data-id="5655862" class="like pull-left" href="javascript:void(0)">
                                        <i class="fa fa-heart-o"></i>喜欢<span>(2)</span>
                                    </a>

                                    <a data-id="5655862" data-nickname="菲拉兔" class="reply"
                                       href="javascript:void(0)">回复</a>


                                </div>
                                <div class="child-comment-list ">
                                    <div class="child-comment" id="comment-5658932" data-id="5658932">
                                        <p>
                                            <a class="blue-link" href="/users/55de93f641f7">四爷在此</a>：
                                            <a href="/users/484e1c9f1ae9" class="maleskine-author" target="_blank"
                                               data-user-slug="484e1c9f1ae9">@菲拉兔</a> haha。怎么燃爆
                                        </p>
                                        <div class="child-comment-footer text-right clearfix">

                                            <a data-id="5655862" data-nickname="四爷在此" class="reply"
                                               href="javascript:void(null)">回复</a>


                                            <span class="reply-time pull-left">
        <a href="/p/823963dabe31/comments/5658932#comment-5658932">2016.11.15 11:02</a></span>

                                        </div>
                                    </div>
                                    <div class="child-comment" id="comment-5659024" data-id="5659024">
                                        <p>
                                            <a class="blue-link" href="/users/fd0b03fc2a9e">快门奴隶</a>：
                                            <a href="/users/55de93f641f7" class="maleskine-author" target="_blank"
                                               data-user-slug="55de93f641f7">@四爷在此</a> 哎呀不是说标题一定要够吸引人吗<img
                                                src="http://assets.jianshu.io/assets/emojis/joy.png" alt=":joy:"
                                                title=":joy:"
                                                class="emoji" width="20" height="20">
                                        </p>
                                        <div class="child-comment-footer text-right clearfix">

                                            <a data-id="5655862" data-nickname="快门奴隶" class="reply"
                                               href="javascript:void(null)">回复</a>


                                            <span class="reply-time pull-left">
        <a href="/p/823963dabe31/comments/5659024#comment-5659024">2016.11.15 11:05</a></span>

                                        </div>
                                    </div>
                                    <div class="child-comment" id="comment-5659165" data-id="5659165">
                                        <p>
                                            <a class="blue-link" href="/users/55de93f641f7">四爷在此</a>：
                                            <a href="/users/fd0b03fc2a9e" class="maleskine-author" target="_blank"
                                               data-user-slug="fd0b03fc2a9e">@快门奴隶</a> 确实吸引我进来看了。还不错，这个APP
                                            我也用过，颗粒感确实不错哈哈！
                                            你有空也可以看看我前两天写的 人像定焦镜头 的文章。
                                            c </p>
                                        <div class="child-comment-footer text-right clearfix">

                                            <a data-id="5655862" data-nickname="四爷在此" class="reply"
                                               href="javascript:void(null)">回复</a>


                                            <span class="reply-time pull-left">
        <a href="/p/823963dabe31/comments/5659165#comment-5659165">2016.11.15 11:10</a></span>

                                        </div>
                                    </div>

                                    <div data-state="remaining-child-comments"></div>
                                    <div class="comment-toolbar clearfix">
          <span class="pull-right">
            <a data-id="5655862" class="reply" href="javascript:void(null)"><i class="fa fa-pencil"></i> 添加新回复</a>
          </span>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="note-comment clearfix" id="comment-5657061">
                            <div class="content">
                                <div class="meta-top">
                                    <a class="avatar" href="/users/2fe7f3c787b7">
                                        <img src="http://upload.jianshu.io/users/upload_avatars/3008403/5e04fdd93b37.jpg?imageMogr/thumbnail/90x90/quality/100"
                                             alt="100">
                                    </a>
                                    <p>
                                        <a class="author-name" href="/users/2fe7f3c787b7">玩转淘宝</a>
                                    </p>
                                    <span class="reply-time">
          <small>8 楼 · </small>
          <a href="/p/823963dabe31/comments/5657061#comment-5657061">2016.11.15 10:04</a></span>
                                </div>
                                <p>阶乘运算式中的数据不匹配！</p>
                                <div class="comment-footer clearfix text-right">
                                    <a data-id="5657061" class="like pull-left" href="javascript:void(0)">
                                        <i class="fa fa-heart-o"></i>喜欢<span>(2)</span>
                                    </a>
                                    <a data-id="5657061" data-nickname="玩转淘宝" class="reply"
                                       href="javascript:void(0)">回复</a>
                                </div>
                                <div class="child-comment-list ">
                                    <div class="child-comment" id="comment-5657350" data-id="5657350">
                                        <p>
                                            <a class="blue-link" href="/users/fd0b03fc2a9e">快门奴隶</a>：
                                            <a href="/users/2fe7f3c787b7" class="maleskine-author" target="_blank"
                                               data-user-slug="2fe7f3c787b7">@玩转淘宝</a> 啥？
                                        </p>
                                        <div class="child-comment-footer text-right clearfix">
                                            <a data-id="5657061" data-nickname="快门奴隶" class="reply"
                                               href="javascript:void(null)">回复</a>
                                            <span class="reply-time pull-left">
                                    <a href="/p/823963dabe31/comments/5657350#comment-5657350">2016.11.15 10:13</a></span>
                                        </div>
                                    </div>

                                    <div data-state="remaining-child-comments"></div>
                                    <div class="comment-toolbar clearfix">
                                <span class="pull-right">
                                    <a data-id="5657061" class="reply" href="javascript:void(null)"><i
                                            class="fa fa-pencil"></i> 添加新回复</a>
                                </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="note-comment clearfix" id="comment-5659088">
                            <div class="content">
                                <div class="meta-top">
                                    <a class="avatar" href="/users/df01d9210ef2">
                                        <%--<img src="http://cdn-qn0.jianshu.io/assets/default_avatar/10-f47ea4d685571bcb63f5b1ea99527d09.jpg"--%>
                                             alt="10">
                                    </a>
                                    <p>
                                        <a class="author-name" href="/users/df01d9210ef2">其实2</a>
                                    </p>
                                    <span class="reply-time">
          <small>9 楼 · </small>
          <a href="/p/823963dabe31/comments/5659088#comment-5659088">2016.11.15 11:07</a></span>
                                </div>
                                <p>看福利直播＋薇j⑧⑤②328j</p>
                                <div class="comment-footer clearfix text-right">
                                    <a data-id="5659088" class="like pull-left" href="javascript:void(0)">
                                        <i class="fa fa-heart-o"></i>喜欢<span>(0)</span>
                                    </a>
                                    <a data-id="5659088" data-nickname="其实2" class="reply"
                                       href="javascript:void(0)">回复</a>
                                </div>
                                <div class="child-comment-list hide">
                                    <div data-state="remaining-child-comments"></div>
                                </div>
                            </div>
                        </div>
                        <p class="load-more">
                            <a class="blue-link" data-type="html" data-action="load-comments" data-remote="true"
                               href="/notes/6862760/comments?max_id=5659165&amp;order=asc&amp;page=2">加载更多 <i
                                    class="fa fa-arrow-down"></i></a>
                        </p>
                    </div>
                    <p class="signout-comment">
                        <a class="btn btn-info" data-signin-link="true" data-toggle="modal" href="/sign_in">
                            登录后发表评论
                        </a></p>
                </div>
                <!-- -->
            </div>
        </div>

        <br>










    </div>
</div>