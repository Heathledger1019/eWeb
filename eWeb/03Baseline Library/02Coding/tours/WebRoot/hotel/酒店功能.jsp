<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP '用户功能.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<title>用户功能兰</title>
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-inverse" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">酒店功能</a>
		</div>
		<div>
			<ul class="nav navbar-nav">
				<li class="myjsp"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> 我的酒店信息 <b class="caret"></b>
				</a>
					<ul class="dropdown-menu">
						<li><a href="hotel/酒店修改自己.jsp?name=<s:property value="h.id" />">修改账号信息  </a></li>
						<li class="divider"></li>
						<li><a href="hotel/酒店登陆.jsp">退出</a></li>
					</ul></li>
				<li class="toushu"><a href="hotel/修改房间.jsp?name=<s:property value="h.id" />">设置酒店剩余房间</a></li>
				<li class="chakan">
				<li><a href="hotel/修改价钱.jsp?name=<s:property value="h.id" />">设置酒店房间价格</a></li>
		</div>
	</div>
	</nav>

	<div class="container">
		<%--<img src="tourist/images/壁纸.jpg" height='480px' widht='400px' >    --%>  
            
     
     
     
  </div>
       <s:property value="h.name" />你好!!!!<br>

<a href="/tours/主页.jsp"><button
								type="button" class="btn btn-primary">
								返回主页 <span class="glyphicon glyphicon-inbox"></span>
							</button></a>
		
</html>
