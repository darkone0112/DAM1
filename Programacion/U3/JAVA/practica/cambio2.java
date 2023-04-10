import java.util.*;
public class cambio2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
 
        // variable que contendra el valor a devolver
        double importe=0;
        do{
            try{
                System.out.println("Ingresa el valor del producto");
                double a = sc.nextDouble();
                System.out.println("Ingresa el valor pagado");
                double b = sc.nextDouble();
                importe= b - a;
            }catch(Exception e){
                System.out.println("Introduciste un dato erroneo.");
                System.out.println("");
                sc.nextLine();
            }
        }
        while(importe<=0);
 
        calcular(importe);
    }
 
    public static void calcular(double importe)
    {
        // Indicamos todas las monedas posibles
        double [] monedas={ 20, 10, 5, 2, 1, 0.5, 0.20, 0.10, 0.05, 0.02, 0.01};
 

        // Este array contendra las monedas a devolver
        double [] devolver={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
 
        // Recorremos todas las monedas
        for(int i=0;i<monedas.length;i++)
        {
            // Si el importe actual, es superior a la moneda
            if(importe>=monedas[i])
            {
                // obtenemos cantidad de monedas
                devolver[i]=Math.floor(importe/monedas[i]);
 
                // actualizamos el valor del importe que nos queda por didivir
                importe=importe-(devolver[i]*monedas[i]);
            }
        }
 
        // Bucle para mostrar el resultado
        for(int i=0;i<monedas.length;i++)
        {
            if(devolver[i]>0)
            {
                if(monedas[i]>2)
                {
                    // Indicamos que es un billete
                    System.out.println("Hay "+devolver[i]+" billetes de: "+monedas[i]+" Euros");
                }else{
                    // Indicamos que es una moneda
                    System.out.println("Hay "+devolver[i]+" monedas de: "+monedas[i]+" Euros");
                }
            }
        }
    }
 
}
