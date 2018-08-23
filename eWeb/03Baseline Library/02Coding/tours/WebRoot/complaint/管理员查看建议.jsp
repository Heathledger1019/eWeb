
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
		<h1 align="center">管理员查看投诉</h1>
		<thead>
			<tr>
				<th>建议编号</th>
				<th>建议号码</th>
				<th>时间</th>
				<th>投诉内容</th>
				<th>图片链接</th>
				<th>处理状态</th>
				<th>处理时间</th>
				<th>答复</th>
				<th>评价</th>
			</tr>
		</thead>
		<tbody>


			<s:iterator value="cs">
				<tr>
					<td><s:property value="id4" /></td>
					<td><s:property value="tourist.phone" /></td>
					<td><s:property value="time" /></td>
					<td><s:property value="content" /></td>
					<td><s:property value="photo2" /></td>
					<td><s:property value="ishandle" /></td>
					<td><s:property value="dealtime" /></td>
					<td><s:property value="answer" /></td>
					<td><s:property value="evaluate" /></td>
					

					<%--	<td><input type="button" value="跳转" onclick="window.location.href('new.jsp')" /></td>
--%>
					<%--  String name = request.setAttribute("student.studentid",id);
                  --%>
					<td><s:form action="deletecomplaint" method="post"
							theme="simple">
							<input name="c.id4" type="hidden" value='<s:property value="id4"/>'/>
							<input name="a.name" type="hidden" value=<%=username %> />
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
					<td><a href="/tours/complaint/处理建议.jsp?name=<s:property value="id4"/>&phone=<s:property value="tourist.phone" />&time=<s:property value="time" />"><button
								type="button" class="btn btn-primary">
								处理<span class="glyphicon glyphicon-wrench"></span>
							</button></a></td>
				</tr>
			</s:iterator>
		<!--  	<tr>
				<td><a href="/tours/emergency/管理员添加旅游.jsp"><button
							type="button" class="btn btn-success">
							添加 <span class="glyphicon glyphicon-edit"></span>
						</button></a></td>
			</tr>-->
		</tbody>
	</table>


</body>
</html>