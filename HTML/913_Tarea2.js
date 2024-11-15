function ejemplo1(){
    let distancias=document.getElementsByName("distancias");
    let suma=0;
    let contador=0;
    for(let i=0;i<distancias.length;i++){
        suma+=Number(distancias[i].value);
        if(distancias[i].value<35){
            contador++;
        }
    }
    let promedio=suma/6;
    alert("El promedio es: "+promedio+"\n El numero de veces que no se supero los 35km por dia es de: "+contador);
}