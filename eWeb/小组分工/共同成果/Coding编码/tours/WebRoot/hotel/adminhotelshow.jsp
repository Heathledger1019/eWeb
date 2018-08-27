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

    <%-- <c:set var="totalUsers" value="${requestScope.totalUsers}"/>
    <c:set var="usersPerPage" value="${requestScope.usersPerPage}"/>
    <c:set var="totalPages" value="${requestScope.totalPages}"/>
    <c:set var="beginIndex" value="${requestScope.beginIndex}"/>
    <c:set var="endIndex" value="${requestScope.endIndex}"/>
    <c:set var="page" value="${requestScope.page}"/>
    <c:set var="currentPageUsers" value="${requestScope.users.subList(beginIndex,endIndex)}"/> --%>
  <%--  <p>用户总数:${totalUsers}</p>
    <p>每页用户数:${usersPerPage}</p>
    <p>总页数:${totalPages}</p>
    <p>当前页:${page}</p> --%> 

  <table class="table table-hover">
		<h6 style="text-align:left">管理员酒店显示</h6>
		<thead>
			<tr>
		    <th>酒店账号</th>
			<th>酒店名称</th>
			<th>密码</th>
			<th>酒店地址</th>
			<th>酒店凭证</th>
			<th>联系人</th>
			<th>联系电话</th>
			<th>邮箱</th>
			<th>是否审批</th>
			<th>房间数</th>
			<th>价格</th>
			</tr>
		</thead>
		<tbody>


			<s:iterator value="hs" begin="beginIndex" end="endIndex"   >
				<tr>
					  <td><s:property value="id" /></td>
				<td><s:property value="name" /></td>
				<td><s:property value="passwd" /></td>
				<td><s:property value="address" /></td>
				<td><s:property value="prove" /></td>
				<td><s:property value="conName" /></td>
				<td><s:property value="phone" /></td>
				<td><s:property value="email" /></td>
				<td><s:property value="ispass" /></td>
				<td><s:property value="number" /></td>
				<td><s:property value="cost" /></td>

					<%--	<td><input type="button" value="跳转" onclick="window.location.href('new.jsp')" /></td>
--%>
					<%--  String name = request.setAttribute("student.studentid",id);
                  --%>
					<td><s:form action="hoteldelete" method="post"
							theme="simple">
							<input name="h.id" type="hidden" value='<s:property value="id"/>'/>
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
					<td><a href="/tours/hotel/酒店修改.jsp?name=<s:property value="id"/>"><button
								type="button" class="btn btn-primary">
								修改<span class="glyphicon glyphicon-wrench"></span>
							</button></a></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>

    <hr>

    <div class="text-center">
        <nav>
            <ul class="pagination">
                <li><a href="<c:url value="/list?page=1"/>">首页</a></li>
                <li><a href="<c:url value="/list?page=${page-1>1?page-1:1}"/>">&laquo;</a></li>

                 <c:forEach begin="1" end="${totalPages}" varStatus="loop">
                     <c:set var="active" value="${loop.index==page?'active':''}"/>
                    <li class="${active}"><a
                            href="<c:url value="/list?page=${loop.index}"/>">${loop.index}</a>
                    </li>
                </c:forEach>
                <li>
                    <a href="<c:url value="/list?page=${page+1<totalPages?page+1:totalPages}"/>">&raquo;</a>
                </li>
                <li><a href="<c:url value="/list?page=${totalPages}"/>">尾页</a></li>
            </ul>
        </nav>
    </div>


</div>

</body>
</html>