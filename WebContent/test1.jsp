<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ABCDEFG</title>
</head>
<body>

        <form action="./Hello">
            <p>ここに値を入れてください：<input type="text" name="name"></p>
            <p>ここに値を入れてください：<input type="text" name="age"></p>
            <input type="submit" value="GETで送信">
        </form>

        <%-- POSTメソッドでテキストを送信 --%>
        <form method="post" action="./Hello">
            <p>ここに値を入れてください：<input type="text" name="name"></p>
            <p>ここに値を入れてください：<input type="text" name="age"></p>
            <input type="submit" value="POSTで送信">
        </form>

</body>
</html>