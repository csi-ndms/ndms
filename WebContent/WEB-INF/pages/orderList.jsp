<%@page import="java.util.ArrayList"%>
<%@page import="com.nfi.ndms.beans.Order"%>
<%@page import="java.util.List"%>
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
<title>采购订单</title>
</head>
<body>
<div class="panel-body">
	<div>
		<h3>采购订单信息</h3><hr><a href="procurement">添加订单</a>
	</div>
	<div>
		<form action="searchOrders" method="get">
		条件查找&nbsp;采购人：<input type="text" name="thisOrderman">&nbsp;审核人：<input type="text" name="thisAudit">&nbsp;商品名称：<input type="text" name="thisGoodName">
		<input type="submit" value="搜索" class="btn btn-primary"></form>
	</div>
	<div>
		<table border="1" class="table table-striped">
			<tr><td>商品编号</td><td>商品名称</td><td>单价</td><td>数量</td><td>合计</td><td>供货商</td>
			<td>订单日期</td><td>预收时间</td><td>采购人</td><td>审核人</td><td>订单状态</td><td>备注</td></tr>
			<c:forEach var="order" items="${orders }">
				<tr><td>${order.goodsId }</td><td>${order.goodsName }</td><td>${order.unitPrice }</td><td>${order.amount }</td>
				<td>${order.total }&nbsp;元</td><td>${order.supplier.supplierName }</td><td>${order.orderTime }</td><td>${order.receiptTime }</td>
				<td>${order.orderPeople }</td><td>${order.auditor }</td><td id="status">${order.status}</td><td>${order.remark }</td></tr>
			</c:forEach>
		</table>
	</div>
</div>
</body>
</html>