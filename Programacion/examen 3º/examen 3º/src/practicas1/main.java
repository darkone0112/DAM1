package practicas1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[]args) {
        int c = 0;
        while (true) {
            System.out.println("\n1/Escribir");
            System.out.println("2/Leer");
            c = input.nextInt();
            input.nextLine();
            switch (c) {
                case 1:
                    writeSome();
                    break;
                case 2:
                    readSome();
                    break;
                default:
                    break;
            }
        }
    }


    public static void writeSome() {
        try (FileWriter writer = new FileWriter("C:/Users/D4Rk0n3/Desktop/DAM/programacion/examen 3º/examen 3º/src/practicas1/prueba.txt")) {
            String inputData = " ";
            String temp=null;
            do {
                temp = input.nextLine();
                inputData = temp.concat(" ");
                
                if (temp.equalsIgnoreCase("Stop")) {
                    
                } else {
                    writer.write(inputData);
                }
                
            } while (!("Stop".equalsIgnoreCase(temp)));
        writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void readSome() {
        try {
            FileReader reader = new FileReader("C:/Users/D4Rk0n3/Desktop/DAM/programacion/examen 3º/examen 3º/src/practicas1/prueba.txt");
            try {
                int readData = reader.read();
                while (readData != -1) {
                    System.out.print((char)readData);
                    readData = reader.read();
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
