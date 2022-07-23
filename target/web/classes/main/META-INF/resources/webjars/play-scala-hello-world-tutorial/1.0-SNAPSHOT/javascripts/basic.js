console.log('I am from basic js');

$('#randomNumP').click(function(){
    console.log("click registered");
    $('#randomNum').load("/random");
});