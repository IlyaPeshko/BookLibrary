<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Weclome page</title>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="css/style.css" rel="stylesheet" />
    <link href="/css/bootstrap.css" rel="stylesheet">
    <link href="/css/font-awesome.css" rel="stylesheet">

</head>
<body>

<div class="page">
    <h2>Jquery Pagination Plugin, awesome!</h2>

    <div class="list-of-posts" data-columns="">
        <div class="row masonry">
            <c:forEach items="${books}" var="i">
                <div class="row masonry">
                <div class="post">
                    <a href="MainServlet?action=open_profile&id=<c:out value="${i.getIdOZby()}"/> ">
                        <div class="item">
                            <div class="thumbnail">
                                <img src="<c:out value="${i.getImageURL()}"/>" class="img-responsive" >
                                <span>
                                    <h2 align="right"><c:out value="${i.getPrice()}"/> руб.</h2>
                                </span>
                            </div>
                        </div>
                    </a>
                </div>
                </div>
            </c:forEach>
        </div>

    </div>

    <div class="pagination">

    </div>

    <div class="row masonry" data-columns>
        <c:forEach items="${books}" var="i">
            <a href="MainServlet?action=open_profile&id=<c:out value="${i.getIdOZby()}"/> ">
                <div class="item">
                    <div class="thumbnail">
                        <img src="<c:out value="${i.getImageURL()}"/>" class="img-responsive" >
                        <span>
                            <h2 align="right"><c:out value="${i.getPrice()}"/> руб.</h2>
                        </span>
                    </div>
                </div>
            </a>>
        </c:forEach>
    </div>

</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.js"></script>
<script src="js/salvattore.min.js"></script>

<script src="js/pagination/jquery.js"></script>
<script src="js/pagination/paginate.js"></script>
<script src="js/pagination/custom.js"></script>


</body>
</html>
