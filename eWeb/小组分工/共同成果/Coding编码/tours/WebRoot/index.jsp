<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
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
</head>

<body>
	<s:form action="login" method="post">
		<s:textfield name="t.phone" label="手机号" />
		<s:textfield name="t.passwd" label="密码" />
		<s:submit value="登陆" />
		<s:submit value="注册" onclick="javascript:this.form.action='register';"/>
	</s:form>
	
	<!-- 
		<form id="postUser" method="post">
		<input name="t.phone" value="手机号" /> <input name="t.passwd"
			value="密码" />
		<button onclick="goRegister()">注册</button>
		<button onclick="goLogin()">登陆</button>
	</form>
	
	<s:form action="register" method="post">
		<input type="hidden" name="t.phone" value="<s:property value="t.phone"/>">
		<input type="hidden" name="t.passwd" value="<s:property value="t.passwd"/>">
	</s:form> 
	-->
</body>
</html>
