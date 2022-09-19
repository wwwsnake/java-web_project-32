package db;

import entity.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBServices implements IDBServices{
    @Override
    public List<Discipline> getAllActiveDisciplines() {
        ArrayList<Discipline> disciplines = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//подключаем драйвер для работы с БД
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_32","root","Madridist1989");
            //создаем подключение к БД (localhost - этот комп, другой комп - пишем айпи), пишем логин и пароль от MySQL
            Statement stmt = conn.createStatement(); //создаем запрос
            ResultSet rs = stmt.executeQuery("SELECT * FROM disciplines_of_term where status = '1'");

            while (rs.next()){//пока есть следующая строка
                Discipline discipline = new Discipline();
                discipline.setId(rs.getInt("id"));
                discipline.setDiscipline(rs.getString("discipline_name"));
                disciplines.add(discipline);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return disciplines;
    }

    @Override
    public void createDiscipline(String discipline) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//подключаем драйвер для работы с БД
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_32","root","Madridist1989");
            //создаем подключение к БД (localhost - этот комп, другой комп - пишем айпи), пишем логин и пароль от MySQL
            Statement stmt = conn.createStatement(); //создаем запрос
            stmt.execute("INSERT INTO `disciplines_of_term` (`discipline_name`) VALUES ('" +  discipline +  "');\n");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Discipline getDisciplineById(String id) {


        return null;
    }

    @Override
    public void modifyDiscipline(String id, String newDiscipline) {

    }

    @Override
    public void deleteDiscipline(String id) {

    }

    @Override
    public List<Student> gelAllActiveStudents() {

        ArrayList<Student> students = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//подключаем драйвер для работы с БД
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_32","root","Madridist1989");
            //создаем подключение к БД (localhost - этот комп, другой комп - пишем айпи), пишем логин и пароль от MySQL
            Statement stmt = conn.createStatement(); //создаем запрос
            ResultSet rs = stmt.executeQuery("SELECT * FROM students_32.student where status = '1'");

            while (rs.next()){//пока есть следующая строка
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setSurname(rs.getString("surname"));
                student.setName(rs.getString("name"));
                student.setGroup(rs.getString("group"));
                student.setDate(rs.getDate("date"));
                students.add(student);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public void createStudent(String surname, String name, String group, String date) {

    }

    @Override
    public Student getStudentById(String id) {
        return null;
    }

    @Override
    public void modifyStudent(String id, String newSurname, String newName, String newGroup, String newData) {

    }

    @Override
    public void deleteStudent(String id) {

    }

    @Override
    public List<Term> gelAllActiveTerms() {
        ArrayList<Term> terms = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//подключаем драйвер для работы с БД
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_32","root","Madridist1989");
            //создаем подключение к БД (localhost - этот комп, другой комп - пишем айпи), пишем логин и пароль от MySQL
            Statement stmt = conn.createStatement(); //создаем запрос
            ResultSet rs = stmt.executeQuery("SELECT * FROM students_32.terms where status = '1'");

            while (rs.next()){//пока есть следующая строка
                Term term = new Term();
                term.setId(rs.getInt("id"));
                term.setTerm(rs.getString("term_name"));
                term.setDuration(rs.getString("duration"));
                terms.add(term);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return terms;
    }

    @Override
    public List<Discipline> getDisciplinesByTerm(String idTerm) {
        return null;
    }

    @Override
    public void createTerm(String duration, String idsDisciplines) {

    }

    @Override
    public Term getTermById(String id) {
        return null;
    }

    @Override
    public void modifyTerm(String id, String newDuration, String newIdsDisciplines) {

    }

    @Override
    public void deleteTerm(String id) {

    }

    @Override
    public List<Mark> getMarks(String idStud, String idTerm) {
        return null;
    }

    @Override
    public List<Role> getAllActiveRoles(){
        ArrayList<Role> roles = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//подключаем драйвер для работы с БД
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_32","root","Madridist1989");
            //создаем подключение к БД (localhost - этот комп, другой комп - пишем айпи), пишем логин и пароль от MySQL
            Statement stmt = conn.createStatement(); //создаем запрос
            ResultSet rs = stmt.executeQuery("SELECT * FROM students_32.terms where status = '1'");

            while (rs.next()){//пока есть следующая строка
                Role role = new Role();
                role.setId(rs.getInt("id"));
                role.setRole(rs.getString("role"));
                roles.add(role);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return roles;
    }

    @Override
    public boolean canLogin(String login, String password, String idRole) {
        return false;
    }
}
