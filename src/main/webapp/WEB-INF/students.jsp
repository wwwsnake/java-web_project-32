<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../resources/css/styles.css">
    <script src ="../resources/js/functions.js?122"></script>
    <title>Students List</title>
</head>

<body>

<div style="display: flex;">
    <div class="title">
        <span>Система управления студентами и их успеваемостью</span>
    </div>
    <div class= "logout_button" href="/login" ><span>
        <c:choose>
            <c:when test="${isLogin eq true}">
                <a href="/logout">Logout</a>
            </c:when>
            <c:otherwise>
                <a href="/login">Login</a>
            </c:otherwise>
        </c:choose>
        </span>
    </div>
</div>
<div style="display:flex;">
    <div class="to_title_button"><a href="/">На главную</a></div>
    <div id="buttons">
        <div>
            <div>
                <input type="submit" value="Просмотреть успеваемость выбранных студентов" class="left_button">
            </div>
            <div>
                <input type="submit" onclick="modifyStudents()" class="left_button" value="Модифицировать выбранного студента...">
            </div>
        </div>
        <div>
            <div>
                <form action="/student-create" method="get">
                    <input type="submit" value="Создать студента..." class="right_button">

                </form>
            </div>
            <div>
                <input type="submit" onclick="deleteStudents()" value="Удалить выбранных студентов" class="right_button">
            </div>
        </div>
    </div>
</div>

<div><b id="text">Список студентов</b></div>
<div>
    <form method="get">
        <table id="students_table">
            <thead class="thead">
            <tr>
                <th class="th1"></th>
                <th class="th1">Фамилия</th>
                <th class="th1">Имя</th>
                <th class="th1">Группа</th>
                <th class="th1">Дата поступления</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach items="${students}" var="student">

            <tr>
                <td class="td1"><input type="checkbox" value="${student.id}" name="idStud"></td>
                <td class="td1">${student.surname}</td>
                <td class="td1">${student.name}</td>
                <td class="td1">${student.group}</td>
                <td class="td1"><f:formatDate value="${student.date}" pattern="dd/mm/yyyy"/></td>
            </tr>
            </c:forEach>


            </tbody>
        </table>
    </form>
</div>

<form action="/student-delete" method="post" id="formDelete">
    <input type="hidden" value="" id="hiddenDelete" name="hiddenDelete">
</form>
<form action="/student-modify" method="get" id="formModify">
    <input type="hidden" value="" id="hiddenModify" name="hiddenModify">
</form>
</body>