<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2024/10/28
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<html>
<head>
    <title>个人所得税计算服务</title>
</head>
<body>
<h3>个人所得税计算服务</h3>
<form action="TaxCalculationService" method="get">
    收入：<input type="text" name="income"><br>
    <input type="submit" value="计算税额">
</form>
</body>
</html>