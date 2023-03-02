<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<c:set scope="request" var="title" value="Bem-vindo!"/>
<head>
    <title>${title}</title>
</head>
<body>

<c:import var="headerText" url="header.jsp"/>
<br>Texto importado:${headerText}
<br>Minha página:${title}

<br/>
<br><a href="index.jsp">Voltar</a>
</body>
</html>
