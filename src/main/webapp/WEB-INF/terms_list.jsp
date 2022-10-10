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
    <a class="logout_button" href="Logout">Logout</a>
</div>
<div style="display:flex;">
    <div id="to_title_button"><a href="titlePage.html">На главную</a></div>
    <div id="term_choose1">
        <span id="span_choose_term">Выбрать семестр</span>
        <select id="selectvalue">
            <option>Семестр 1</option>
            <option>Семестр 2</option>
        </select>
        <button id="choose_button">Выбрать</button> <br>
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
        <tr>

            <td class="td4">Высшая математика</td>
        </tr>
        <tr>
            <td class="td4">История Науки и Техники</td>
        </tr>
        <tr>

            <td class="td4">Политология</td>
        </tr>
        <tr>

            <td class="td4">Информатика</td>
        </tr>
        <tr>

            <td class="td4">Теория Алгоритмизации</td>
        </tr>
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