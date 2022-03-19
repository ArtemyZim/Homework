package com.company.laba5;

import java.util.Scanner;
public class MainExample14_06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Задаем значение полям через конструктор с двумя аргументами");
        Example14_06 example14_06 = new Example14_06(5, 56);
        Example14_06.outputMaxMin();

        System.out.println("Задаем значения полям через конструктор с одним аргументом ");
        System.out.print("Введите целочисленное значение ");
        Example14_06 example14_06_01 = new Example14_06(scan.nextInt());
        Example14_06.outputMaxMin();

        System.out.println("Изменяем значения полей с помощью методов");
        System.out.print("Введите целочисленные значения для метода с двумя аргументами ");
        Example14_06.setMaxMin(scan.nextInt(), scan.nextInt());
        Example14_06.outputMaxMin();

        System.out.print("Введите целочисленное значение для метода с одним аргументом ");
        Example14_06.setMaxMin(scan.nextInt());
        Example14_06.outputMaxMin();

    }
}
