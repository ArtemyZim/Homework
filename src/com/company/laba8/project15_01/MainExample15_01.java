package com.company.laba8.project15_01;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MainExample15_01 {
    public static void main(String[] args) {
        int choice = 0;
        int x = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Для демонстрации примеров введите значение 1-5");
        System.out.println("Значения соответствуют примерам");
        System.out.print("Ваш выбор: ");

        try {
            choice = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели неверное значение");
        }

        switch (choice) {
            case 1 -> {
                System.out.print("Введите необходимое значение для x, чтобы вывести последовательность значений\n" +
                        "для числового ряда: ");
                try {
                    x = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Вы ввели неверное значение");
                    break;
                }
                ExampleRec1.m(x);
            }
            case 2 -> {
                System.out.print("Введите необходимое значение для x, чтобы вывести последовательность значений\n" +
                        "для числового ряда в обратном порядке: ");
                try {
                    x = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Вы ввели неверное значение");
                    break;
                }
                ExampleRec2.m(x);
            }
            case 3 -> {
                System.out.print("Введите необходимое значение для x, чтобы вывести последовательность значений\n" +
                        "для числового ряда. Вывод параметра перед вхождением в рекурсивный вызов и после него: ");
                try {
                    x = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Вы ввели неверое значение");
                    break;
                }
                ExampleRec3.m(x);
            }
            case 4 -> {
                System.out.print("Вычисление факториала числа с использованием рекурсии\n" +
                        "Введите значение для рекурсии: ");
                try {
                    x = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Вы ввели неверное значение");
                    break;
                }
                System.out.println(ExampleFact.fact(x));
            }
            case 5 -> {
                System.out.print("Вывести номер числа в последовательности Фибоначчи. Введите необходимое число: ");
                try {
                    x = scan.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Вы ввели неверное значение");
                    break;
                }
                System.out.println("Число Фибоначчи: " + ExampleFib.fib(x));
            }
            default -> System.out.println("Вы ввели неправильный номер");
        }
    }
}
