<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL - if</title>
</head>
<body> Elementos pares:
<c:forTokens var="i" delims="," items="1,2,3,4,5,6">
    <c:if test="${i % 2 == 0}">
        <c:out value="${i}"/>;
    </c:if>
</c:forTokens >

<br/>
<br><a href="index.jsp">Voltar</a>
</body>
</html>
