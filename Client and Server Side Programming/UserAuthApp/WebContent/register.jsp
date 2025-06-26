<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <script src="js/validate.js"></script>
</head>
<body>
    <form action="RegisterServlet" method="post" onsubmit="return validateRegister()">
        <h2>Register</h2>
        <input type="text" name="username" id="regUsername" placeholder="Username"><br>
        <input type="password" name="password" id="regPassword" placeholder="Password"><br>
        <input type="submit" value="Register">
    </form>
    <p>Already a user? <a href="login.jsp">Login here</a></p>
</body>
</html>
