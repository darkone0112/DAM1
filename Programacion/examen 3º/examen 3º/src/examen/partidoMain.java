package examen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

public class partidoMain {
    public static Scanner input = new Scanner(System.in);
    public static ArrayList <partido> partidos = new ArrayList<>(1);
    public static void main(String []args) {
        readPartidos();
        System.out.print("\n_____________________\n");
        /* display(partidos); */
        System.out.print("\n_____________________\n");
        seekPartido();
    }
    
/*     public static void readPartidos() {
        try {
            FileReader reader = new FileReader("C:\\Users\\D4Rk0n3\\Desktop\\DAM\\programacion\\examen 3º\\examen 3º\\src\\examen\\partidos.txt"); pc
            FileReader reader = new FileReader("C:\\Users\\D4Rk0n3\\Documents\\Prog\\examen 3º\\examen 3º\\src\\examen\\partidos.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String frase = "";
            frase=bufferedReader.readLine();
            int i = 0;
            while (frase!=null) {
                System.out.println(frase);
                String [] part = frase.split("::");
                    partidos.add(new partido());
                    partidos.get(i).setEquipoL(part[0]);
                    partidos.get(i).setEquipoV(part[1]);
                    partidos.get(i).setGolesL(Character.getNumericValue(part[2].charAt(0)));
                    partidos.get(i).setGolesV(Character.getNumericValue(part[3].charAt(0)));
                i++;
                frase=bufferedReader.readLine();
            }
            reader.close();
            bufferedReader.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    } */
    public static void readPartidos() {
        try {
            FileReader reader = new FileReader("C:\\Users\\D4Rk0n3\\Desktop\\DAM\\programacion\\examen 3º\\examen 3º\\src\\examen\\partidos.txt");
            BufferedReader bubba = new BufferedReader(reader);
            String frase ="";
            frase = bubba.readLine();
            int i = 0;
            while (frase!=null) {
                System.out.println(frase);
                String [] papi = frase.split("::");
                partidos.add(new partido());
                partidos.get(i).setEquipoL(papi[0]);
                partidos.get(i).setEquipoV(papi[1]);
                partidos.get(i).setGolesL(Character.getNumericValue(papi[2].charAt(0)));
                partidos.get(i).setGolesV(Character.getNumericValue(papi[3].charAt(0)));
                i++;
                frase = bubba.readLine();
            } 
            reader.close();
            bubba.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
/*     public static void display(ArrayList <partido> x) {
        for (int i = 0; i < x.size(); i++) {
            System.out.println("\nPartido Nº" +(i+1));
            System.out.println(partidos.get(i).getEquipoL());
            System.out.println(partidos.get(i).getEquipoV());
            System.out.println(partidos.get(i).getGolesL());
            System.out.println(partidos.get(i).getGolesV());
        }
    } */
    public static void display(ArrayList <partido> x) {
        for (int i = 0; i < x.size(); i++) {
            System.out.print("Partido Nº" + (i+1) + "\n");
            System.out.println(partidos.get(i).getEquipoL());
            System.out.println(partidos.get(i).getEquipoV());
            System.out.println(partidos.get(i).getGolesL());
            System.out.println(partidos.get(i).getGolesV());
        }
    }
    /* public static void seekPartido() {
        try {
            RandomAccessFile accespartidos = new RandomAccessFile("C:\\Users\\D4Rk0n3\\Desktop\\DAM\\programacion\\examen 3º\\examen 3º\\src\\examen\\almacen.dat", "rw");
            RandomAccessFile accespartidos = new RandomAccessFile("C:\\Users\\D4Rk0n3\\Documents\\Prog\\examen 3º\\examen 3º\\src\\examen\\almacen.dat", "rw");
            try {
            accespartidos.seek(accespartidos.length());
            for (int i = 0; i < partidos.size(); i++) {
                accespartidos.writeUTF(partidos.get(i).getEquipoL());
                accespartidos.writeUTF(partidos.get(i).getEquipoV());
                accespartidos.writeInt(partidos.get(i).getGolesL());
                accespartidos.writeInt(partidos.get(i).getGolesV());
            }
            accespartidos.seek(0);
            while (accespartidos.getFilePointer()<accespartidos.length()) {
                System.out.print(accespartidos.readUTF()+" ");
                System.out.print(accespartidos.readUTF()+" ");
                System.out.print(accespartidos.readInt()+" ");
                System.out.print(accespartidos.readInt()+" \n");
            }
            accespartidos.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    } */
    public static void seekPartido() {
        try {
            RandomAccessFile accespartidos = new RandomAccessFile("C:\\Users\\D4Rk0n3\\Desktop\\DAM\\programacion\\examen 3º\\examen 3º\\src\\examen\\almacen.dat", "rw");
            try {
                accespartidos.seek(accespartidos.length());
                for (int i = 0; i < partidos.size(); i++) {
                    accespartidos.writeUTF(partidos.get(i).getEquipoL());
                    accespartidos.writeUTF(partidos.get(i).getEquipoV());
                    accespartidos.writeInt(partidos.get(i).getGolesL());
                    accespartidos.writeInt(partidos.get(i).getGolesV());
                }
                accespartidos.seek(0);
                while (accespartidos.getFilePointer() < accespartidos.length()) {
                    System.out.print("\n"+accespartidos.readUTF() + "++");
                    System.out.print(accespartidos.readUTF() + "++");
                    System.out.print(accespartidos.readInt() + "++");
                    System.out.print(accespartidos.readInt());
                }
                accespartidos.close();
            } catch (Exception e) {
                //TODO: handle exception
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
