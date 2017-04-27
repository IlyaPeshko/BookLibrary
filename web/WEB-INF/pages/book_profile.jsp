<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Book Profile</title>

    <!-- Bootstrap -->
    <link href="/css/bootstrap.css" rel="stylesheet">
    <link href="/css/font-awesome.css" rel="stylesheet">
    <link href="/css/style.css" rel="stylesheet">

      <style>
          p {
              text-indent: 30px; /* Отступ первой строки в пикселах */
          }
      </style>
    
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
                    <p></p>
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
                    <p>заново</p>
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

    <br/><br/>
    <!-- button -->


    <!-- page -->
    <div class="container">
        <div class="col-lg-4 col-sm-3">
            <span>
                <img src="<c:out value="${profile_book.getImageURL()}"/>" class="img-responsive" >
            </span>
        </div>
        <div class="col-lg-8 col-md-6 col-sm-4">

                <div align="left">
                    <a class="btn icon-btn btn-danger" href="<c:out value="${profile_book.getBookURL()}"/>">
                        <span class="glyphicon btn-glyphicon glyphicon-shopping-cart img-circle text-danger">
                        </span><c:out value="${profile_book.getPrice()}"/>
                    </a>
                </div>

                <div align="right">
                    <h4><c:out value="${profile_book.getYear()}"/></h4>
                    <h4><c:out value="${profile_book.getAuthor()}"/></h4>
                    <h6><c:out value="${profile_book.getIdOZby()}"/></h6>

                </div>
                <br/><br/>
                    <h3><p><c:out value="${profile_book.getTittle()}"/></p></h3>
                <div align="left"><h4><p><c:out value="${profile_book.getDescription()}"/></p></h4></div>

                    <div align="right">
                        <a class="btn icon-btn btn-default" href="#"><span class="glyphicon btn-glyphicon glyphicon-save img-circle text-muted"></span>Скачать</a>
                        <a class="btn icon-btn btn-primary" href="#"><span class="glyphicon btn-glyphicon glyphicon-thumbs-up img-circle text-primary"></span>Оценить</a>
                        <a class="btn icon-btn btn-success" href="#"><span class="glyphicon btn-glyphicon glyphicon-plus img-circle text-success"></span>Добавить</a>
                        <a class="btn icon-btn btn-info" href="#"><span class="glyphicon btn-glyphicon glyphicon-share img-circle text-info"></span>Поделиться</a>
                    </div>
                </div>

        </div>
    </div>

    <!-- футер -->
    <br/><br/><br/><br/>
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
  </body>
</html>