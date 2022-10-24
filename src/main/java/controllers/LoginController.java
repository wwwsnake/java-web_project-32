package controllers;
//контроллер Логин/Логаут

import db.DBServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginController", urlPatterns = "/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //считываем что ввел пользователь при аторизации и проверяем есть ли такой в базе:
        String role = req.getParameter("role");
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (login == null || login.equals(("")) || password == null || password.equals((""))) {
            req.setAttribute("error", "1");
            req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
        }

        DBServices dbServices = new DBServices();
        if (dbServices.canLogin(login, password, role)) {
            req.getSession().setAttribute("isLogin", true); //проверяем залогинен уже или нет
            req.getSession().setAttribute("role", role);
            resp.sendRedirect("/");
        } else {
            req.setAttribute("error", 2);
            req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
        }
    }
}
