package com.company.laba4;

import java.util.Random;
public class example14_06 {
    public static void main(String[] args) {

        int[][] numbers = new int[5][5];
        Random randomizer = new Random();
        System.out.println("Инициализируем массив рандомными числами");
        for (int i = 0; i< numbers.length; i++){
            for (int k = 0; k< numbers.length; k++){
                numbers [i][k] = randomizer.nextInt(50);
                System.out.print(numbers [i][k] + " ");
            }
            System.out.println();
        }
        int a = randomizer.nextInt(4);
        int b = randomizer.nextInt(4);
        int[][] numbers1 = new int[4][4];
        System.out.println("Инициализируем массив с удаленным столбцом [" + b + "] и строчкой [" + a + "]");
        for (int i = 0, j = 0; i < numbers1.length; i++,j++){
            if (j == a) {
                i--;
                continue;
            }
            for (int k = 0, l = 0; k < numbers1.length; k++, l++){
                if (l == b) {
                    k--;
                }
                else {
                    numbers1[i][k] = numbers[j][l];
                    System.out.print(numbers1[i][k] + " ");
                }
            }
            System.out.println();
        }
    }
}
