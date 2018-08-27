<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP '管理员登陆.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link href="admin/css/style.css" rel="stylesheet" type="text/css" media="all" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<!-- -->
<script>var __links = document.querySelectorAll('a');
	function __linkClick(e) {
		parent.window.postMessage(this.href, '*');
	}
	;
	for (var i = 0, l = __links.length; i < l; i++) {
		if (__links[i].getAttribute('data-t') == '_blank') {
			__links[i].addEventListener('click', __linkClick, false);
		}
	}
</script>
<script src="admin/js/jquery.min.js"></script>
<script>$(document).ready(function(c) {
		$('.alert-close').on('click', function(c) {
			$('.message').fadeOut('slow', function(c) {
				$('.message').remove();
			});
		});
	});
</script>
</head>
<body>
	<!-- contact-form -->
	<div class="message warning">
		<div class="inset">
			<div class="login-head">
				<h1>管理员登陆</h1>
				<div class="alert-close"></div>
			</div>
			<form action="adminlogin" method="post">
				<li><input type="text" name="a.id2" value="1"><a href="#" class=" icon user"></a>
				<div class="clear"></div>
				<li><input type="text" value="Jame" name="a.name">
					<a href="#" class="icon lock"></a></li>
				<div class="clear"></div>
				<div class="submit">
					<input type="submit"  value="登陆">
					<h4>
						<a href="admin/haveproblem.jsp">Lost your Password ?</a>
					</h4>
					<div class="clear"></div>
				</div>

			</form>
		</div>
	</div>
	<div class="clear"></div>
	<!--- footer --->
	<div class="footer">
		<p>陈嘉康组2018</p>
	</div>

</body>
</html>
