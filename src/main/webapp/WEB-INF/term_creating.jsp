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
  <title>Term Creating</title>
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
  <h1>Для создания семестра заполните следующие данные и нажмите кнопку "Создать"</h1>
</div>

<div class="student_fields" id="surname_field">
  <span class="span1">Длительность (в неделях)</span>
  <input class="input_field" type="text">
</div>
<div>
  <form class="student_fields" action="/action_page.php">
    <label class="span1" style="margin-left: -5px;">Дисциплины в семестре</label>
    <select id="choose1" multiple>
      <option value="Информатика">Информатика</option>
      <option value="Политология">Политология</option>
      <option value="Социология">Социология</option>
      <option value="Высшая математика">Высшая математика</option>
      <option value="Теория алгоритмизации">Теория алгоритмизации</option>
      <option value="Теория игр">Теория игр</option>
      <option value="Булева алгебра">Булева алгебра</option>
      <option value="Системный анализ">Системный анализ</option>
    </select>
</div>
<br>
<p style="margin-left: 370px;">Hold down the Ctrl (windows) or Command (Mac) button to select multiple options.</p>
<br>
<input class="apply_button" type="submit" value="Создать">
</form>

<div class="error">Поля не должны быть пустыми!</div>



</body>

</html>