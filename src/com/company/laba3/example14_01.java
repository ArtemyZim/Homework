package com.company.laba3;

import java.util.Scanner;

public class example14_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.print("Введите значение от 1 до 7, чтобы определить день недели: ");
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    System.out.println("День недели - Понедельник");
                    flag = false;
                    break;
                case 2:
                    System.out.println("День недели - Вторник");
                    flag = false;
                    break;
                case 3:
                    System.out.println("День недели - Среда");
                    flag = false;
                    break;
                case 4:
                    System.out.println("День недели - Четверг");
                    flag = false;
                    break;
                case 5:
                    System.out.println("День недели - Пятница");
                    flag = false;
                    break;
                case 6:
                    System.out.println("День недели - Суббота");
                    flag = false;
                    break;
                case 7:
                    System.out.println("День недели - Воскресенье");
                    flag = false;
                    break;
                default:
                    System.out.println("Вы ввели некорректное значение");
            }
        } while (flag);
    }

}
