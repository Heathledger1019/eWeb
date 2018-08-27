<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<div class="container">
	<table class="table table-hover">
		<h6 style="text-align:left">管理员旅游应急显示</h6>
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
					<td><a href="/tours/emergency/changemergency.jsp?name=<s:property value="id3"/>&admin=<%=username%>"><button
								type="button" class="btn btn-primary">
								修改<span class="glyphicon glyphicon-wrench"></span>
							</button></a></td>
				</tr>
			</s:iterator>
			<tr>
				<td><a href="/tours/emergency/addemergency.jsp"><button
							type="button" class="btn btn-success">
							添加 <span class="glyphicon glyphicon-edit"></span>
						</button></a></td>
			</tr>
		</tbody>
	</table>
	  <hr>

    <div class="text-center">
        <nav>
            <ul class="pagination">
                <li><a href="<c:url value="/findallemergency?page=1"/>">首页</a></li>
                <li><a href="<c:url value="/findallemergency?page=${page-1>1?page-1:1}"/>">&laquo;</a></li>

                 <c:forEach begin="1" end="${totalPages}" varStatus="loop">
                     <c:set var="active" value="${loop.index==page?'active':''}"/>
                    <li class="${active}"><a
                            href="<c:url value="/findallemergency?page=${loop.index}"/>">${loop.index}</a>
                    </li>
                </c:forEach>
                <li>
                    <a href="<c:url value="/findallemergency?page=${page+1<totalPages?page+1:totalPages}"/>">&raquo;</a>
                </li>
                <li><a href="<c:url value="/findallemergency?page=${totalPages}"/>">尾页</a></li>
            </ul>
        </nav>
    </div>
</div>



</body>
</html>