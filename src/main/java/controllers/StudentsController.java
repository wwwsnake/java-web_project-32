package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//тут описываем кнопку "Студенты" на главной странице
@WebServlet(name = "StudentsController", urlPatterns = "/students")
//имя и кусок адресной строки, которая будет отображаться в браузере
public class StudentsController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/students.jsp").forward(req,resp);//вместо верстки пишем тут путь к файлу, в котором верстка

    }
}
