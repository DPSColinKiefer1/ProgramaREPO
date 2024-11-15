function ejemplo1(){
    let mes=document.getElementById("mes").value;
    mes=mes.toUpperCase();
    if (mes == "ENERO") {
        alert("El mes tiene: 31 dias");
    } else if (mes == "FEBRERO") {
        alert("El mes tiene: 28 o 29 dias");
    } else if (mes == "MARZO") {
        alert("El mes tiene: 31 dias");
    } else if (mes == "ABRIL") {
        alert("El mes tiene: 30 dias");
    } else if (mes == "MAYO") {
        alert("El mes tiene: 31 dias");
    } else if (mes == "JUNIO") {
        alert("El mes tiene: 30 dias");
    } else if (mes == "JULIO") {
        alert("El mes tiene: 31 dias");
    } else if (mes == "AGOSTO") {
        alert("El mes tiene: 31 dias");
    } else if (mes == "SEPTIEMBRE") {
        alert("El mes tiene: 30 dias");
    } else if (mes == "OCTUBRE") {
        alert("El mes tiene: 31 dias");
    } else if (mes == "NOVIEMBRE") {
        alert("El mes tiene: 30 dias");
    } else if (mes == "DICIEMBRE") {
        alert("El mes tiene: 31 dias");
    } else{
        alert("Ingrese un mes valido");
    }
}