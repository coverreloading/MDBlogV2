/**
 * Created by loadi on 2017/2/4.
 */
$(document).ready(function () {

    $.get("a/3", function(data){
        var strJSON = data;
        var obj = new Function("return" + strJSON)();
        alert(obj.data.raText);
    });

})

// $http({
//     method: 'GET',
//     url: 'localhost:8080/a/1',
// }).success(function (data) {
//         alert(data.raText)
//     })