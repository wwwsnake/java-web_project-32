function deleteStudents (){
    //метод удаления выделенных студентов на сервер
    var checkedCheckboxs = document.querySelectorAll('input[name=idStud]:checked')
        //проверка что что-то выбрано:
    if (checkedCheckboxs.length == 0){
        alert("Выберите минимум один пункт!");
        return;
    }

    var ids ="";
    for (var i=0;i<checkedCheckboxs.length;i++){
        ids = ids + checkedCheckboxs[i].value + " ";
    }

    document.getElementById("hiddenDelete").value = ids;
    document.getElementById('formDelete').submit();
}

function modifyStudents (){
    //метод удаления выделенных студентов на сервер
    var checkedCheckboxs = document.querySelectorAll('input[name=idStud]:checked')
    //проверка что что-то выбрано:
    if (checkedCheckboxs.length == 0){
        alert("Выберите один пункт!");
        return;
    }
    if (checkedCheckboxs.length >1 ){
        alert("Выберите только один пункт!");
        return;
    }


    document.getElementById("hiddenModify").value = checkedCheckboxs[0].value;
    document.getElementById('formModify').submit();
}