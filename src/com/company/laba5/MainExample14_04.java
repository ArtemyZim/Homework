package com.company.laba5;

import java.util.Scanner;
public class MainExample14_04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Какой конструктор вы хотите использовать?");
        System.out.println("1. С одним аргументом типа double");
        System.out.println("2. С двумя аргументами типа char и int");
        System.out.print("Введите цифру 1 или 2: ");
        int answer = scan.nextInt();
        if (answer == 1){
            System.out.print("Введите значение типа double ");
            Example14_04 example14_04 = new Example14_04(scan.nextDouble());
            example14_04.outputSymbolAndNum();
        }
        else if (answer == 2){
            System.out.print("Введите значение типа int ");
            int num = scan.nextInt();
            System.out.print("Введите значение типа char ");
            String text = scan.next();
            char symbol = text.charAt(0);
            Example14_04 example14_04 = new Example14_04(num, symbol);
            example14_04.outputSymbolAndNum();
        }
        else System.out.println("Вы ввели некорректное значение");

    }
}
