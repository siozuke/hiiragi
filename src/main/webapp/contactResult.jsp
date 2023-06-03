<%@page import="model.Contact"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//リクエストパラメータを取得
//request.setCharacterEncoding("UTF-8");
//String username = request.getParameter("username");
//String userfurigana = request.getParameter("userfurigana");
//String usertel = request.getParameter("usertel");
//String usermail = request.getParameter("usermail");
//String usercomment = request.getParameter("usercomment");

// リクエストパラメータをチェック
//String errorMsg = "";
//if (username == null || username.length() == 0) {
	//errorMsg += "名前が入力されていません<br>";
//}
//if (usertel == null || usertel.length() == 0) {
	//errorMsg += "電話番号が入力されていません<br>";
//}
//if (usermail == null || usermail.length() == 0) {
	//errorMsg += "メールアドレスが入力されていません<br>";
//}

// 表示するメッセージを設定
//String msg = name + "さん（" + gender + "）を登録しました";
//if (errorMsg.length() != 0) {
	//msg = errorMsg;
//}

// リクエストスコープに保存されたHealthを取得
Contact contact = (Contact) request.getAttribute("contact");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ひいらぎ不動産：お問い合わせ</title>
<link rel="stylesheet" href="css/mystyle.css">
<meta name="keywords" content="お問い合わせ,フォーム,電話番号">
<meta name="description" content="ひいらぎ不動産のお問い合わせ先です。">
<meta name="viewport" content="width=device-width">
</head>
</head>
<body>
<header>
<div class="header-in">
<a href="index.html" id="pagetop"><img src="image/logo.png" width="300" height="56" alt="Hiiragi Real Estate"></a>
<nav>
<ul>
<li><a href="index.html">トップ</a></li>
<li><a href="point.html">物件選びのポイント</a></li>
<li><a href="bukken01.html">おすすめ物件</a></li>
<li><a href="company.html">会社案内</a></li>
<li>お問い合わせ</li>
</ul>
</nav>
</div>
</header>
<article class="page">
<ol>
   <li><a href="index.html">トップ</a>&nbsp;&nbsp;&gt;</li>
   <li>お問い合わせ</li>
</ol>
<h1 class="sabu-h1">お問い合わせが完了しました。</h1>
<p>お問い合わせいただきありがとうございました。折り返し、担当者よりご連絡いたしますので、恐れ入りますが、
しばらくお待ちください。</p>
<section>
<table>
    <tr>
    <th>名前</th>
    <td><%= contact.getName() %></td>
    </tr>
    <tr>
    <th>フリガナ</th>
    <td><%= contact.getFurigana() %></td>
    </tr>
    <tr>
    <th>電話番号</th>
    <td><%= contact.getTel() %></td>
    </tr>
    <tr>
        <th>メールアドレス</th>
        <td><%= contact.getMail() %></td>
    </tr>
    <tr>
        <th>お問い合わせ内容</th>
        <td><%= contact.getComment() %></td>
    </tr>
</table>
</section>
</article>
<footer>
    <small>Copyright &copy; 2015 Hiiragi Real Estate. All Rights Reserved.</small>
</footer>
</body>
</html>