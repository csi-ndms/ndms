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

<title>添加商品类</title>
</head>
<body>
	<div class="panel-body">
		<div><h3>添加商品类</h3></div><hr>
		<div>
			<form action="addGoods" method="post">
			<table>
			<tr><td>商品序号：</td><td><input type="text" name="goodsid" class="form-control"></td></tr>
			<tr><td>商品名称：</td><td><input type="text" name="goodsname" class="form-control"></td></tr>
			<tr><td>商品类型：</td>
			<td><select name="goodstypeid">
					<option>药品</option>
					<option>保健品</option>
					<option>医疗器材</option>
					<option>其它</option>
			</select></td></tr>
			<tr><td>规格：</td><td><input type="text" name="unittype" class="form-control"></td></tr>
			<tr><td>建议零售价：</td><td><input type="text" name="price" class="form-control"></td><td>元</td></tr>
			<tr><td>批准文号：</td><td><input type="text" name="approval" class="form-control"></td></tr>
			</table>
			<input type="submit" value="确认" class="btn btn-primary">&nbsp;<a href="procurement" class="btn btn-primary">取消</a>
			</form>
		</div>
	</div>
</body>
</html>