<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %> <!-- 페이지 지시자 -->
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="blogs/message?name=">파라미터 값 없음</a><br/><!-- 파라미터에 값이 없다-->
<a href="blogs/message?name=yjJeon">파라미터 값 있음</a><!-- 파라미터에 값이 있다.-->
<!-- 웹페지에서 상대경로를 권하는 이유 : 서버에 애플리케이션이 여러개 있을 수 있기 때문이다. -->

<form action="blogs/message" method="get">
        <label for="fname">이름: </label><br>
        <input type="text" id="fname" name="name" value="john"></br>
        <input type="submit" value="Submit">
</form>

</body>
</html>
<!-- 파일디렉티브->페이지 인코딩 -->