
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	String username = request.getParameter("name");
%>
<html>
<head>
<title>show.jsp</title>
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
</head>

<body>
	<table class="table table-hover">
		<h1 align="center">酒店剩余房间显示</h1>
		<thead>
			<tr>
		    <th>酒店账号</th>
			<th>酒店名称</th>
			<th>酒店地址</th>
			<th>联系人</th>
			<th>联系电话</th>
			<th>邮箱</th>
			<th>房间数</th>
			<th>价格</th>
			</tr>
		</thead>
		<tbody>


			<s:iterator value="hstemp">
				<tr>
					  <td><s:property value="id" /></td>
				<td><s:property value="name" /></td>
				<td><s:property value="address" /></td>
				<td><s:property value="conName" /></td>
				<td><s:property value="phone" /></td>
				<td><s:property value="email" /></td>

				<td><s:property value="number" /></td>
				<td><s:property value="cost" /></td>

				
					
				</tr>
			</s:iterator>
		</tbody>
	</table>
<a href="/tours/tourist/用户功能.jsp "><button
								type="button" class="btn btn-primary">
								主页<span class="glyphicon glyphicon-inbox"></span>
							</button></a>

</body>
</html>