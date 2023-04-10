/* package tryThrowYCosasVarias;

import java.util.Scanner;

public class Exeptions {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in)
        System.out.print("No pongas pedro: ");
        int n;
        try {
            n = throwExeptions();
        } catch (Exception e) {
            //TODO: handle exception
        }
        int n = input.nextInt();
    }
    public static void throwExceptions() throws Exceptions{
         Scanner input = new Scanner(System.in);
    }
}
 */
package tryThrowYCosasVarias;

import java.util.Scanner;

/**
 * Exeptions
 */
public class Exeptions {
    public static void main(String[]args) {
        String n[] = new String[1];
        getInt(n);
        System.out.print(n[0]);
    }
    public static void getInt(String x[]) {
        try (Scanner input = new Scanner(System.in)) {
            int error=1;
            do {
                try {
                    System.out.print("valor \n");
                    x[0] = input.nextLine();
                    error = 0;
                } catch (Exception e) {
                    System.out.print("error! \n");
                }
            } while (error == 1);
        }
    }
}