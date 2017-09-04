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
	<!-- ICONS -->
<script src="http://libs.baidu.com/jquery/1.10.2/jquery.min.js">
</script>
<title>添加采购</title>
<script type="text/javascript" src="vendor/calendar/lhgcore.js"></script>
<script type="text/javascript" src="vendor/calendar/date.js"></script>
<script type="text/javascript">
function findGoods(){
$(function(){
	var goodsid = document.getElementById("goodsid").value;
	$.get("searchGoods",{"goodsId":goodsid},function(data,status){
		if (status=="success"){
			show(data);
		}
	})
})
}
function show(data){
		
		if (data != "该商品不存在，请添加商品类"){
			var goods = JSON.parse(data);
			document.getElementById("goodsname").value = goods.goodsName;
			$("#unit").html(" " + goods.unitType);
			$("#inputType").val("&nbsp;"+goods.unitType)
			$("#prompting").html("");
		}else{
			$("#prompting").html("该商品不存在，请添加商品类");
			document.getElementById("goodsname").value = "";
			$("#unit").html("");
		}
}

function init(){
 	$(function(){
		$.get("allSupplier",function(data,status){
			if(status == "success"){
				var supname = document.getElementById("suppliername")
				var jsonSup = JSON.parse(data);
				for(var i = 0; i < jsonSup.length; i++){
					supname.options.add(new Option(jsonSup[i].supplierName,jsonSup[i].supplierId));
				}
			}
		})
	}) 
}

function test(val,id){
	if(!isNaN(val)){
		$("#"+id).html("");
	}else{
		$("#"+id).html("格式不正确，请重新输入");
	}
}

function calculate(){
	var price = document.getElementById("cost").value;
	var amount = document.getElementById("quantity").value;
	if (price != "" && !isNaN(price) && amount != "" && !isNaN(amount)){
		$("#total").html(price * amount + " 元");
	}else{
		$("#total").html("");
	}
}

function validation(){
	var formPro = document.getElementById("formPro");
	var prompting = $("#prompting").text();
	var prompting1 = $("#prompting1").text();
	var prompting2 = $("#prompting2").text();
	if (prompting == "" && prompting1 == "" && prompting2 == ""){
		formPro.method = "post";
		formPro.action = "addList";
		formPro.submit();
	}
}

</script>
</head>
<body onload="init()">
<div class="panel-body">
	<div>
		<h3>采购订单</h3><hr><a href="pharmaceuticals">添加商品类</a>
	</div>
	<div >
		<form id="formPro">
			<table><tr>
			<td>商品编号:</td><td><input type="text" id="goodsid" name="number" class="form-control" onblur="findGoods()"></td><td><span id="prompting" style="color:red"></span></td></tr>
			<tr><td>商品名称：</td><td><input type="text" name="drugname" id="goodsname" class="form-control"></td></tr>
			<tr><td>收货时间：</td><td><input type="text" name="receipttime" class="form-control" onclick="J.calendar.get()"></td></tr>
			<tr><td>收货地址：</td><td><select name="storehouse"><option>A</option>
						<option>B</option>
			</select>库</td></tr>
			<tr><td>供应商：</td><td><select id="suppliername" name="supplierid">
			</select><a href="supplier">添加</a></td></tr>
			<tr><td>进货单价：</td><td><input type="text" name="price" id="cost" class="form-control" onchange="test(this.value,'prompting1')"></td><td>&nbsp;元</td><td><span id="prompting1" style="color: red"></span></td></tr>
			<tr><td>数量：</td><td><input type="text" name="amount" id="quantity" class="form-control" onchange="test(this.value,'prompting2')" onblur="calculate()"></td><td id="unit"></td><td><span id="prompting2" style="color: red"></span></td></tr>
			<tr><td>共计：</td><td><span id="total"></span></td></tr>
			</table>
			<input id="inputType" type="hidden" name="unitType">
			<button onclick="validation()" class="btn btn-primary">提交</button>&nbsp;<a href="begin" class="btn btn-primary">取消</a>
		</form>
	</div>
</div>
</body>
</html>