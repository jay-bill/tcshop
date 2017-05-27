
$(function(){
    $.getJSON("http://calis.yangtzeu.edu.cn/book/api/bookinfo", { pageCount: 20,pageIndex:1,category:3297,lastSku:12061343 }, function (data) {

    	$.ajax({

			url:'addBook',
			type:'post',
            contentType : 'application/json',
			dataType:'json',
			data:data,
			success:function(){
				alert("成功了");
			}
		})

    });
})