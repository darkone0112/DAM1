import java.util.Scanner;
public class arrays1 {
  public static void main(String [] Args) {
      Scanner input = new Scanner(System.in);
      int pos = 0;
      System.out.println("tamaño del vector");
      int [] numeros = new int[input.nextInt()];
/*       numeros [0] = 1;
      numeros [1] = 2;
      numeros [2] = 3;
      numeros [3] = 4;
      numeros [4] = 5;
      numeros [5] = 6;
      numeros [6] = 7;
      numeros [7] = 8;
      numeros [8] = 9;
      numeros [9] = 10; */
/*       System.out.println(numeros[1]); */
    for (int i = 0; i < numeros.length; i++) {
        System.out.println("introduzca valor para la posicion" + pos);
        numeros[pos] = input.nextInt();
        pos=pos+1;
    }
/*     for (int i = 0; i < numeros.length; i++) {
      System.out.println("Esta es la posicion" + i);
      System.out.println(numeros[i]);
    } */
    System.out.println(numeros.length);
    input.close();
  }  
}
