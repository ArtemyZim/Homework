package com.company.laba12.task1;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class MainExample15_06 {
    public static void main(String[] args) {

        try {
            File folder = new File("C:\\My");
            if (!folder.exists()) folder.mkdir();

            File f1 = new File("C:\\My\\num1Mart.txt");
            f1.createNewFile();

            Scanner sc = new Scanner(System.in);

            System.out.print("Сколько чисел надо записать в файл? \n => ");
            int count = sc.nextInt();

            RandomAccessFile rf = new RandomAccessFile(f1, "rw");
            rf.seek(0);
            rf.setLength(count * 8);
            System.out.println("Исходный размер файла в байтах =" + rf.length()
                    + ", указатель стоит на " + rf.getFilePointer() + "-м байте");

            System.out.println("Введите числа:");
            for (int i = 0; i < count; i++) {
                rf.writeLong(sc.nextLong());
            }
            System.out.println("Новый размер файла в байтах =" + rf.length()
                    + ", указатель стоит на " + rf.getFilePointer() + "-м байте");
            System.out.println("Количество байт на 1 число = " + rf.length() / count);
            rf.close();

            rf = new RandomAccessFile(f1, "r");

            System.out.println("\n Числа в файле:");
            for (int i = 0; i < count; i++){
                System.out.println("Число" + i + ": " + rf.readLong());
            }
            System.out.println("Числа в обратном порядке:");
            for (int i = count - 1; i >= 0; i--){
                rf.seek(i*8);
                System.out.println("Число" + i + ": " + rf.readLong());
            }

            rf.seek(rf.length() - 8);
            System.out.println(" Количество чисел в файле= " + rf.length()/8
                    + ", последнее число= " + rf.readLong());

            System.out.print("\nВведите число, которое нужно найти в файле => ");
            long x = sc.nextLong();
            int kol = 0;
            for (int i = 0; i < count; i++){
                rf.seek(i * 8);
                long number = rf.readLong();
                if (number == x){
                    kol++;
                    System.out.print("номер " + i+ ", ");
                }
            }
            System.out.println(" количество искомых чисел = " + kol);
            rf.close();

            rf = new RandomAccessFile(f1, "rw");

            for (int k = 0; k < count; k++) {
                for (int i = 0; i < count - k - 1; i++) {
                    rf.seek(i * 8);
                    long number1 = rf.readLong();
                    long number2 = rf.readLong();

                    if (number1 > number2){
                        rf.seek(i*8);
                        rf.writeLong(number2);
                        rf.writeLong(number1);
                    }
                }
            }

            System.out.println("\n Числа, отсортированные в файле:");
            for (int i = 0; i < count; i++){
                rf.seek(i * 8);
                System.out.print(" " + rf.readLong());
            }

            rf.close();
        } catch (IOException e) {
            System.out.println("Ошибка!");
        }
    }
}
