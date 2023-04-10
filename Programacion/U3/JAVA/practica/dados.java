import java.util.Scanner;
public class dados {
    public static void main(String [] Args) {
        int dado;
        System.out.println("Introduzca la cara que ha salido");
        Scanner input = new Scanner(System.in);
        dado = input.nextInt();
        if (dado > 6 || dado <= 0){
            while (dado > 6 || dado <= 0) {
                System.out.println("Valor incorrecto introduzcalo nuevamente:");
                dado = input.nextInt();
            }
        }
        switch (dado) {
            case 1: System.out.println("La cara contraria es seis");
            break;
            case 2: System.out.println("La cara contraria es cinco");
            break;
            case 3: System.out.println("La cara contraria es cuatro");
            break;
            case 4: System.out.println("La cara contraria es tres");
            break;
            case 5: System.out.println("La cara contraria es dos");
            break;
            case 6: System.out.println("La cara contraria es uno");
            break;
        }
    }
}
