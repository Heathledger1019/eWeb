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

<title>My JSP 'touristfunction.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	This is my tourist_function page.
	<br>

	<s:form action="complaint" method="post">
		<s:submit value="投诉建议" />
	</s:form>
	<s:form action="listSOS" method="post">
		<s:submit value="查看旅游应急信息" />
	</s:form>
	<s:form action="listhotel" method="post">
		<s:submit value="酒店房间预定情况" />
	</s:form>
	<s:form action="tourhelp" method="post">
		<s:submit value="景区旅游指南查询" />
	</s:form>
</body>
</html>
