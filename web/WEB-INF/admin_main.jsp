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
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#responsive-menu">
                    <span class="sr-only">Open navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Logo</a>
            </div>
            <div class="collapse navbar-collapse" id="responsive-menu">
                <ul class="nav navbar-nav">
                    <li><a href="#">Item 1</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Item 2 <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Item 1</a></li>
                            <li><a href="#">Item 2</a></li>
                            <li><a href="#">Item 3</a></li>
                            <li class="divider"></li>
                            <li><a href="#">Item 4</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Item 3</a></li>
                    <li><a href="#">Item 4</a></li>
                </ul>
                <form action="" class="navbar-form navbar-right hidden-sm">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="E-mail" value="">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" placeholder="Пароль" value="">
                    </div>
                    <button type="submit" class="btn btn-primary">
                        <i class="fa fa-sign-in"></i> Enter
                    </button>
                </form>
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
                    <h3>slide</h3>
                    <p>description</p>
                </div>
            </div>
            <div class="item">
                <img src="images/wm_cover1.png" alt="">
                <div class="carousel-caption">
                    <h3>slide</h3>
                    <p>description</p>
                </div>
            </div>
            <div class="item">
                <img src="images/wm_cover2.png" alt="">
                <div class="carousel-caption">
                    <h3>slide</h3>
                    <p>description</p>
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
            <div class="col-md-6">
                <br>
                <div class="tabs">
                    <ul class="nav nav-tabs">
                        <li class="active"><a href="#tab-1" data-toggle="tab">Today</a></li>
                        <li><a href="#tab-2" data-toggle="tab">Last 3 days</a></li>
                        <li><a href="#tab-3" data-toggle="tab">All</a></li>
                    </ul>
                    <div class="tab-content">
                        <div class="tab-pane fade in active" id="tab-1">
                            <p>catalog</p>
                            <div>
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
                            </div>
                        </div>
                        <div class="tab-pane fade" id="tab-2">
                            <p>paragraf 2</p>
                        </div>
                        <div class="tab-pane fade" id="tab-3">
                            <p>paragraf 3</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    
      <div class="container">
          <div class="row">
              Current Date time: <%=new java.util.Date()%>
          </div>
      </div>
      
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.js"></script>
  </body>
</html>