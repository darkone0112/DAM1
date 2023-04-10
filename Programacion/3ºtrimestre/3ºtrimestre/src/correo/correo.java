package correo;

public class correo {
    private String origen;
    private String destino;
    private String asunto;
    private String cuerpo;
    private String fecha;
    private String horaLlegada;
    
/*     public void correo(String origen,String destino,String asunto,String cuerpo,String fecha,String horaLlegada) {
        this.setOrigen(origen);
        this.setAsunto(asunto);
        this.setCuerpo(cuerpo);
        this.setDestino(destino);
        this.setFecha(fecha);
        this.setHoraLlegada(horaLlegada);
    } */

    public correo() {
        /* default */
    }

    /* setters */ 
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
    /* getters */
    public String getOrigen() {
        return origen;
    }
    public String getAsunto() {
        return asunto;
    }
    public String getCuerpo() {
        return cuerpo;
    }
    public String getDestino() {
        return destino;
    }
    public String getFecha() {
        return fecha;
    }
    public String getHoraLlegada() {
        return horaLlegada;
    }

}
