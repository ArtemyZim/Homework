package com.company.laba3;

public class example14_08 {
    public static void main(String[] args) {

        char letters [] = new char [10];
        char letter = 'A';
        for (int i = 0; i < 10; i++){
            if (letter != 'A' && letter != 'E' && letter != 'I'){
                letters [i] = letter;
                System.out.print(letters [i] + " ");
                letter++;
            }
            else letter++;
        }
    }
}
