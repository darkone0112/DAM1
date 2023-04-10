package rectangulo;

import java.util.Scanner;

public class controladora {
    public static void main(String[] Args) {
        try (var input = new Scanner(System.in)) {
            rectangulo mirectangulo = new rectangulo();
            System.out.print("Introduzca la base del rectangulo: ");
            mirectangulo.base = input.nextInt();
            System.out.println();
            System.out.print("Introduzca la altura del rectangulo");
            mirectangulo.altura = input.nextInt();
            mirectangulo.pintar();
            System.out.println();
            System.out.print("Introduzca un signo para dibujar el rectangulo");
            mirectangulo.signo = input.next().charAt(0);
            mirectangulo.pintarsigno();
            System.out.println();
            System.out.println("Este es el rectangulo con la altura y la base intercambiadas");
            mirectangulo.guardar = mirectangulo.base;
            mirectangulo.base = mirectangulo.altura;
            mirectangulo.altura = mirectangulo.guardar;
            mirectangulo.pintarsigno();
        }
    }
}
