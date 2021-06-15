<%--
  Created by IntelliJ IDEA.
  User: DmitryWS
  Date: 15.06.2021
  Time: 08:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
</h1>
<br/>
<form action="test-servlet">
  <input type="text" name="x" value="1"/>
  <input type="text" name="y" value="2"/>
  <input type="submit" name="sub" value="Submit">
</form>
${res}<br>${code}
</body>
</html>