<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="sec"	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Hola soy un libro</h3>

<c:forEach items="${titulolibro}" var="libro">

<div id="inf"> 
 ${libro.idlibro}-${libro.nombre}-${libro.descripcion}-${libro.isbn}-${libro.portada}
</div>
 </c:forEach>
 
 <script type="text/javascript">
 $(document).ready(function(){
	 $("#inf").on("click", function(){
		 alert($("#inf").text());
	 })
 })
 
 
 
 </script>

</body>
</html>