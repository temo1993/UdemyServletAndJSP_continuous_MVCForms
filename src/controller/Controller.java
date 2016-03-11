package controller;

import beans.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Controller")
public class Controller extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public Controller() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if (action == null) {
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        } else if (action.equals("dologin")) {
            String email = req.getParameter("email");
            String password = req.getParameter("password");

            req.setAttribute("email",email);
            req.setAttribute("password",password);

            User user = new User(email,password);
            if (user.validate()) {
                req.getRequestDispatcher("/loginsuccess.jsp").forward(req,resp);
            } else {
                req.setAttribute("validationmessage", user.getMessage());
                req.getRequestDispatcher("/login.jsp").forward(req,resp);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if (action == null) {
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        } else if (action.equals("login")) {

            req.setAttribute("email","");
            req.setAttribute("password","");
            req.setAttribute("validationmessage", "");

            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }
}
