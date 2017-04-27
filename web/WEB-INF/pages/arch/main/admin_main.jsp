<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Administrator</title>

      <!-- Bootstrap -->
    <link href="/css/bootstrap.css" rel="stylesheet">
    <link href="/css/font-awesome.css" rel="stylesheet">
    <link href="/css/style.css" rel="stylesheet">

  </head>
        
  <body>
      
    <!--header--> 
    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" href="https://oz.by">OZ.by</a>
            </div>
            <div class="control-label">
                <a class="navbar-brand" href="MainServlet?action=logOut" methods="POST" name="action">
                    <c:out value="${user.getLogin()}"/>
                    <i class="fa fa-sign-out" aria-hidden="true"></i>
                </a>
            </div>
        </div>
    </div>

      
    <!--Карусель-->
    <div id="carousel" class="carousel slide">
        <!--Индикаторы слайдов-->
        <ol class="carousel-indicators">
            <li class="active" data-target="#carousel" data-slide-to="0"></li>
            <li data-target="#carousel" data-slide-to="1"></li>
            <li data-target="#carousel" data-slide-to="2"></li>
        </ol>
        
        <!--Слайды-->
        <div class="carousel-inner">
            <div class="item active">
                <img src="images/wm_cover.png" alt="">
                <div class="carousel-caption">
                    <h1>Компьютеры и Интернет</h1>
                    <h2>уже собрано</h2>
                    <h2><c:out value="${books.size()}"/></h2>
                    <h2></h2>
                </div>
            </div>
            <div class="item">
                <img src="images/wm_cover1.png" alt="">
                <div class="carousel-caption">
                    <h1>Кто владеет информацией – тот владеет миром</h1>
                    <p>У. Черчилль</p>
                </div>
            </div>
            <div class="item">
                <img src="images/wm_cover2.png" alt="">
                <div class="carousel-caption">
                    <h3>Открой мир</h3>
                    <p>заново, <c:out value="${user.getLogin()}"/>./catalina.sh run</p>
                </div>
            </div>
        </div>

        <!--Стрелки переключения слайдов-->
        <a href="#carousel" class="left carousel-control" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left"></span>
        </a>
        <a href="#carousel" class="right carousel-control" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right"></span>
        </a>
    </div>

    <!-- Вкладка --> 
    <div class="container">
        <div class="row">
            <div class="col-xs-8 col-sm-10 col-md-12 col-lg-15">
                <br>
                <div class="tabs">
                    <ul class="nav nav-tabs">
                        <li class="active"><a href="#tab-1" data-toggle="tab">Today</a></li>
                        <li><a href="#tab-2" data-toggle="tab">Last 3 days</a></li>
                        <li><a href="#tab-3" data-toggle="tab">All</a></li>
                        <li><a href="#tab-4" data-toggle="tab">test</a></li>

                    </ul>
                    <div class="tab-content">

                        <div class="tab-pane fade in active" id="tab-1">
                            <div class="masonry" data-columns>
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


                        <div class="tab-pane fade in active" id="tab-2">
                            <div class="list-of-posts">
                                        <div class="masonry" data-columns>
                                    <c:forEach items="${books}" var="i">
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
                                    </c:forEach>
                                        </div>
                                <div class="pagination"></div>
                            </div>

                        <div class="tab-pane fade in active" id="tab-4">
                            <p>add Book</p>
                            <form action="MainServlet" method="GET">
                                <input name="action" type="hidden" value="addBook">
                                <input name="val1" type="text" value="title"/>
                                <input name="val2" type="text" value= "author"/>
                                <input name="submit" type="submit"/>
                            </form>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>

    <!-- футер -->
    <div class="container">
        <div class="row">
            <div class="col-xs-3">
                <ul class="list-unstyled">
                    <li>GitHub<li>
                    <li><a href="#">About us</a></li>
                    <li><a href="#">Blog</a></li>
                    <li><a href="#">Contact & support</a></li>
                    <li><a href="#">Enterprise</a></li>
                    <li><a href="#">Site status</a></li>
                </ul>
            </div>
            <div class="col-xs-3">
                <ul class="list-unstyled">
                    <li>Applications<li>
                    <li><a href="#">Product for Mac</a></li>
                    <li><a href="#">Product for Windows</a></li>
                    <li><a href="#">Product for Eclipse</a></li>
                    <li><a href="#">Product mobile apps</a></li>
                </ul>
            </div>
            <div class="col-xs-3">
                <ul class="list-unstyled">
                    <li>Services<li>
                    <li><a href="#">Web analytics</a></li>
                    <li><a href="#">Presentations</a></li>
                    <li><a href="#">Code snippets</a></li>
                    <li><a href="#">Job board</a></li>
                </ul>
            </div>
            <div class="col-xs-3">
                <ul class="list-unstyled">
                    <li>Documentation<li>
                    <li><a href="#">Product Help</a></li>
                    <li><a href="#">Developer API</a></li>
                    <li><a href="#">Product Markdown</a></li>
                    <li><a href="#">Product Pages</a></li>
                </ul>
            </div>
        </div>
        <hr>
        <div class="row">
            <div class="col-xs-8">
                <ul class="list-unstyled list-inline pull-left">
                    <li><a href="#">Terms of Service</a></li>
                    <li><a href="#">Contact Us</a></li>
                    <li><a href="#">Privacy</a></li>
                </ul>
            </div>
            <div class="col-xs-4">
                <p class="text-muted pull-right">© 2017. All rights reserved</p>
            </div>
        </div>
    </div>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.js"></script>
    <script src="js/salvattore.min.js"></script>

    <!-- jQuery (pagination) -->
    <script src="js/pagination/jquery.js"></script>
    <script src="js/pagination/paginate.js"></script>
    <script src="js/pagination/custom.js"></script>

  </body>


</html>