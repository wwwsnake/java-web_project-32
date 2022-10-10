package db;

import constants.Constants;
import entity.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.SwingConstants.LEFT;

public class DBServices implements IDBServices {
    @Override
    public List<Discipline> getAllActiveDisciplines() {
        ArrayList<Discipline> disciplines = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//подключаем драйвер для работы с БД
            Connection conn = DriverManager.getConnection(Constants.URL_TO_DB, Constants.LOGIN_TO_DB, Constants.PASSWORD_TO_DB);
            //создаем подключение к БД (localhost - этот комп, другой комп - пишем айпи), пишем логин и пароль от MySQL
            Statement stmt = conn.createStatement(); //создаем запрос
            ResultSet rs = stmt.executeQuery("SELECT * FROM disciplines_of_term where status = '1'");

            while (rs.next()) {//пока есть следующая строка
                Discipline discipline = new Discipline();
                discipline.setId(rs.getInt("id"));
                discipline.setDiscipline(rs.getString("discipline_name"));
                disciplines.add(discipline);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return disciplines;
    }

    @Override
    public void createDiscipline(String discipline) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//подключаем драйвер для работы с БД
            Connection conn = DriverManager.getConnection(Constants.URL_TO_DB, Constants.LOGIN_TO_DB, Constants.PASSWORD_TO_DB);
            //создаем подключение к БД (localhost - этот комп, другой комп - пишем айпи), пишем логин и пароль от MySQL
            Statement stmt = conn.createStatement(); //создаем запрос
            stmt.execute("INSERT INTO `disciplines_of_term` (`discipline_name`) VALUES ('" + discipline + "');\n");
        } catch (Exception e) {
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
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//подключаем драйвер для работы с БД
            Connection conn = DriverManager.getConnection(Constants.URL_TO_DB, Constants.LOGIN_TO_DB, Constants.PASSWORD_TO_DB);
            //создаем подключение к БД (localhost - этот комп, другой комп - пишем айпи), пишем логин и пароль от MySQL
            Statement stmt = conn.createStatement(); //создаем запрос
            ResultSet rs = stmt.executeQuery("SELECT * FROM students_32.student where status = '1'");

            while (rs.next()) {//пока есть следующая строка
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setSurname(rs.getString("surname"));
                student.setName(rs.getString("name"));
                student.setGroup(rs.getString("group"));
                student.setDate(rs.getDate("date"));
                students.add(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    @Override
    public void createStudent(String surname, String name, String group, String date) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//подключаем драйвер для работы с БД
            Connection conn = DriverManager.getConnection(Constants.URL_TO_DB, Constants.LOGIN_TO_DB, Constants.PASSWORD_TO_DB);
            Statement stmt = conn.createStatement();
            stmt.execute("INSERT INTO  students_32.student (surname,name,group,date) VALUES (('" + surname + "'),('" + name + "'),('" + group + "'),('" + date + "'));");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Student getStudentById(String id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//подключаем драйвер для работы с БД
            Connection conn = DriverManager.getConnection(Constants.URL_TO_DB, Constants.LOGIN_TO_DB, Constants.PASSWORD_TO_DB);
            //создаем подключение к БД (localhost - этот комп, другой комп - пишем айпи), пишем логин и пароль от MySQL
            Statement stmt = conn.createStatement(); //создаем запрос
            ResultSet rs = stmt.executeQuery("SELECT * FROM students_32.student where status = '1' and id = " + id);

            while (rs.next()) {//пока есть следующая строка
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setSurname(rs.getString("surname"));
                student.setName(rs.getString("name"));
                student.setGroup(rs.getString("group"));
                student.setDate(rs.getDate("date"));
                return student;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void modifyStudent(String id, String newSurname, String newName, String newGroup, String newData) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//подключаем драйвер для работы с БД
            Connection conn = DriverManager.getConnection(Constants.URL_TO_DB, Constants.LOGIN_TO_DB, Constants.PASSWORD_TO_DB);
            Statement stmt = conn.createStatement();
            stmt.execute("UPDATE `student` SET `surname` = '" + newSurname + "', `name` = '" + newName + "',`group` = '" + newGroup + "',`date` = '" + newData + "' WHERE (`id` = '" + id + "');\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(String id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//подключаем драйвер для работы с БД
            Connection conn = DriverManager.getConnection(Constants.URL_TO_DB, Constants.LOGIN_TO_DB, Constants.PASSWORD_TO_DB);
            //создаем подключение к БД (localhost - этот комп, другой комп - пишем айпи), пишем логин и пароль от MySQL
            Statement stmt = conn.createStatement(); //создаем запрос
            stmt.execute("UPDATE `students_32`.`student` SET `status` = '0' WHERE (`id` = '" + id + "');");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Term> gelAllActiveTerms() {
        ArrayList<Term> terms = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//подключаем драйвер для работы с БД
            Connection conn = DriverManager.getConnection(Constants.URL_TO_DB, Constants.LOGIN_TO_DB, Constants.PASSWORD_TO_DB);
            //создаем подключение к БД (localhost - этот комп, другой комп - пишем айпи), пишем логин и пароль от MySQL
            Statement stmt = conn.createStatement(); //создаем запрос
            ResultSet rs = stmt.executeQuery("SELECT * FROM students_32.terms where status = '1'");

            while (rs.next()) {//пока есть следующая строка
                Term term = new Term();
                term.setId(rs.getInt("id"));
                term.setTerm(rs.getString("term_name"));
                term.setDuration(rs.getString("duration"));
                terms.add(term);
            }
        } catch (Exception e) {
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
    public List<Role> getAllActiveRoles() {
        ArrayList<Role> roles = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//подключаем драйвер для работы с БД
            Connection conn = DriverManager.getConnection(Constants.URL_TO_DB, Constants.LOGIN_TO_DB, Constants.PASSWORD_TO_DB);
            //создаем подключение к БД (localhost - этот комп, другой комп - пишем айпи), пишем логин и пароль от MySQL
            Statement stmt = conn.createStatement(); //создаем запрос
            ResultSet rs = stmt.executeQuery("SELECT * FROM students_32.role where status = '1'");

            while (rs.next()) {//пока есть следующая строка
                Role role = new Role();
                role.setId(rs.getInt("id"));
                role.setRole(rs.getString("role"));
                roles.add(role);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return roles;
    }

    @Override
    public boolean canLogin(String login, String password, String idRole) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//подключаем драйвер для работы с БД
            Connection conn = DriverManager.getConnection(Constants.URL_TO_DB, Constants.LOGIN_TO_DB, Constants.PASSWORD_TO_DB);
            //создаем подключение к БД (localhost - этот комп, другой комп - пишем айпи), пишем логин и пароль от MySQL
            Statement stmt = conn.createStatement(); //создаем запрос
            ResultSet rs = stmt.executeQuery("SELECT * FROM user_role as ur\n" +
                    "LEFT JOIN user as u on ur.id_user = u.id\n" +
                    "WHERE u.login = '" +login + "' and u.password = '" + password + "'and ur.id_role = " + idRole);

            while (rs.next()) {//пока есть следующая строка
               return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }
}
