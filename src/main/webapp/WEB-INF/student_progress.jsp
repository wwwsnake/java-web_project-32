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
  <title>Student Progress</title>
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
  <h1>Отображена успеваемость для следующего студента:</h1>
</div>

<table id="student_info">
  <thead class="thead">
  <tr>
    <th class="th2">Фамилия</th>
    <th class="th2">Имя</th>
    <th class="th2">Группа</th>
    <th class="th2">Дата поступления</th>
  </tr>
  </thead>
  <tbody>
  <tr>
    <td class="td2">with two columns</td>
    <td class="td2">The table body</td>
    <td class="td2">with two columns</td>
    <td class="td2">with two columns</td>
  </tr>
  </tbody>
</table>

<div style="display: flex;">
  <table id="student_marks">
    <thead class="thead">
    <tr>
      <th class="th3">Дисциплина</th>
      <th class="th3">Оценка</th>
    </tr>
    </thead>
    <tbody>
    <tr>
      <td class="td3">текст</td>
      <td class="td3">число</td>
    </tr>
    <tr>
      <td class="td3">текст</td>
      <td class="td3">число</td>
    </tr>
    <tr>
      <td class="td3">текст</td>
      <td class="td3">число</td>
    </tr>
    <tr>
      <td class="td3">текст</td>
      <td class="td3">число</td>
    </tr>
    <tr>
      <td class="td3">текст</td>
      <td class="td3">число</td>
    </tr>
    </tbody>
  </table>
  <div id="term_choose">
    <span>Выбрать семестр</span>
    <select id="selectvalue">
      <option>Семестр 1</option>
      <option>Семестр 2</option>
    </select>
    <button id="choose_button">Выбрать</button> <br>
    <div id="middle_mark">
      <span>Средняя оценка за семестр: Х балла</span>
    </div>

  </div>
</div>
</body>