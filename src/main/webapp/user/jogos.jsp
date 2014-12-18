

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>        
        <%  
        String jogador = (String)session.getAttribute("login");  
        %>
        Olá, <%=jogador%>  
        <a href="http://localhost:8080/tcc/jogos/Memory-master/index.html">Jogo da Memoria</a>
        <a href="http://localhost:8080/tcc/jogos/word-search-game-master/index.html">Caça Palavras</a>
       
    </body>
</html>
