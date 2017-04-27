<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Result</title>
</head>
<body>
<header><h1>You are logged as: <c:out value="${user.getLogin()}"/></h1></header>
    Result:<c:out value="${result}"/>
</body>
</html>
