package com.company.laba5;

import java.util.Scanner;
public class MainExample14_05 {

    public static void main(String[] args) {

        System.out.print("Введите целочисленное значение значение поля ");
        Scanner scan = new Scanner(System.in);
        Example14_05 example14_05 = new Example14_05(scan.nextInt());
        example14_05.outputNum();
    }
}
