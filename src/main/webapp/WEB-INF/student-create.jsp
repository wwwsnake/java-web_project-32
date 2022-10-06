<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Creating</title>
    <link rel="stylesheet" href="../resources/css/styles.css">
    <link rel="stylesheet" href="//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
    <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
    <script>
        $( function() {
            $( "#datepicker" ).datepicker();
        } );
    </script>
</head>

<body>
<div style="display: flex;">
    <div class="title">
        <span>Система управления студентами и их успеваемостью</span>
    </div>
    <a class="logout_button" href="Logout">Logout</a>
</div>
<div style="display:flex;">
    <div class="to_title_button"><a href="/">На главную</a></div>
    <div class="back_button"><a href="javascript:history.back()">Назад</a></div>
    <h1>Для создания студента заполните все поля и нажмите кнопку "Создать"</h1>
</div>


<form method="post" action="student-create">
    <div class="student_fields" id="surname_field">
        <span class="span1">Фамилия</span>
        <input name="surname" input_field type="text">
    </div>

    <div class="student_fields">
        <span class="span1">Имя</span>
        <input name="name" class="input_field" type="text">
    </div>
    <div class="student_fields">
        <span class="span1">Группа</span>
        <input name="group" input_field type="text">
    </div>
    <div class="student_fields">
        <span class="span1">Дата поступления</span>
        <input id="datepicker" name="date" class="input_field" type="text">
    </div>
    <div><input type="submit" value="Создать" class="apply_button"></div>
</form>


<div class="error">Поля не должны быть пустыми!</div>

</body>

</html>