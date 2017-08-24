<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<br>
	<div style="text-align:center">
		<h2>
<div align="center">
        <form:form action="index" method="POST" modelAttribute="userIndex">		
		<table border="0">
		 <tr>
                    <td>User Name:</td>
                    <td><form:input path="userName" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><form:password path="password" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Login" /></td>
                    <td colspan="1" align="center"><a href="register">New User ? Register from here</a>
                    </td>
                </tr>
            </table>
        </form:form>
	</div>
</body>
</html>