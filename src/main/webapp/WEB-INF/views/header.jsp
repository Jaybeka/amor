<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="MobileOptimized" content="320">
<!-- Bootstrap Core CSS -->
<link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap THEMES CSS -->
<link href="assets/css/style.css" rel="stylesheet" type="text/css" />
<link href="assets/css/themes/default.css" rel="stylesheet" type="text/css" id="style_color" />

<!-- Custom CSS -->
<link href="assets/css/modern-business.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->

<!-- jQuery -->
<script src="assets/plugins/jquery/jquery-1.11.1.min.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>

