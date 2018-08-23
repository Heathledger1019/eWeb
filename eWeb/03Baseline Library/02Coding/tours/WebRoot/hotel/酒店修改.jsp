<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
			String username=request.getParameter("name");
				//String admin=request.getParameter("admin");
%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP '管理员修改旅游.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link href="hotel/Wopop_files/style_log.css" rel="stylesheet"
	type="text/css">
<link rel="stylesheet" type="text/css"
	href="hotel/Wopop_files/style.css">
<link rel="stylesheet" type="text/css"
	href="hotel/Wopop_files/userpanel.css">
<link rel="stylesheet" type="text/css"
	href="hotel/Wopop_files/jquery.ui.all.css">
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body class="login" mycollectionplug="bind">
	<div class="login_m">
		<div class="login_logo">
			<img src="hotel/Wopop_files/logo.png" width="190" height="46"><br>
		            修改酒店信息
		</div>
		<div class="login_boder">
			<s:form action="change" method="post"
							theme="simple">
			<div class="login_padding" id="login_model">


				<label><input type="hidden" name="h.id"
					class="txt_input txt_input2"  value="<%=username %>" /></label> 
					<label>密码<input
					type="text" name="h.passwd" class="txt_input txt_input2" /></label> 
					<label>酒店名字<input
					type="text" name="h.name" class="txt_input txt_input2" "/></label>
					
				<label>酒店地址<input type="text"   name="h.address" class="txt_input txt_input2" /></label> 
				<label>酒店凭证<input
					type="text" name="h.prove" value="营业执照" class="txt_input txt_input2" /></label> 
					<label>法人名字<input
					type="text" name="h.conName" class="txt_input txt_input2" /></label> 
					<label>法人电话<input
					type="text" name="h.phone" class="txt_input txt_input2" />
				</label>
				<label>法人邮箱<input
					type="text" name="h.email" class="txt_input txt_input2" />
				</label>
				<label>通过审核<input
					type="text" name="h.ispass" class="txt_input txt_input2" />
				</label>
				<label>房间数<input
					type="text" name="h.number" class="txt_input txt_input2" />
				</label>
				<label>价格<input
					type="text" name="h.cost" class="txt_input txt_input2" />
				</label>
				
				
					<label><%-- <input type="submit" class="sub_button"
						name="button" id="button" value="提交" style="opacity: 0.7;">--%>
						<button class="btn btn-success " type="submit">
							提交 <span class="glyphicon glyphicon-ok"></span>
							</button>
					</label>

			</div>
</s:form>
			<!--login_padding  Sign up end-->
		</div>
		<!--login_boder end-->
	</div>
</body>
</html>