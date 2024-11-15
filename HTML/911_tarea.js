function ejemplo1(){
    let n1;
    n1=document.getElementById("edad").value; //se le da el valor del input a la variable
    if (n1>=12){
        alert("Su descuento sera del 10%");
    }else{
        alert("Su descuento sera del 15%");
    }
}