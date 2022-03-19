package com.company.laba5;

import java.util.Scanner;
public class MainExample14_03 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Какой из конструкторов вы хотите использовать? ");
        System.out.print("Введите значение от 0 до 2: ");
        int answer = scan.nextInt();
        if (answer == 2){
            System.out.print("Введите значения полей через пробел ");
            Example14_03 example14_03 = new Example14_03(scan.nextInt(), scan.nextInt());
            example14_03.output();
        }
        else if (answer == 1){
            System.out.print("Введите одно значение ");
            Example14_03 example14_03 = new Example14_03(scan.nextInt());
            example14_03.output();
        }
        else if (answer == 0) {
            Example14_03 example14_03 = new Example14_03();
            example14_03.output();
        }
        else System.out.println("Вы ввели неправильное значение конструктора");

    }
}
