"use strict"

const csrfToken = document.getElementById("csrfToken").value;
const validatePath = document.getElementById("validatePath").value;

function login(){
    const un = document.getElementById("login-un").value;
    const pwd = document.getElementById("login-pwd").value;
    fetch(validatePath,{
        method: 'POST',
        headers: {'Content-Type':'application/json'},

    })
}