<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="vendor/main.css">
<link rel="stylesheet" href="vendor/demo.css">
<link rel="stylesheet"
	href="vendor/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
<link
	href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700"
	rel="stylesheet">
<title>查詢界面</title>
<script type="text/javascript" src="vendor/jquery/jquery.min.js"></script>
<script type="text/javascript" src="vendor/calendar/lhgcore.js"></script>
<script type="text/javascript" src="vendor/calendar/date.js"></script>
<script>
	function search(url) {
		if ($("#date1").val() != "" && $("#date1").val() != null
				&& $("#date2").val() != "" && $("#date2").val() != null) {
			$.get(url, {
				date1 : $("#date1").val(),
				date2 : $("#date2").val(),
				type : $("#type").val()
			}, res)
		}
	}
	function res(data, status) {
		if (status == "success") {
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
			col.appendChild(document.createTextNode("类型"));
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

			for (var i = 0; i < exs.length; i++) {
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
</head>
<body style="background-color: #dcefef">
<div style="margin-left:200px">
	<div style="text-align:center;width:732px">
		<div style="height:10px"></div>
		<div>
			开始时间：<input type="text" id="date1" onclick="J.calendar.get()" />
			截止时间：<input type="text" id="date2" onclick="J.calendar.get()" /> 类型：<input
				type="text" id="type">
		</div>
		<div style="height: 20px"></div>
		<input type="button" onclick="search('getExpenses')" value="查询支出"
			class="btn btn-primary"> <input type="button"
			onclick="search('getIncome')" value="查询收入" class="btn btn-primary">

	</div>


	<div style="height: 20px"></div>
	<div class="row">
		<div class="col-md-6">
			<div class="panel" style="width:732px">
				<div class="panel-heading">
					<h3 class="panel-title">财务记录</h3>
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