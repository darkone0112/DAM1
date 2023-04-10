import java.util.Scanner;
 
public class fechavalida {
 
    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        int anio = 0;
        while (anio == 0) {
            System.out.println("Introduce un año");
            anio = input.nextInt();
        }
        int mes = 0;
        while (mes == 0 || mes > 12) {
            System.out.println("Introduce un mes");
            mes = input.nextInt();
        }
        int dia = 0;
        while (dia == 0 || dia > 31) {
            System.out.println("Introduce un dia");
            dia = input.nextInt();
        }
        if (mes == 12 && dia == 31) {
            mes = 1;
            dia = 1;
            anio = anio + 1;
        } else {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia == 31 && mes != 12)  {
                    mes = mes + 1;
                    dia = 1;
                }else{
                    if (dia < 31) {
                        dia = dia + 1;
                    }
                }
            }else{
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    while (dia == 0 || dia > 30) {
                        System.out.println("Introduce un dia");
                        dia = input.nextInt();
                    }
                    if (dia == 30) {
                        mes = mes + 1;
                        dia = 1;
                    }else{
                        if (dia < 30) {
                            dia = dia + 1; 
                        }
                    }
                }
            }
            if (mes == 2) {
                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)) {
                    while (dia == 0 || dia > 29) {
                        System.out.println("Introduce un dia");
                        dia = input.nextInt();
                    }
                    if (mes == 2) {
                        if (dia == 29) {
                            dia = 1;
                            mes = mes + 1;
                        } else {
                            dia = dia + 1;
                        }
                    }
                }else{
                    while (dia == 0 || dia > 28) {
                        System.out.println("Introduce un dia");
                        dia = input.nextInt();
                }
                if (mes == 2) {
                    if (dia == 28) {
                        dia = 1;
                        mes = mes + 1;
                    } else {
                        dia = dia + 1;
                    }
                }
            }
            }
        }
    System.out.println("La fecha valida siguiente a la introducida es:");
    System.out.println(dia + "/" + mes + "/" + anio );
    }
}