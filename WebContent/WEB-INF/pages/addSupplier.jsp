<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

<title>添加供应商信息</title>
</head>
<body>
<div class="panel-body">
	<h3>添加供应商信息</h3><hr>
	<div>
		<form action="addSup" method="post">
			<table><tr>
			<td>供应商：</td><td><input type="text" name="suppliername" class="form-control"></td></tr>
			<tr><td>地址：</td><td><input type="text" name="address" class="form-control"></td></tr>
			<tr><td>联系人：</td><td><input type="text" name="linkman" class="form-control"></td></tr>
			<tr><td>联系人电话：</td><td><input type="text" name="phone" class="form-control"></td></tr>
			</table>
			<input type="submit" value="添加" class="btn btn-primary">
			<a href="procurement" class="btn btn-primary">取消</a>
		</form>
	</div>
</div>
</body>
</html>