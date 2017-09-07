<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <table>
        <thead>
            <th>Name</th>
            <tr>Description</tr>
            <th>Date</th>
            <th>Completed</th>
        </thead>
        <tbody>
            <c:forEach item="${todos}" var="todo">
	            <tr>
	                <th>todo.user</th>
	                <th>todo.desc</th>
	                <th>todo.targetDate</th>
	                <th>todo.done</th>
	            </tr>
            </c:forEach>
        </tbody>
    </table>
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
</body>
</html>