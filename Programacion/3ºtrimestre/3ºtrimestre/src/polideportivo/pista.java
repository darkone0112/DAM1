package polideportivo;

import java.util.Scanner;

public class pista {
    Scanner input = new Scanner(System.in);
    private boolean ocupada;
    private int horaInicio;
    private int horaFinal;
    private String nombre;
    private String nsocio;
    private String dia;

    public pista(boolean ocupada,int horaInicio,int horaFinal,String nombre, String nsocio,String dia) {
        this.setOcupada(ocupada);
        this.SetHoraInicio(horaInicio);
        this.SetHoraFinal(horaFinal);
        this.setNombre(nombre);
        this.setNsocio(nsocio);
        this.setDia(dia);
    }
    public pista(){
        /* default */
    }
    
    /* setters */
    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
    public void SetHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }
    public void SetHoraFinal(int horaFinal) {
        this.horaFinal = horaFinal;
    }
    public void setNombre(String nombre) {
        this.nombre= nombre;
    }
    public void setNsocio(String nsocio) {
        this.nsocio = nsocio;
    }
    public void setDia(String dia) {
        this.dia=dia;
    }

    /* getters */
    public boolean getOcupada() {
        return ocupada;
    }
    public int getHoraInicio() {
        return horaInicio;
    }
    public int getHoraFinal() {
        return horaFinal;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNsocio() {
        return nsocio;
    }
    public String getDia() {
        return dia;
    }
    public static void makeReserva(pista x[][]) {
        try (Scanner input = new Scanner(System.in)) {
            int error = 0;
            do {
                int dia[] = new int[1];
                int hora[] = new int[1];
                String nombre = "";
                String socio = "";
                error = 0;
                    System.out.print("Seleccione el dia que desea reservar: \n 1/-lunes\n2/-martes\n3/-miercoles\n4/-jueves\n5/-viernes\n6/-sabado\n7/-domingo\n");
                    polideportivoMain.getInt(dia);
                    System.out.print("\nSeleccione la hora que desea reservar\n 1/-18-19\n2/-19-20\n3/-20-21");
                    polideportivoMain.getInt(hora);
                if (x[hora[0]][dia[0]].getOcupada()==true) {
                    System.out.print("dia u hora ocupadas, seleccione horarios de reserva que esten libres \n");
                    error = 1;
                } else {
                    System.out.print("Nombre al que estara la reserva: ");
                    nombre = input.nextLine();
                    x[hora[0]][dia[0]].setNombre(nombre);
                    System.out.println();
                    System.out.print("Introduzca numero de socio: ");
                    socio = input.nextLine();
                    x[hora[0]][dia[0]].setNsocio(socio);
                    x[hora[0]][dia[0]].setOcupada(true);
                    System.out.println();
                }
            } while (error == 1);
        }
        }
    public static void cancelReserva(pista x[][]) {
        try (Scanner input = new Scanner(System.in)) {
            int encontrado = 0;
            int hora[] = new int[1];
            int dia[] = new int[1];
            String nombre = "";
            String socio = "";
            System.out.print("Introduzca su nombre: ");
            nombre = input.nextLine();
            System.out.println();
            System.out.print("Introduzca su numero de socio: ");
            socio = input.nextLine();
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x[i].length; j++) {
                    if ((nombre.equalsIgnoreCase(x[i][j].getNombre()) && (socio.equalsIgnoreCase(x[i][j].getNsocio())))) {
                        encontrado = 1;
                        hora[0] = i;
                        dia[0] = j;
                        break;
                    }
                }
            }
            if (encontrado == 1) {
                x[hora[0]][dia[0]].setOcupada(false);
                x[hora[0]][dia[0]].setNombre("");
                x[hora[0]][dia[0]].setNsocio("");
                System.out.print("Se ha cancelado su reserva del " + x[hora[0]][dia[0]].getDia() + " de " + x[hora[0]][dia[0]].getHoraInicio() + " a " + x[hora[0]][dia[0]].getHoraFinal());
            } else {
                System.out.print("Su nombre o numero de socio no coinciden con ninguna reserva \n");
            }
        }
    }
/*     public static void modReserva(pista x[][]) {
        Scanner input = new Scanner(System.in);
        String socio = "";
        int encontrado = 0;
        int hora = 0;
        int dia = 0;
        System.out.print("Introduzca su numero de socio: \n");
        socio = input.nextLine();
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (socio.equalsIgnoreCase(x[i][j].getNsocio())) {
                    hora = i;
                    dia = j;
                    encontrado = 1;
                }
            }
        }   
        if (encontrado == 1) {
            System.out.print("Se ha encontrado una reserva a nombre de : " + x[hora][dia].getNombre() + " el " + x[hora][dia].getDia() + " de " + x[hora][dia].horaInicio + " a " + x[hora][dia].getHoraFinal());
            System.out.print("Nuevo dia:");
            x[hora][dia].setDia(input.nextInt());
        } else {
            
        }
    } */
}

/*     public static void getString(String x[]) {
        try (Scanner input = new Scanner(System.in)) {
            x[0] = input.nextLine();
        }
    } */



