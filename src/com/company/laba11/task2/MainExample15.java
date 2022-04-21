package com.company.laba11.task2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MainExample15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        PrintWriter out;
        BufferedReader br;

        try {
            File f1 = new File("textIn.txt");
            File f2 = new File("textOut.txt");
            f1.createNewFile();
            f2.createNewFile();
            if (f1.exists()) System.out.println("Файл создан, путь: " + f1.getAbsolutePath());
            if (f2.exists()) System.out.println("Файл создан, путь: " + f2.getAbsolutePath());

            System.out.println("Введите поочередно 2 строки");
            out = new PrintWriter(f1.getAbsolutePath(), StandardCharsets.UTF_8);
            String s;
            for (int i = 0; i < 2; i++){
                s = scan.nextLine();
                out.println(s);
            }

            System.out.println("Введите поочередно 5 чисел типа double");
            for (int i = 0; i < 5; i++) {
                out.println(scan.nextDouble());
            }
            out.flush();
            out.close();

            br = new BufferedReader(
                                    new InputStreamReader(
                                        new FileInputStream(f1.getAbsolutePath()), StandardCharsets.UTF_8));
            out = new PrintWriter(f2.getAbsolutePath(), StandardCharsets.UTF_8);

            for (int i = 0; i < 2; i++){
                s = br.readLine();
                if (i == 1){
                    out.println(s);
                }
            }
            for (int i = 0; i < 5; i++){
                double n = Double.parseDouble(br.readLine());
                if (n >= 0) out.println(n);
            }
            br.close();
            out.flush();
            out.close();

        } catch (IOException e){
            System.out.println("Ошибка " + e);
        }
    }
}
