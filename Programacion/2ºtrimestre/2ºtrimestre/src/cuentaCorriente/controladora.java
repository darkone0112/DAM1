package cuentaCorriente;

public class controladora {
    public static void main(String[] args) {
        cuentaCorriente cuenta1 = new cuentaCorriente();
        cuenta1.dni = "y6066751d";
        cuenta1.nombre = "Javier";
        cuenta1.apellidos = "Menendez Abreu";
        cuenta1.direccion = "Antonio Lopez 246";
        cuenta1.numCuenta = 12345678;
        cuenta1.saldo = 2300.75;
        cuentaCorriente cuenta2 = new cuentaCorriente();
        cuenta2.dni = "y1234567r";
        cuenta2.nombre = "pepe";
        cuenta2 .apellidos = "garcia";
        cuenta2.direccion = "Antonio Lopez 247";
        cuenta2.numCuenta = 87654321;
        cuenta2.saldo = 4300.75;
        cuenta1.menu();
        /* cuenta1.ingresar();
        System.out.print("El saldo restante es de: " + cuenta1.saldo);
 */
    }    
}
