<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
    <link rel="apple-touch-icon" href="apple-icon.png">
    <link rel="shortcut icon" href="favicon.ico">
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Sufee Admin - HTML5 Admin Template</title>
    <meta name="description" content="Sufee Admin - HTML5 Admin Template">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="apple-touch-icon" href="apple-icon.png">
    <link rel="shortcut icon" href="favicon.ico">
    <link rel="stylesheet" href="<c:url value="/resources/assets/css/normalize.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/css/bootstrap.min.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/css/font-awesome.min.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/css/themify-icons.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/css/flag-icon.min.css"/>"/>
    <link rel="stylesheet" href="<c:url value="/resources/assets/css/cs-skin-elastic.css"/>"/>
    <!-- <link rel="stylesheet" href="assets/css/bootstrap-select.less"> -->
    <link rel="stylesheet" href="<c:url value="/resources/assets/scss/style.css"/>"/>
    
    
</head>
<body>
	
<%-- 	<form action="${url}" method="post"> --%>
<!-- 		<input type="text" name="id"/> -->
<!-- 		<input type="text" name="name"/> -->
<!-- 		<input type="text" name="salary"/> -->
<!-- 		<input type="text" name="designation"/> -->
<!-- 		<input type="submit" value="OK"/> -->
<!-- 	</form> -->
	<tiles:insertAttribute name="header"/>
	<tiles:insertAttribute name="menu"/>
	<tiles:insertAttribute name="content"/> 
	<h2>Danh sách dữ liệu trong Database </h2>
	<c:url value="/danh-sach" var="url"></c:url>
	<a href="${url}">Danh sách Lớp học</a>
	<br/>
	<a href="danhsach">Danh sách Sinh Viên</a>
	<script src="assets/js/vendor/jquery-2.1.4.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js"></script>
    <script src="assets/js/plugins.js"></script>
    <script src="assets/js/main.js"></script>
    <script src="assets/js/lib/chart-js/Chart.bundle.js"></script>
    <script src="assets/js/dashboard.js"></script>
    <script src="assets/js/widgets.js"></script>
    <script src="assets/js/lib/vector-map/jquery.vmap.js"></script>
    <script src="assets/js/lib/vector-map/jquery.vmap.min.js"></script>
    <script src="assets/js/lib/vector-map/jquery.vmap.sampledata.js"></script>
    <script src="assets/js/lib/vector-map/country/jquery.vmap.world.js"></script>
    <script>
        ( function ( $ ) {
            "use strict";

            jQuery( '#vmap' ).vectorMap( {
                map: 'world_en',
                backgroundColor: null,
                color: '#ffffff',
                hoverOpacity: 0.7,
                selectedColor: '#1de9b6',
                enableZoom: true,
                showTooltip: true,
                values: sample_data,
                scaleColors: [ '#1de9b6', '#03a9f5' ],
                normalizeFunction: 'polynomial'
            } );
        } )( jQuery );
    </script>
</body>
</html>