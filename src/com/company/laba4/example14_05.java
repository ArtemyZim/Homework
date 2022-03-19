package com.company.laba4;

import java.util.Random;
public class example14_05 {
    public static void main(String[] args) {

        int numbers [][] = new int [5][6];
        Random randomizer = new Random();
        System.out.println("Исходный массив");
        for (int i = 0; i < numbers.length; i++){
            for (int k = 0; k < 6; k++){
                numbers [i][k] = randomizer.nextInt(100);
                System.out.print(numbers [i][k] + " ");
            }
            System.out.println();
        }
        System.out.println("Меняем местами столбцы и строки");
        for (int k = 0; k<6; k++){
            for (int i = 0; i< numbers.length; i++) System.out.print(numbers [i][k] + " ");
            System.out.println();
        }
    }
}
