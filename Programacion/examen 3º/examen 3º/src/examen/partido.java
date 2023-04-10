package examen;

public class partido {
    private String equipoL;
    private String equipoV;
    private int golesL;
    private int golesV;
    public partido(){
        /* default */
    }
    public partido(String equipoL,String equipoV,int golesL,int golesV){

    }
    /* getters */
    public String getEquipoL() {
        return equipoL;
    }
    public String getEquipoV() {
        return equipoV;
    }
    public int getGolesL() {
        return golesL;
    }
    public int getGolesV() {
        return golesV;
    }
    /* setters */
    public void setEquipoL(String equipoL) {
        this.equipoL = equipoL;
    }
    public void setEquipoV(String equipoV) {
        this.equipoV = equipoV;
    }
    public void setGolesL(int golesL) {
        this.golesL = golesL;
    }
    public void setGolesV(int golesV) {
        this.golesV = golesV;
    }
}
