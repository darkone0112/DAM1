import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class flujoBytes {
    public static void main(String[]args) throws IOException {
        FileInputStream imagen = null;
        try {
            imagen = new FileInputStream("C:\\Users\\D4Rk0n3\\Desktop\\maxresdefault.jpg");
            int dato, cont=0;
            dato = imagen.read();
            while (dato!=-1) {
                System.out.print("\t" + dato + "\n");
                cont++;
                dato = imagen.read();
            }
            System.out.print("\n");
            System.out.print("\n He leido " + cont + " Bytes ");
        } catch (FileNotFoundException e) {
            System.out.print("\nWEBIWABO\n");
        }
        finally{
            imagen.close();
        }
        
    }
}
