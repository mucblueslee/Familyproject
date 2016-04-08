<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加家庭</title>
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
   
   <s:form action="family/family_addFamily" method="post">
   	<s:textfield name="family.familyname" label="家庭名称"></s:textfield>
   	<s:textfield name="family.familyphone" label="家庭电话"></s:textfield>
   	<s:textfield name="family.address" label="家庭住址"></s:textfield>
   	<s:submit value="提交"></s:submit>
   </s:form>
    <br>
  </body>
</html>
