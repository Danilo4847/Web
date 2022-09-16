<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>

</head>
<body>
  <form class="form" action="autenticacao" method="post">
     

      

      <input  type="text" name="user"/>
      <input  type="password" name="senha"/>

      <div class="checkbox">
          <input type="checkbox" name="logado"/>
          <label>Manter logado</label>
      </div>

      <input type="submit"/>
  </form>
</body>
</html>
