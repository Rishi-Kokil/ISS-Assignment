<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <script src="js/validate.js"></script>
</head>
<body>
    <form action="LoginServlet" method="post" onsubmit="return validateLogin()">
        <h2>Login</h2>
        <input type="text" name="username" id="username" placeholder="Username"><br>
        <input type="password" name="password" id="password" placeholder="Password"><br>
        <input type="submit" value="Login">
    </form>
    <p>New user? <a href="register.jsp">Register here</a></p>
</body>
</html>
