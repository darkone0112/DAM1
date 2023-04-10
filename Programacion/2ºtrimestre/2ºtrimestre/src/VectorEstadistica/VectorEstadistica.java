package VectorEstadistica;

import java.util.Random;
import java.util.Scanner;

public class VectorEstadistica {

    public void cargarmanual(int x[]) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.print("Introduzca valor de la posicion "  + i + ": ");
            x[i] = input.nextInt();
        }
        input.close();
    }
    
    public void cargar(int x[]) {
        Random rand = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = rand.nextInt(100-0)+0;
        }
    }
    public void display(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "\s");
        }
    }
    public void maximo(int x[]) {
        int maxnum = 0;
        maxnum = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > maxnum) {
                maxnum = x[i];
            }
        }
        System.out.print("El numero mayor del array es " + maxnum);
    }
    public void minimo(int x[]) {
        int minum = 0;
        minum = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < minum) {
                minum = x[i];
            }
        }
        System.out.print("El menor numero del array es: " + minum);
    }
    public int mediana(int x[]) {
        int mediana;
        int mitad = x.length / 2;
        if (x.length % 2 !=0) {
            mediana = ((x[mitad - 1] + x[mitad])/2);  
        } else {
            mediana = x[mitad];
        }
        return mediana;
    }
    public float media(int x[]) {
        float sum = x[0];
        float media = 0;
        for (int i = 1; i < x.length; i++) {
            sum += x[i];
        }
        /* System.out.println(sum); */
        media = sum / x.length;
        return media;
    }
    public void cls() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
}
