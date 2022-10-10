<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../resources/css/styles.css">
    <script src ="../resources/js/functions.js?122"></script>
    <title>Discipline Creating</title>
</head>

<body>
<div style="display: flex;">
    <div class="title">
        <span>Система управления студентами и их успеваемостью</span>
    </div>
    <a class="logout_button" href="Logout">Logout</a>
</div>
<div style="display:flex;">
    <div class="to_title_button"><a href="titlePage.html">На главную</a></div>
    <div class="back_button"><a href="...">Назад</a></div>
    <h1 id="h1_discipline_creating">Для того чтобы создать новую дисциплину заполните все поля и нажмите кнопку
        "Создать":</h1>
</div>

<div class="student_fields" id="surname_field">
    <span class="span3">Название</span>
    <input class="input_field" type="text">
</div>

<div><button class="apply_button1">Создать</button></div>
<div class="error">Поля не должны быть пустыми!</div>
</body>

</html>