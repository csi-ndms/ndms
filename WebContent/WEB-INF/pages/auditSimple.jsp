<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<title>审核订单</title>
<script type="text/javascript">
function audit(status){
	var auditForm = document.getElementById("auditform");
	auditForm.action = "updateOrder?status="+status;
	auditForm.method = "post";
	auditForm.submit();
}
</script>
</head>
<body>
<div class="panel-body">
	<h3>${order.goodsName}&nbsp;订单</h3><hr>
</div>
<div class="panel-body" style="width: 700px">
	<form id="auditform">
		<table class="table">
			<tr><td>商品编号：</td><td>${order.goodsId }</td><td>商品名称：</td><td>${order.goodsName }</td></tr>
			<tr><td>进价：</td><td>${order.unitPrice }</td><td>数量：</td><td>${order.amount }&nbsp;${order.unitType }</td></tr>
			<tr><td>合计：</td><td>${order.total }</td><td>供货商：</td><td>${order.supplier.supplierName }</td></tr>
			<tr><td>联系人：</td><td>${order.supplier.linkman }</td><td>电话：</td><td>${order.supplier.phone }</td></tr>
			<tr><td>订单日期：</td><td>${order.orderTime }</td><td>预收时间：</td><td>${order.receiptTime }</td></tr>
			<tr><td>采购人：</td><td>${order.orderPeople }</td></tr>
			<tr><td>审核人：</td><td><input type="text" name="auditor" class="form-control"></td><td>备注：</td><td><input type="text" name="remark" class="form-control"></td></tr>
		</table>
		<input type="hidden" name="id" value="${order.id }">
	</form>
	<button onclick="audit('已通过')" class="btn btn-primary">通过</button>&nbsp;
	<button onclick="audit('未通过')" class="btn btn-primary">驳回</button>
</div>
</body>
</html>