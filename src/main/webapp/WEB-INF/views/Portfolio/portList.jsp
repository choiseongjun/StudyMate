<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script src="//code.jquery.com/jquery-3.2.1.min.js"></script>
<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
  <link rel="stylesheet" href="/css/core-style.css">
     
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.row {
 
  margin-top: 50px;
  
}
.product-img{
	width:200px;
	
}
</style>
</head>
<body>
<%@include file="../Header.jsp"%> 
    <!-- ##### Shop Grid Area Start ##### -->
    <section class="shop_grid_area section-padding-80">
        <div class="container">
            <div class="row">
	<%@include file="portNav.jsp" %>
                        <!-- ##### Single Widget ##### -->
          <!--               <div class="widget color mb-50">
                            Widget Title 2
                            <p class="widget-title2 mb-30">Color</p>
                            <div class="widget-desc">
                                <ul class="d-flex">
                                    <li><a href="#" class="color1"></a></li>
                                    <li><a href="#" class="color2"></a></li>
                                    <li><a href="#" class="color3"></a></li>
                                    <li><a href="#" class="color4"></a></li>
                                    <li><a href="#" class="color5"></a></li>
                                    <li><a href="#" class="color6"></a></li>
                                    <li><a href="#" class="color7"></a></li>
                                    <li><a href="#" class="color8"></a></li>
                                    <li><a href="#" class="color9"></a></li>
                                    <li><a href="#" class="color10"></a></li>
                                </ul>
                            </div>
                        </div> -->

                        <!-- ##### Single Widget ##### -->
                        <!-- <div class="widget brands mb-50">
                            Widget Title 2
                            <p class="widget-title2 mb-30">Brands</p>
                            <div class="widget-desc">
                                <ul>
                                	<li><a href="#">대림</a></li>
                                	<li><a href="#">KR모터스</a></li>
                                    <li><a href="#">혼다</a></li>
                                    <li><a href="#">야마하</a></li>
                                    <li><a href="#">스즈키</a></li>
                                    <li><a href="#">가와사키</a></li>
                                    <li><a href="#">듀가티</a></li>
                                </ul> 
                            </div>
                        </div> -->
                    </div>
                </div>

                <div class="col-12 col-md-8 col-lg-9">
                    <div class="shop_grid_product_area">
                        <div class="row">
                            <div class="col-12">
                                <div class="product-topbar d-flex align-items-center justify-content-between">
                                    <!-- Total Products -->
                                    <!-- <div class="total-products">
                                        <p><span>186</span> products found</p>
                                    </div> -->
                                    <!-- Sorting -->
                                  <!--   <div class="product-sorting d-flex">
                                        <p>Sort by:</p>
                                        <form action="#" method="get">
                                            <select name="select" id="sortByselect">
                                                <option value="value">Highest Rated</option>
                                                <option value="value">Newest</option>
                                                <option value="value">Price: $$ - $</option>
                                                <option value="value">Price: $ - $$</option>
                                            </select>
                                            <input type="submit" class="d-none" value="">
                                        </form>
                                    </div> -->
                                </div>
                            </div>
                        </div>
                        <div class="row">
	                      <table width="1000">
							<c:forEach var="boardlist" items="${boardlist}">
		                            <!-- Single Product -->
		                            <div class="col-12 col-sm-6 col-lg-4">
		                                <div class="single-product-wrapper">
		                                    <!-- Product Image -->
		                                    <div class="product-img">
		                                        <img src="/UploadImage/2019/${boardlist}" width="250px", height="250px">
		                                        <!-- Hover Thumb -->
		                                        <img class="hover-img" src="/UploadImage/2019/${boardlist.brdno}" alt="" >
		                                        <!-- Product Badge -->
		                                        <div class="product-badge offer-badge">
		                                            <span>나중에 좋아요할꺼${ boardlist.brdtitle}</span>
		                                        </div>
		                                        <!-- Favourite -->
		                                        <div class="product-favourite">
		                                            <a href="#" class="favme fa fa-heart"></a>
		                                        </div>
		                                    </div>
		                                    <!-- Product Description --> 
		                                    <div class="product-description">
		                                        <span><a href="/portFolio/portDetail"/><c:out value="${boardlist.brdtitle}"/> </a></span>
		                                        <a href="single-product-details.html">
		                                            <h6><c:out value="${brdlist.brdtitle}"/></h6>
		                                        </a>
		                                        <p class="product-price"><span class="old-price"> 작성자 </span>최성준 </p>
		
		                                        <!-- Hover Content -->
		                                        <div class="hover-content">
		                                            <!-- Add to Cart -->
		                                            <div class="add-to-cart-btn">
		                                                <a href="DealBoardDetail.do" class="btn essence-btn">구경하러가기</a>
		                                            </div>
		                                        </div>
		                                    </div>
		                                </div>
		                            </div>
		                        </div>
		                        </c:forEach>
	                       </table>
                    </div>
                    <!-- Pagination -->
                    <nav aria-label="navigation">
                        <ul class="pagination mt-50 mb-70">
                            <li class="page-item"><a class="page-link" href="#"><i class="fa fa-angle-left"></i></a></li>
                            <li class="page-item"><a class="page-link" href="#">1</a></li>
                            <li class="page-item"><a class="page-link" href="#">2</a></li>
                            <li class="page-item"><a class="page-link" href="#">3</a></li>
                            <li class="page-item"><a class="page-link" href="#">...</a></li>
                            <li class="page-item"><a class="page-link" href="#">21</a></li>
                            <li class="page-item"><a class="page-link" href="#"><i class="fa fa-angle-right"></i></a></li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>
    </section>
<!--     <script src="js/jquery/jquery-2.2.4.min.js"></script>
 -->    <!-- Popper js -->
    <script src="/js/popper.min.js"></script>
    <!-- Bootstrap js -->
    <script src="/js/bootstrap.min.js"></script>
    <!-- Plugins js -->
    <script src="/js/plugins.js"></script>
    <!-- Classy Nav js -->
    <script src="/js/classy-nav.min.js"></script>
    <!-- Active js -->
    <script src="/js/active.js"></script>
</body>
</html>