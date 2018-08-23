
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
		<h1 align="center">应急信息显示</h1>
		<thead>
			<tr>
				<th>标题</th>
				<th>应急信息号</th>
				<th>管理员工号</th>
				<th>开始时间</th>
				<th>结束时间</th>
				<th>应急消息</th>
				<th>图片</th>
			</tr>
		</thead>
		<tbody>


			<s:iterator value="es">
				<tr>
					<td><s:property value="title" /></td>
					<td><s:property value="id3" /></td>
					<td><s:property value="administrator.id2" /></td>
					<td><s:property value="starttime" /></td>
					<td><s:property value="endtime" /></td>
					<td><s:property value="content" /></td>
					<td><s:property value="phone" /></td>

					<%--	<td><input type="button" value="跳转" onclick="window.location.href('new.jsp')" /></td>
--%>
					<%--  String name = request.setAttribute("student.studentid",id);
                  --%>
					<td><s:form action="deleteemergency" method="post"
							theme="simple">
							<input name="a.id2" type="hidden" value='<s:property value="administrator.id2"/>'/>
							<input name="e.id3" type="hidden" value='<s:property value="id3"/>' />
							<button class="btn btn-danger " type="submit"> 删除 <span class="glyphicon glyphicon-remove-circle"></span>
							</button>
							
							<%--<button class="btn btn-primary " type="submit"
						onclick="javascript:this.form.action='newemergency';">
						<span class="glyphicon glyphicon-wrench"></span>修改
					</button> 
					<td><a href="tourist/修改密码.jsp?name=<s:property value="id3" />">修改  </a>
					 --%>
						</s:form>
						</td>
					<td><a href="/tours/emergency/修改旅游.jsp?name=<s:property value="id3"/>&admin=<%=username%>"><button
								type="button" class="btn btn-primary">
								修改<span class="glyphicon glyphicon-wrench"></span>
							</button></a></td>
				</tr>
			</s:iterator>
			<tr>
				<td><a href="/tours/emergency/管理员添加旅游.jsp"><button
							type="button" class="btn btn-success">
							添加 <span class="glyphicon glyphicon-edit"></span>
						</button></a></td>
			</tr>
		</tbody>
	</table>


</body>
</html>