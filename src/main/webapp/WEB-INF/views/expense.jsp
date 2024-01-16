<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Expense</h1>

	<form:form action="${contextRoot}/expense" method="post"
		modelAttribute="expense">
		
		<form:hidden path="id" />
		<form:input path="description" placeholder="Enter expense name"/>
		
		<form:input path="amount" placeholder="Enter expense amount"/>
		
		<form:textarea path="note" placeholder="Enter note"/>
		
		<button type="submit">Add Expense</button>



	</form:form>
	
	<a href="${contextRoot}/expense/${expense.id}/delete">Delete</a>
</body>
</html>