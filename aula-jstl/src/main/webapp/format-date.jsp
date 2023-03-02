<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSTL - Formatando datas</title>
</head>
<jsp:useBean id="agora" class="java.util.Date"/>
<h3>
    <%= "Olá! Hoje é: "%>
</h3>
<br> Versão Curta: <fmt:formatDate value="${agora}" />
<br> Versão Longa: <fmt:formatDate value="${agora}" dateStyle="full"/>
<br>
<br><a href="index.jsp">Voltar</a>
</body>
</html>