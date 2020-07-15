<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="login-container">
            <div class="content">
                <section>
                    
                    <h1>Faça Login</h1>
                </section>  
                <form action="/calculadora/login" method="POST">
                    <input
                        id="email"
                        type="text"
                        name="email"
                        
                    >
                    <input 
                        type="password" 
                        name="password" 
                        id="password"
                        placeholder="Password"
                    >
                    <button type="submit" class="button">Logar</button>
                </form>

</body>
</html>