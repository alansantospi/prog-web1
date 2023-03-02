<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL - Foreach</title>
</head>
<body>
<c:forEach var="i" begin="2" end="5">
    <c:out value="${i}"/>
</c:forEach>
<br/>
<br><a href="index.jsp">Voltar</a>
</body>
</html>
