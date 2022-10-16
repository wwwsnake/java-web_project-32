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
  <title>Discipline Modifying</title>
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
  <div class="back_button"><a href="...">Назад</a></div>
  <h1 id="h1_discipline_modifying">Для того чтобы Модифицировать дисциплину введите новое значение поля и нажмите кнопку "Применить":</h1>
</div>

<div class="student_fields" id="surname_field">
  <span class="span3">Название</span>
  <input class="input_field" type="text">
</div>

<div><button class="apply_button1">Применить</button></div>
</body>

</html>