<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL - if</title>
</head>
<body>
<jsp:useBean id="colecao" class="com.example.aulajstl01.ColecaoDeNomes" />

${colecao.nomesAsString}

<c:forTokens var="nome" items="${colecao.nomesAsString}" delims=",">
    <c:out value="${nome}"/> ;

</c:forTokens>

<c:forEach var="nome" items="${colecao.nomes}">
    <c:out value="${nome}"/> ;

</c:forEach>

<br/>
<br><a href="index.jsp">Voltar</a>

</body>
</html>
