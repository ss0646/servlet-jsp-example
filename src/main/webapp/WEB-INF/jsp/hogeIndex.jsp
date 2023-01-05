<%@page import="model.SiteEV"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
SiteEV siteEV = (SiteEV) application.getAttribute("siteEV");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hoge</title>
</head>
<body>
<p>
<a href="/servlet-jsp-example/HogeIndex?action=like">良いね</a>
<%= siteEV.getLike() %>人
<a href="/servlet-jsp-example/HogeIndex?action=dislike">良くないね</a>
<%= siteEV.getDislike() %>人
</p>
</body>
</html>