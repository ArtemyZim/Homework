package com.company.laba8.project15_03;

import java.util.Scanner;
public class MainExample15_03 {
    public static void main(String[] args) {
        int m = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите величину целочисленного массива: ");
        do{
            try {
                m = scan.nextInt();
            } catch (Exception e) {
                System.out.println("Вы ввели неверное значение");
                System.out.print("Попробуйте заново: ");
                scan.next();
            }
            if (m <= 0) System.out.print("Вы ввели отрицательное значение или значение 0: ");
        } while (m <= 0);

        System.out.println("Введите ваш массив целых чисел: ");
        System.out.println("Если вы введете неверное значение ввод массива остановится ");
        ExampleRec.recInput(m);
        System.out.println("Выводим массив в терминал: ");
        System.out.println(ExampleRec.recOutput());

    }
}
