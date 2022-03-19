package com.company.laba8.project15_02;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MainExample15_02 {
    public static void main(String[] args) throws InputMismatchException {
        String choice;
        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("Какое число вы желаете преобразовать?");
            System.out.print("Введите число: ");
            int num = scan.nextInt();

            System.out.printf("Переведенное число %d в двоичное: " + ExampleBin.binary(num), num);
            System.out.println();
            do{
                System.out.print("Желаете преобразовать еще одно число? [y/n] ");
                choice = scan.next();
            } while (!choice.equals("y") && !choice.equals("n"));


        } while (!choice.equals("n"));



    }
}
