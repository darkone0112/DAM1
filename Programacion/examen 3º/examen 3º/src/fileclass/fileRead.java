package fileclass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileRead {
    public static void main(String[]args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\D4Rk0n3\\Desktop\\DAM\\programacion\\examen 3º\\examen 3º\\src\\fileclass\\poem.txt");
            try {
                int data = reader.read();
                while (data !=-1) {
                    System.out.print((char)data);
                    data = reader.read();
                }
                reader.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
