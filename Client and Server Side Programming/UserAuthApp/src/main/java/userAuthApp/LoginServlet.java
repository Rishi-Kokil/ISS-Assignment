package userAuthApp;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String user = req.getParameter("username");
        String pass = req.getParameter("password");

        HttpSession session = req.getSession();

        if ("admin".equals(user) && "admin123".equals(pass)) {
            session.setAttribute("username", user);
            res.sendRedirect("welcome.jsp");
        } else {
            res.sendRedirect("error.jsp");
        }
    }
}

