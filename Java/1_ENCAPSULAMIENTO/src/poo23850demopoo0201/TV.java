package poo23850demopoo0201;
public class TV {
    private int canal=1;
    private int nivelvolumen=1;
    private boolean on=false;
    public TV(){
    }
    public void turnon(){
        on=true;
    }
    public void turnoff(){
        on=false;
    }
    public boolean isOn(){
        return on;
    }
    public int getNivelvolumen(){
        return nivelvolumen;
    }
    public int getCanal(){
        return canal;
    }
    public void setCanal(int canal){
        if(on&&canal>=1&&canal<=120)
            this.canal=canal;
    }
    public void setNivelvolumen(int nivelvolumen){
        if(on&&nivelvolumen>=1&&nivelvolumen<=7)
            this.nivelvolumen=nivelvolumen;
    }
    public void subirCanal(){
        if(on&&canal<120) canal++;
    }
    public void bajarCanal(){
        if(on&&canal>1) canal--;
    }
    public void subirNivelvolumen(){
        if(on&&nivelvolumen<7) nivelvolumen++;
    }
    public void bajarNivelvolumen(){
        if(on&&nivelvolumen>1) nivelvolumen--;
    }
    @Override
    public String toString(){
        return "TV { canal="+this.getCanal()+
                " ,volumen="+getNivelvolumen()+
                " ,encendido="+isOn()+" }";
    }
}
