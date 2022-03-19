package com.company.laba4;

public class example14_04 {
    public static void main(String[] args) {

        char triangle [][] = new char [8][8];
        System.out.println("Прямоугольный треугольник через массив с катетами 8 на 8:");
        for (int i = 0; i < triangle.length; i++){
            for(int k = 0; k < i; k++){
                triangle [i][k] = '*';
                System.out.print(triangle [i][k] + " ");
            }
            System.out.println();
        }
    }
}
