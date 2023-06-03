<%@page import="model.Contact"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//リクエストパラメータを取得
request.setCharacterEncoding("UTF-8");

@SuppressWarnings("unchecked")
List<Contact> contactList = (List<Contact>)request.getAttribute("contactList");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ひいらぎ不動産：お問い合わせ</title>
<link rel="stylesheet" href="css/style.css">
<meta name="keywords" content="お問い合わせ,フォーム,電話番号">
<meta name="description" content="ひいらぎ不動産のお問い合わせ先です。">
<meta name="viewport" content="width=device-width">
</head>
<body>
<header>
<div class="header-in">
<a href="index.html" id="pagetop"><img src="image/logo.png" width="300" height="56" alt="Hiiragi Real Estate"></a>
<nav>
<ul>
<li><a href="index.html">トップ</a></li>
</ul>
</nav>
</div>
</header>
<article class="page">
<ol>
<li><a href="index.html">トップ</a>&nbsp;&nbsp;&gt;</li>
<li>管理者ログイン画面</li>
</ol>
<h1 class="sabu-h1">管理者ログイン画面</h1>
<section>
<table>
    <tr>
    <th>ID</th>
    <th>名前</th>
    <th>フリガナ</th>
    <th>電話番号</th>
    <th>メールアドレス</th>
    <th>お問い合わせ内容</th>
    </tr>
    <% for(Contact contact : contactList) {%>
    <tr>
    <td><%= contact.getId() %></td>
    <td><%= contact.getName() %></td>
    <td><%= contact.getFurigana() %></td>
    <td><%= contact.getTel() %></td>
    <td><%= contact.getMail() %></td>
    <td><%= contact.getComment() %></td>
    </tr>
    <% } %>
</table>
</section>
</article>
<footer>
<small>Copyright &copy; 2015 Hiiragi Real Estate. All Rights Reserved.</small>
</footer>
</body>
</html>