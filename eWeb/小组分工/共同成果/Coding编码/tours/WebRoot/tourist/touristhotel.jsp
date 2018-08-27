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
		<h6 style="text-align:left">审核酒店显示</h6>
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


			<s:iterator value="hstemp" >
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
	  <hr>

    <div class="text-center">
        <nav>
            <ul class="pagination">
                <li><a href="<c:url value="/findallhotelispass?page=1&t.phone=<%=username%>"/>">首页</a></li>
                <li><a href="<c:url value="/findallhotelispass?page=${page-1>1?page-1:1}&t.phone=<%=username%>"/>">&laquo;</a></li>

                 <c:forEach begin="1" end="${totalPages}" varStatus="loop">
                     <c:set var="active" value="${loop.index==page?'active':''}"/>
                    <li class="${active}"><a
                            href="<c:url value="/findallhotelispass?page=${loop.index}"/>&t.phone=<%=username%>">${loop.index}</a>
                    </li>
                </c:forEach>
                <li>
                    <a href="<c:url value="/findallhotelispass?page=${page+1<totalPages?page+1:totalPages}"/>&t.phone=<%=username%>">&raquo;</a>
                </li>
                <li><a href="<c:url value="/findallhotelispass?page=${totalPages}"/>&t.phone=<%=username%>">尾页</a></li>
            </ul>
        </nav>
    </div>
	</div>	
	
<a href="/tours/tourist/touristmain.jsp?phone=<%=username%>"><button
								type="button" class="btn btn-primary">
								主页<span class="glyphicon glyphicon-inbox"></span>
							</button></a>

</body>
</html>