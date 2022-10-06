package controllers;

import db.DBServices;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//тут описываем кнопку "Студенты" на главной странице
@WebServlet(name = "StudentsController", urlPatterns = "/students")
//имя и кусок адресной строки, которая будет отображаться в браузере
public class StudentsController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DBServices dbService = new DBServices();
        List<Student> students = dbService.gelAllActiveStudents();
        req.setAttribute("students", students);//указываем имя и что хотим передать(имя любое)
        req.getRequestDispatcher("WEB-INF/students.jsp").forward(req,resp);//вместо верстки пишем тут путь к файлу, в котором верстка

    }
}
