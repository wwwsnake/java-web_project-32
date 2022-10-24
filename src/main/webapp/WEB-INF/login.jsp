<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../resources/css/styles.css">
    <title>Система управления студентами и их успеваемостью</title>
</head>
<body>
<div class="header">
    <div class="left-side"></div>
    <div id="title"><h1>Система управления студентами и их успеваемостью</h1></div>
</div>
<div class="main">
    <div class="left-side"><div class="blue-button"></div><div class="blue-button"></div></div>
    <div class="index">
        <form method="post" action="/login">
            <div class="text">Выберите пользователя: <select name="role">
                <option value="1">Администратор</option>
                <option value="2">Учитель</option>
                <option value="3">Студент</option>
            </select>
            </div>
            <div>
                <div class="text">Логин: <input name="login" type="text" size="40"></div>
                <div class="text">Пароль: <input type="password" name="password" type="text" size="40"></div>
            </div>
            <div><input type="submit"  value="Войти" class="grey-button-discipline"><div style="width: 299px;"></div></div>

        </form>
        <c:if test="{$error eq 2}">
            <h4>Не верно ввели данные или не выбрана роль!</h4>
        </c:if>
        <c:if test="{$error eq 1}">
            <h4>Поля не должны быть пустыми!</h4>
        </c:if>
    </div>
    <div class="right-side blue-button"><span></span></div>
</div>
</div>
</body>