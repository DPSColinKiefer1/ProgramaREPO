function ejemplo2(){
    let n1, n2, n3, prom;
    n1=document.getElementById("nota1").value; 
    n2=document.getElementById("nota2").value; 
    n3=document.getElementById("nota3").value; 
    prom=(n1+n2+n3)/3;
    if (prom<12){
        document.write("Ha aprobado");
    }else {
        document.write("Ha desaprobado");
    }
}