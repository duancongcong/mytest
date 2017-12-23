<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
  </head>
  
  <body>
<%--    <%
   //设置name  值为jack
   	//application.setAttribute("name", "jack");
   	//修改name 值为rose
   	//application.setAttribute("name", "rose");
   	//删除name的属性 和值
    //application.removeAttribute("name");
   	request.setAttribute("sex", "男");
	request.setAttribute("sex", "女");
	request.removeAttribute("sex");
    %> --%>
	<h2>欢迎访问本站，您是第${applicationScope.count}个访客</h2>    
	<a href="logout.jsp">退出</a>
  </body>
</html>
