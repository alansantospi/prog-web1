<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL - forTokens</title>
</head>
<body>
<c:forTokens var="i" delims=";" items="maria;joao;joana;jose">
    <c:out value="${i}"/> -
</c:forTokens >
<br/>
<br><a href="index.jsp">Voltar</a>
</body>
</html>
