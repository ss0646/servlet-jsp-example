<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
User registerUser = (User) session.getAttribute("registerUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録</title>
</head>
<body>
<p>下記のユーザーを登録します</p>
<p>
ログインID:<%= registerUser.getId() %><br>
名前:<%= registerUser.getName() %><br>
</p>
<a href="/servlet-jsp-example/RegisterUser">戻る</a>
<a href="/servlet-jsp-example/RegisterUser?action=done">登録</a>
</body>
</html>