<%@ page session="true" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Restrito</title>

</head>
<body>
<h1>Acesso Restrito <a href="logout">Sair</a></h1>
<br/>
<h3>Seja bem-vindo, ${sessionScope.get("user")}</h3>

</body>
</html>