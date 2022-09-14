package db;

import entity.*;

import java.util.List;

public interface IDBServices {

    List<Discipline> getAllActiveDisciplines(); //вывести список активных дисциплин

    void createDiscipline(String discipline);//добавить дисциплину

    Discipline getDisciplineById(String id);//вытаскивает из базы дисциплину по id

    void modifyDiscipline(String id, String newDiscipline);//изменение дисциплины

    void deleteDiscipline(String id);//удалить дисциплину (на самом деле меняется статус)


    List<Student> gelAllActiveStudents();//вывести список студентов

    void createStudent(String surname, String name, String group, String date);//создать студента

    Student getStudentById(String id);//вытаскивает из базы данные студента по id

    void modifyStudent(String id, String newSurname, String newName, String newGroup, String newData);//изменение данных студента

    void deleteStudent(String id);//удалить студента (на самом деле меняется статус)

    List<Term> gelAllActiveTerms();//вывести список активных семестров

    List<Discipline> getDisciplinesByTerm(String idTerm);//список дисциплин из выбранного семестра

    void createTerm(String duration, String idsDisciplines);//сюда будут передаваться id дисциплин в стринге для создания нового семестра

    Term getTermById(String id);//получить семестр по id

    void modifyTerm(String id, String newDuration, String newIdsDisciplines);//изменить семестр

    void deleteTerm(String id);//удалить семестр (на самом деле меняется статус)

    List<Mark> getMarks(String idStud, String idTerm);//посмотреть оценки студента (успеваемость)

    List<Role> getAllActiveRoles();//список ролей

    boolean canLogin(String login, String password, String idRole);//если в базе есть логин и пароль - вход возможен


}
