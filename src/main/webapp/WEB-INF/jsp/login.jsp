<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
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
<form action="/hiiragi/LoginServlet" method="POST">
<p>
<label>ユーザーID:
<input type="text" name="userId" placeholder="ユーザー名を入力してください。" required>
</label>
</p>
<p>
<label>パスワード :
<input type="text" name="pass" placeholder="パスワードを入力してください。">
</label>
</p>
<p>
<p>
<button type="submit">ログイン</button>
</p>
</form>
</section>
</article>
<footer>
<small>Copyright &copy; 2015 Hiiragi Real Estate. All Rights Reserved.</small>
</footer>
</body>
</html>