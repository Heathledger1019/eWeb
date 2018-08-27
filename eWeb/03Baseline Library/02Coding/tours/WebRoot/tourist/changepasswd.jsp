<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
			String username=request.getParameter("name");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function goRegister() {
		var form = document.getElementById('postUser');
		form.action = "register";
		form.submit();

	}
	function goLogin() {
		var form = document.getElementById('postUser');
		form.action = "login";
		form.submit();
	}
</script>
<link href="tourist/login.css" rel="stylesheet" type="text/css" />
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
						<li><a href="#">修改密码</a></li>
						<li class="divider"></li>
						<li><a href="#">退出</a></li>
					</ul></li>
				<li class="toushu"><a href="tourist/投诉建议.jsp">投诉建议</a></li>
				<li class="chakan">
				<li><a href="emergency/旅游应急.jsp">旅游应急信息</a></li>
				<li class="chakan">
				<li><a href="hotel/酒店预订.jsp">酒店预订情况</a></li>
				<li class="chakan">
				<li><a href="scenicspot/景区旅游指南.jsp">景区旅游指南</a></li>
		</div>
	</div>
	</nav>
	<form action="changepsd" method="post">
		<div class="login_box">
			<div class="login_l_img">
				<img src="tourist/images/login-img.png" />
			</div>
			<div class="login">
				<div class="login_logo">
					<a href="#"><img src="tourist/images/login_logo.png" /></a>
				</div>
				<div class="login_name">
					<p>修改密码</p>
				</div>
				<div>
				   

				<%=username %>	   密码：<input type="text" name="t.passwd"/> 
				       <input type="hidden" name="t.phone" value="<%=username %>" /> 
				
				</div>
				<div align="center">
					<button class="btn btn-primary " type="submit">
						<span class="glyphicon glyphicon-user"></span>修改
					</button>
				</div>
			</div>
		</div>

	</form>

</body>
</html>