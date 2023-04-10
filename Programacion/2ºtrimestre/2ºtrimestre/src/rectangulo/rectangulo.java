package rectangulo;

public class rectangulo {
    int base = 0;
    int altura = 0;
    char signo;
    int guardar = 0;
    public void pintar() {
        for (int i = 0; i < base; i++) {
            System.out.print("*" + "\t");
        }
        System.out.println();
        for (int i = 0; i < altura - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < base - 1; j++) {
                System.out.print("\t");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < base; i++) {
            System.out.print("*" + "\t");
        }
    }
    public void pintarsigno() {
        for (int i = 0; i < base; i++) {
            System.out.print(signo + "\t");
        }
        System.out.println();
        for (int i = 0; i < altura - 2; i++) {
            System.out.print(signo);
            for (int j = 0; j < base - 1; j++) {
                System.out.print("\t");
            }
            System.out.print(signo);
            System.out.println();
        }
        for (int i = 0; i < base; i++) {
            System.out.print(signo + "\t");
        }
    }
}
