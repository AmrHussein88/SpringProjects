<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html >
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	
	
	<div align="center">
        <form:form action="register" method="POST" modelAttribute="userRegisterationBean">
        <form:input path="userId" type="hidden" id="userId"/>
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Spring MVC Form Demo - Registration</h2></td>
                </tr>
                <tr>
                    <td>First Name:</td>
                    <td><form:input path="frstName" /></td>
                    <td><form:errors path="frstName" cssClass="error"></form:errors></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><form:input path="lastName" /></td>
                </tr>
                 <tr>
                    <td>User Name:</td>
                    <td><form:input path="userName" /></td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><form:password path="password" /></td>
					  <td><form:errors path="password" cssClass="error"></form:errors></td>
                    
                </tr>
               
                
                
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Register" /></td>
                </tr>
            </table>
        </form:form>
    </div>
	
	
	
</h1>

<P>   </P>
</body>
</html>
