package com.company.laba4;

public class example14_03 {
    public static void main(String[] args) {
         int rectangle [][] = new int [5][10];
        System.out.println("Выводим прямоугольник со сторонами 5 на 10 через массив");
        for (int i = 0; i< rectangle.length; i++){
            for (int k = 0; k<10 ; k++){
                rectangle[i][k] = 2;
                System.out.print(rectangle[i][k] + " ");
            }
            System.out.println();
        }
    }
}
