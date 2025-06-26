package userAuthApp;



import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // Simulate registration logic
        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        // In real apps, store to DB. Here, redirect to login.
        res.sendRedirect("login.jsp");
    }
}

