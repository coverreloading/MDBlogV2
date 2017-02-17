
/**
 * Created by loadi on 2017/2/17.
 */
// 辣鸡日期转换
(function ($) {
    $.extend({
        myTime: {
            /**
             * 时间戳转换日期
             * @param <int> unixTime    待时间戳(秒)
             */
            UnixToDate: function (unixTime) {
                var date = new Date(unixTime);
                var month = date.getMonth()+1;
                return date.getFullYear() + "-" + month + "-" + date.getDate() + " " + date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds();
            }
        }
    });
})(jQuery);