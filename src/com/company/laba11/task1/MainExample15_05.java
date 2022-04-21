package com.company.laba11.task1;

import java.io.*;
import java.util.Scanner;

public class MainExample15_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя файла => " );
        String fname = scan.nextLine();

        try {
            File f1 = new File(fname);
            f1.createNewFile();
            System.out.println("Полный путь файла: " + f1.getAbsolutePath());
            System.out.print("Введите количество строк для записи в файл => ");
            int n = scan.nextInt();

            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            scan.nextLine();
            for (int i = 0; i < n; i++){
                System.out.println("Введите строку для записи в файл => ");
                String s = scan.nextLine();
                dOut.writeUTF(s + "\n");
            }
            dOut.flush();
            dOut.close();

            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
            while (true) System.out.println(dIn.readUTF());
        } catch (IOException e) {System.out.println(""+e);}
    }
}
