
$("#contents").load("/login2")

// The below are all for get requests which is unsecure
//function login(){
//    const un = $("#login-un").val();
//    const pwd = $("#login-pwd").val();
//    $("#contents").load("/validate2?un="+un+"&pwd="+pwd);
//}

function createUser(){
    const un = $("#create-un").val();
    const pwd = $("#create-pwd").val();
    $("#contents").load("/create2?un="+un+"&pwd="+pwd);
}

function deleteTask(index){
    $("#contents").load("/delete2?task="+index);
}

function addTask(){
    const taskVal = $("#newtask").val();
    $("#contents").load("/addtask2?task="+encodeURIComponent(taskVal));
}


function login(){
const csrfToken = $("#csrfToken").val();
    const validatePath = $("#validatePath").val();
    const un = $("#login-un").val();
    const pwd = $("#login-pwd").val();
    $.post(validatePath,
            {un,pwd,csrfToken},
            data => $("#contents").html(data));
}