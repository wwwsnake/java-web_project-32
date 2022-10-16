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
    <title>Terms List</title>
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
    <div id="term_choose1">
        <span id="span_choose_term">Выбрать семестр</span>
        <select name="idSelectedTerm" size="1">
            <c:forEach items="${terms}" var="t">
                <option value="${t.id}">${t.term}</option>
            </c:forEach>
        </select>
        <div><input type="submit" value="Выбрать" id="choose_button"></div> <br>
    </div>
</div>
<div>
    <div class="span2"><span >Длительность семестра: 24 недели</span><br></div>
    <div class="span2"><span >Список дисциплин семестра</span></div>
</div>




<div style="display: flex;">

    <table id="disciplines_list">
        <thead class="thead">
        <tr>

            <th class="th4" id="discipline_name1">Наименование дисциплины</th>
        </tr>
        </thead>
        <tbody>
      <c:forEach items="${disciplines}" var="d">
          <tr>
              <td class="td4">${d.disciplines}</td>
          </tr>
      </c:forEach>
        </tbody>
    </table>

    <div>
        <div><button class="discipline_modify_button" style="margin-top: 50px;">Создать семестр...</button></div>
        <br>
        <div><button class="discipline_modify_button">Модифицировать текущий семестр...</button></div><br>
        <div><button class="discipline_modify_button">Удалить текущий семестр</button></div><br>
    </div>
</div>
</body>

</html>