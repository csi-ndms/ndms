<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="vendor/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="vendor/linearicons/style.css">
	<!-- MAIN CSS -->
	<link rel="stylesheet" href="vendor/main.css">
	<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
	<link rel="stylesheet" href="vendor/demo.css">
	<!-- GOOGLE FONTS -->
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">

<script src="http://libs.baidu.com/jquery/1.10.2/jquery.min.js">
</script>
<title>商品库信息</title>
<script type="text/javascript">
$(function(){
	var table = $("#table1")
	table.append("<tr><td>序号</td><td>商品编号</td><td>商品名</td><td>商品类型</td><td>规格</td><td>售价</td><td>操作</td></tr>");
	$.get("allGoods",function(data,status){
		if (status == "success"){
			var allGoods = JSON.parse(data);
			for(var i = 0 ; i < allGoods.length ; i++){
				table.append("<tr><td>" + allGoods[i].id + "</td><td>" + allGoods[i].goodsId + "</td><td>" + allGoods[i].goodsName
						+"</td><td>"+allGoods[i].goodsType+"</td><td>"+allGoods[i].unitType+"</td><td>"+allGoods[i].price
						+"</td><td><a href='deleteGoods?id="+allGoods[i].id+"'>删除</a></td></tr>")
			}
		}
	})
})
</script>
</head>
<body>
<div class="panel-body" style="width: 800px;height: 500px">
	<div>
		<h3>商品库</h3><hr><a href="pharmaceuticals">添加商品</a>&nbsp;<a href="procurement">添加订单</a>
	</div>
	<div>
		<table border="1" id="table1" class="table table-striped">
		</table>
	</div>
</div>
</body>
</html>