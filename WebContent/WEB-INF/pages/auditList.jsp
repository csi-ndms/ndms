<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<title>待审核订单</title>
</head>
<body>
<div>
	<div>
		<h3>审核采购订单</h3><hr>
	</div>
	<div class="panel-body">
			<table border="1" class="table table-striped">
				<tr><td>商品编号</td><td>商品名称</td><td>单价</td><td>数量</td><td>合计</td><td>供货商</td>
				<td>订单日期</td><td>预收时间</td><td>采购人</td><td>订单状态</td></tr>
				<c:forEach var="order" items="${orders }">
					<tr><td>${order.goodsId }</td><td><a href="searchSimple?id=${order.id }">${order.goodsName }</a></td><td>${order.unitPrice }</td>
					<td>${order.amount }</td><td>${order.total }&nbsp;元</td><td>${order.supplier.supplierName }</td><td>${order.orderTime }</td>
					<td>${order.receiptTime }</td><td>${order.orderPeople }</td><td>${order.status }</td></tr>
				</c:forEach>
			</table>
	</div>
</div>
</body>
</html>