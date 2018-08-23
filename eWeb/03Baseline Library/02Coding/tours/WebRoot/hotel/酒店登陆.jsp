<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
		form.action = "hotelregister";
		form.submit();

	}
	function goLogin() {
		var form = document.getElementById('postUser');
		form.action = "hotellogin";
		form.submit();
	}
</script>
<link href="hotel/login.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<form action="hotellogin" method="post">
		<div class="login_box">
			<div class="login_l_img">
				<img src="hotel/images/login-img.png" />
			</div>
			<div class="login">
				<div class="login_logo">
					<a href="#"><img src="hotel/images/login_logo.png" /></a>
				</div>
				<div class="login_name">
					<p>酒店登陆</p>
				</div>
				<div>
					账号：<input type="text" name="h.id" /> 密码：<input type="password"
						name="h.passwd" />
				</div>
				<div align="center">
					<button class="btn btn-primary " type="submit">
						<span class="glyphicon glyphicon-user"></span>登陆
					</button>
					
					<button class="btn btn-primary " type="submit" onclick="javascript:this.form.action='registertemp';">
						<span class="glyphicon glyphicon-user"></span>注册
					</button>
				</div>
			</div>
		</div>

	</form>

</body>
</html>