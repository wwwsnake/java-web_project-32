package controllers;

import db.DBServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


@WebServlet (name = "StudentCreateController", urlPatterns = "/student-create")
public class StudentCreateController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/student-create.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String surname = req.getParameter("surname");
        String name = req.getParameter("name");
        String group = req.getParameter("group");
        String date = req.getParameter("date");
        DBServices database = new DBServices();
        //StringToDate:
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);

        Date dateFromUser;
       try {
           dateFromUser = format.parse(date);
       } catch (ParseException e) {
           throw new RuntimeException(e);
       }
       //Date to String:
        Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateFromDB = formatter.format(dateFromUser);

        database.createStudent(surname,name,group,dateFromDB);
        resp.sendRedirect("/students");//автоматический переход на страницу студентов
    }
}
