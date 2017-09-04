<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="vendor/main.css">
<link rel="stylesheet" href="vendor/demo.css">
<link rel="stylesheet" href="vendor/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">

<title>支出入账.jsp</title>
</head>
<script type="text/javascript" src="vendor/jquery/jquery.min.js"></script>
<script type="text/javascript" src="vendor/calendar/lhgcore.js"></script>
<script type="text/javascript" src="vendor/calendar/date.js"></script>



<script type="text/javascript">
	function order()
	{		
		if($("#input1").val() != "" && $("#input1").val() != null &&
		   $("#input2").val() != "" && $("#input2").val() != null &&
		   $("#input3").val() != "" && $("#input3").val() != null &&
		   $("#input4").val() != "" && $("#input4").val() != null &&
		   $("#input5").val() != "" && $("#input5").val() != null ){
			$("#form1").submit();
		}
	}
	var date = new Date();
	var seperator1 = "-";
	var seperator2 = ":";
	var month = date.getMonth() + 1;
	var strDate = date.getDate();
	if (month >= 1 && month <= 9) {
	    month = "0" + month;
	}
	if (strDate >= 0 && strDate <= 9) {
	    strDate = "0" + strDate;
	}
	var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate;
	$().ready(function(){
		$.get("getExpenses",{date1:currentdate,date2:currentdate},res)
	})
	
	function res(data,status)
	{
		if(status=="success"){
			var exs = JSON.parse(data);
			var exsTable = document.getElementById("thead");
			exsTable.innerHTML = "";
			var exsTbody = document.getElementById("tbody");
			exsTbody.innerHTML = "";
			var row = document.createElement("tr");
			var col = document.createElement("th");
			col.appendChild(document.createTextNode("编号"));
			row.appendChild(col);
			
			col = document.createElement("th");
			col.appendChild(document.createTextNode("日期"));
			row.appendChild(col);
			
			col = document.createElement("th");
			col.appendChild(document.createTextNode("支出类型"));
			row.appendChild(col);
			
			col = document.createElement("th");
			col.appendChild(document.createTextNode("修正金额"));
			row.appendChild(col);
			
			col = document.createElement("th");
			col.appendChild(document.createTextNode("备注"));
			row.appendChild(col);
			
			col = document.createElement("th");
			col.appendChild(document.createTextNode("金额￥"));
			row.appendChild(col);
			
			col = document.createElement("th");
			col.appendChild(document.createTextNode("处理人"));
			row.appendChild(col);
			
			exsTable.appendChild(row);
			
			for (var i = 0; i < exs.length; i++)
			{
				row = document.createElement("tr");
				col = document.createElement("td");
				col.appendChild(document.createTextNode(exs[i].expensesId));
				row.appendChild(col);
				
				col = document.createElement("td");
				col.appendChild(document.createTextNode(exs[i].date));
				row.appendChild(col);
				
				col = document.createElement("td");
				col.appendChild(document.createTextNode(exs[i].type));
				row.appendChild(col);
				
				col = document.createElement("td");
				col.appendChild(document.createTextNode(exs[i].correct));
				row.appendChild(col);
				
				col = document.createElement("td");
				col.appendChild(document.createTextNode(exs[i].remake));
				row.appendChild(col);
				
				col = document.createElement("td");
				col.appendChild(document.createTextNode(exs[i].money));
				row.appendChild(col);
				
				col = document.createElement("td");
				col.appendChild(document.createTextNode(exs[i].name));
				row.appendChild(col);
								
				exsTbody.appendChild(row);
			}	
		}
	}
</script>
<body style="background-color: #dcefef">
<div>
	<div style="width:660px;background-color: #ffffff">
		<div style="height:10px"></div>
		<div style="margin-left:200px;width:300px">
		<h3>支出记账</h3>
		<form action="addExpenses" method="get" id="form1">
		<table>
			<tr>
				<td>日期：</td>
				<td><input type="text" name="date" id="input1"
					onclick="J.calendar.get()" class="form-control"></td>
			</tr>
			<tr>
				<td>支出类型:</td>
				<td><input type="text" name="type" id="input2" class="form-control"></td>
			</tr>
			<tr>
				<td>金额:</td>
				<td><input type="text" name="money" id="input3" class="form-control"></td>
			</tr>
			<tr>
				<td><input type="checkbox" value="更正" name="correct"></td>
				<td>修正金额</td>
			</tr>
			<tr>
				<td>备注：</td>
				<td><input type="text" name="remake" id="input4" class="form-control"></td>
			</tr>
			<tr>
				<td>处理人员</td>
				<td><input type="text" name="name" id="input5" class="form-control"></td>
			</tr>
		</table>
		<div style="margin-top:10px"></div>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="button" value="提交" onclick="order()" class="btn btn-primary">
		</form>
		</div>
	</div>

	<p style="height:10px;width:660px"> </p>	
	<div class="row">
	<div class="col-md-6">
		<div class="panel">
			<div class="panel-heading">
				<h3 class="panel-title">今日记录</h3>
			</div>
			<div class="panel-body">
				<table id="table1" class="table table-striped">
					<thead id="thead"></thead>
					<tbody id="tbody"></tbody>
				</table>
			</div>
		</div>
	</div>
	</div>	
	
</div>
</body>
</html>