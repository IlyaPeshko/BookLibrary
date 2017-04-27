<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Weclome page</title>
</head>
<body>

<h1>Welcome dear <c:out value="${user.getLogin()}"/>!</h1>
<input type="hidden" value="showCatalog" name="action"/>
<input type="submit" value="Catalog" />

<br><br/>
calculate
<form action="MainServlet" method="POST">

    <input name="action" type="hidden" value="calculate">
    <input name="val1" type="text"/>
    <input name="val2" type="text"/>
    <input name="submit" type="submit"/>
</form>


<c:forEach items="${books}" var="i">
    <br/>
    Book are:
    <br>
    <p>
            <span>
        title:<c:out value="${i.getTittle()}"/>
                <br/>
        author:<c:out value="${i.getAuthor()}"/>
                <br/>
        price:<c:out value="${i.getPrice()}"/>
            </span>
    </p>
</c:forEach>

</body>
</html>
