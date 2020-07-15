<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List" %>
<%@page import="calculadora.model.entity.User" %>
<!DOCTYPE html>
<html>
    <head> 
        <title> Listagem de Usuários </title>
        <meta charset="utf-8">
    </head>
    <body>        
        <%
			List<User> users = (List<User>) request.getAttribute("users");
            for(User user: users){
                out.print("Usuário: " + user.getEmail() + "<br/>");                
            } 		
        %>
    </body>    
</html>