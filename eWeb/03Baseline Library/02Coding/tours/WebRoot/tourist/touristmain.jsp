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
			<a class="navbar-brand" href="#">用户功能</a>
		</div>
		<div>
			<ul class="nav navbar-nav">
				<li class="myjsp"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> 我的账号 <b class="caret"></b>
				</a>
					<ul class="dropdown-menu">
						<li><a href="tourist/changepasswd.jsp?name=<s:property value="t.phone" />">修改密码  </a></li>
						<li class="divider"></li>
						<li><a href="#">退出</a></li>
					</ul></li>
				<li class="toushu"><a href="tourist/addcomplaint.jsp?name=<s:property value="t.phone" />">添加投诉</a></li>
				<li class="chakantoushu"><a href="userlist.action?name=<s:property value="t.phone" />">查看投诉</a></li>
				<li class="chakan">
				<li><a href="ctemp.action">旅游应急信息</a></li>
				<li class="chakan">
				<li><a href="findallhotelispass.action">酒店预订情况</a></li>
				
				<li class="myjsp"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"> 景区旅游指南 <b class="caret"></b>
				</a>
					<ul class="dropdown-menu">
						<li><a href="scenicspot/map.html" target="blank" >地图  </a></li>
						<li class="divider"></li>
						<li><a href="scenicspot/weather.html" target="blank" >天气  </a></li>
						<li class="divider"></li>
						<li><a href="scenicspot/scenery.html" target="blank" >景区  </a></li>
						<li class="divider"></li>
					</ul></li>
					
		</div>
	</div>
	</nav>

	<div class="container">
		<%--<img src="tourist/images/壁纸.jpg" height='480px' widht='400px' >    --%>  
              <s:property value="t.phone" />
     
  </div>


  <a href="/tours/main.jsp"><button
								type="button" class="btn btn-primary">
								返回主页 <span class="glyphicon glyphicon-inbox"></span>
							</button></a>
		
</html>
