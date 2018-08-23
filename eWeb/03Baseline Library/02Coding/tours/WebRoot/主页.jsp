<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP '主页.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
	<div class="jumbotron">
				<h1>用户登陆</h1>
		<p><a href="/tours/tourist/登陆注册.jsp?name=<s:property value="id"/>"><button
								type="button" class="btn btn-primary btn-lg" style="text-shadow: black 5px 3px 3px;">
								1 <span class="glyphicon glyphicon-user"></span>
							</button></a>
		</p>
	</div>
</div>
<div class="container">
	<div class="jumbotron">
		<h1>管理员登陆</h1>
		<p><a href="/tours/admin/管理员登陆.jsp?name=<s:property value="id"/>"><button
								type="button" class="btn btn-primary btn-lg" style="text-shadow: black 5px 3px 3px;">
								2 <span class="glyphicon glyphicon-user"></span>
							</button></a>
		</p>
	</div>
</div>
<div class="container">

	<div class="jumbotron">
		<h1>酒店登陆</h1>
		<p>
<a href="/tours/hotel/酒店登陆.jsp?name=<s:property value="id"/>"><button
								type="button" class="btn btn-primary btn-lg" style="text-shadow: black 5px 3px 3px;">
								3 <span class="glyphicon glyphicon-user"></span>
							</button></a>
		</p>
	</div>
</div>
</body>
</html>
