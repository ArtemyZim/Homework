package com.company.laba5;

import java.util.Scanner;
public class MainExample14_02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Example14_02 example14_02 = new Example14_02();
        System.out.print("Введите 1 символ: ");

        String text1 = scan.next();
        char symbol1 = text1.charAt(0);
        example14_02.setSymbol1(symbol1);

        System.out.print("Введите 2 символ: ");

        String text2 = scan.next();
        char symbol2 = text2.charAt(0);
        example14_02.setSymbol2(symbol2);

        example14_02.getSymbols();
    }
}
