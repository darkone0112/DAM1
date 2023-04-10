package fileclass;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {
    public static void main(String[]args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\D4Rk0n3\\Desktop\\DAM\\programacion\\examen 3º\\examen 3º\\src\\fileclass\\poem.txt");
            writer.write("Roses are red");
            writer.append("\n\nWtfuq bro");
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
