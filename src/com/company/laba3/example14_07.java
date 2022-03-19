package com.company.laba3;

public class example14_07 {
    public static void main(String[] args) {

        int num = 10;
        char letters [] = new char[num];
        char letter = 'a';
        for (int i = 0; i < num; i++){
            letters [i] = letter;
            System.out.print(letters [i] + " ");
            letter += 2;
        }
        System.out.println();
        for (int i = 9; i>=0 ; i--) {
            System.out.print(letters [i] + " ");
        }
    }
}
