
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<div>
  <div class="header">
    <div class="left-side"></div>
    <div id="title"><h1>Система управления студентами и их успеваемостью</h1></div>
    <div class=" right-side blue-button logout"><span><a href="">Logout</a></span></div>
  </div>
  <div class="main">
    <div class="left-side"><div class="blue-button"><a href="/">На главную</a></div><div class="blue-button"></div></div>
    <div class="center">
      <div class="center-top-buttons">
        <div><button class="grey-button-top">Просмотреть успеваемость выбранных студентов</button></div>
        <div><button class="grey-button-top"  onclick="window.location.href = './student_cr.html';">Создать студента...</button></div>
      </div>
      <div class="center-top-buttons">
        <div><button class="grey-button-top">Модифицировать выбранного студента</button></div>
        <div><button class="grey-button-top">Удалить выбранных студентов...</button></div>
      </div>

      <div><b class="text">Список студентов</b></div>
      <div>
        <form method="get">
          <table>
            <thead class="thead">
            <tr>
              <th></th>
              <th>Фамилия</th>
              <th>Имя</th>
              <th>Группа</th>
              <th>Дата поступления</th>
            </tr>
            </thead>
            <tbody>
            <tr>
              <td><input type="checkbox"></td>
              <td>with two columns</td>
              <td>The table body</td>
              <td>with two columns</td>
              <td>with two columns</td>
            </tr>
            <tr>
              <td><input type="checkbox"></td>
              <td>with two columns</td>
              <td>The table body</td>
              <td>with two columns</td>
              <td>with two columns</td>
            </tr>
            <tr>
              <td><input type="checkbox"></td>
              <td>with two columns</td>
              <td>The table body</td>
              <td>with two columns</td>
              <td>with two columns</td>
            </tr>
            <tr>
              <td><input type="checkbox"></td>
              <td>with two columns</td>
              <td>The table body</td>
              <td>with two columns</td>
              <td>with two columns</td>
            </tr>
            <tr>
              <td><input type="checkbox"></td>
              <td>with two columns</td>
              <td>The table body</td>
              <td>with two columns</td>
              <td>with two columns</td>
            </tr>
            </tbody>
          </table>
        </form>
      </div>
    </div>
    <div class="right-side blue-button"><span></span></div>
  </div>
</div>
</body>
