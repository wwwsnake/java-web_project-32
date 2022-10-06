<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Title Page</title>
    <link rel="stylesheet" href="../resources/css/styles.css">
</head>

<body>
<div style="display: flex;">
    <div class="title">
            <span>Система управления студентами и их
                успеваемостью</span>
    </div>
    <a class= "logout_button" href="Logout" >Logout</a>
</div>
<div id="div_with_buttons">
    <a id="students_button" href="/students">Студенты</a>
    <a id="disciplines_button" href="Дисциплины">Дисциплины</a>
    <a id="terms_button" href="Семестры">Семестры</a>
</div>
</body>

</html>