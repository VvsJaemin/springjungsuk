<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <c:set var="title1" value="Hello Word!!!"/>
 <c:set var="title2" value="안녕하세요 JSP입니다."/>
 <c:set var="str1" value="JSP"/>
 
 <h2>여러가지 문자열 함수 기능</h2>
 title1 = "Hello, Word!!"<br>
 title2 = "안녕하세요 JSP 입니다. !!!"<br>
 str1 = "JSP"<br>
 
    
    fn:length(title1) = ${fn:length(title1) }<br>
    fn:toUpperCase(title1) = ${fn:toUpperCase(title1) }<br>
    fn:toLowerCase(title1) = ${fn:toLowerCase(title1) }<br>
    
    fn:substring(title1,3,6) = ${fn:substring(title1,3,6) }<br>
    fn:trim(title1) = ${fn:trim(title1) }<br>
    fn:replace(title1, " ", "/") = ${fn:replace(title1, " ", "/")} <br>
    
    fn:indexOf(title2, str1) = ${fn:indexOf(title2,str1) }<br>
    fn:contains(title1, str1) = ${fn:contains(title1,str1) }<br>
    fn:contains(title2, str1) = ${fn:contains(title2, str2) }<br>
</body>
</html>