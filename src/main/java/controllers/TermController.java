package controllers;

import db.DBServices;
import entity.Discipline;
import entity.Term;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet (name = "TermController", urlPatterns = "/terms_list")
public class TermController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1 - вытягиваем все активные семестры
        //2 - понять какой семестр выбран и его отобразить
        //3 - достать дисциплины по выбранному семестру

        DBServices services = new DBServices();
        List<Term> terms = services.gelAllActiveTerms();
        req.setAttribute("terms", terms);//1

        String idSelectedTerm = req.getParameter("idSelectedTerm");

        //2:
        if (idSelectedTerm == null){
            if (terms.size() != 0){
                Term selectedTerm = terms.get(0);
                req.setAttribute("selectedTerm", selectedTerm);
                List<Discipline> disciplines = services.getDisciplinesByTerm(selectedTerm.getId() + "");
                req.setAttribute("disciplines",disciplines);
            } else{
                Term selectedTerm = services.getTermById(idSelectedTerm);
                req.setAttribute("selectedTerm", selectedTerm);
                List<Discipline> disciplines = services.getDisciplinesByTerm(selectedTerm.getId() + "");
                req.setAttribute("disciplines",disciplines);
            }
            req.getRequestDispatcher("WEB-INF/terms_list.jsp").forward(req, resp);
        }
    }
}
