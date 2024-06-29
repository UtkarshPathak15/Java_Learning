<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page1</title>
</head>
<body>
	<h2>Welcome to JSP.</h2>
	<%
	for(int i=0;i<10;i++){
		if(i%2==0){
	%>
	<div style="color : blue">
	<%= i %>
	</div>
	<%
	}
	else{
	%>
	<div style="color : green">
	<%=i %>
	</div>
	<%
	}
	}
	%>

</body>
</html>