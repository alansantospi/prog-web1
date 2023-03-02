<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL - choose</title>
</head>
<body>
<c:forTokens var="nota" delims=";" items="10;2;3;4;6;5;8;4">
    <c:choose>
        <c:when test="${nota ge  7}">${nota} (aprovado)</c:when>

        <c:otherwise>${nota} (reprovado)</c:otherwise> </c:choose> ;
</c:forTokens >


<br/>
<br><a href="index.jsp">Voltar</a>
</body>
</html>
