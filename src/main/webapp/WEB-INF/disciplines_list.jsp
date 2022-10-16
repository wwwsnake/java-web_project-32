<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../resources/css/styles.css">
    <script src ="../resources/js/functions.js?122"></script>
    <title>Disciplines List</title>
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
    <div id="to_title_button"><a href="/">На главную</a></div>
    <h1 style="margin-left: -7%;">Список дисциплин</h1>
</div>

<div style="display: flex;">

    <table id="disciplines_list">
        <thead class="thead">
        <tr>
            <th class="th4"></th>
            <th class="th4">Наименование дисциплины</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td class="td4"><input type="checkbox"></td>
            <td class="td4">Высшая математика</td>
        </tr>
        <tr>
            <td class="td4"><input type="checkbox"></td>
            <td class="td4">История Науки и Техники</td>
        </tr>
        <tr>
            <td class="td4"><input type="checkbox"></td>
            <td class="td4">Политология</td>
        </tr>
        <tr>
            <td class="td4"><input type="checkbox"></td>
            <td class="td4">Информатика</td>
        </tr>
        <tr>
            <td class="td4"><input type="checkbox"></td>
            <td class="td4">Теория Алгоритмизации</td>
        </tr>
        </tbody>
    </table>

    <div>
        <div><button class="discipline_modify_button" style="margin-top: 50px;">Создать дисциплину...</button></div><br>
        <div><button class="discipline_modify_button">Модифицировать выбранную дисциплину...</button></div><br>
        <div><button class="discipline_modify_button">Удалить выбранную дисциплину...</button></div><br>
    </div>
</div>
</body>

</html>