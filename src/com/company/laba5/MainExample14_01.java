package com.company.laba5;

import java.util.Scanner;
public class MainExample14_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите символ: ");
        Example14_01 example14_01 = new Example14_01();
        String text = scan.next();
        char symb = text.charAt(0);
        example14_01.setSymbol(symb);
        example14_01.outputSymbolAndCode();
    }
}
