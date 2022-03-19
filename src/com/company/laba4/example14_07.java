package com.company.laba4;

public class example14_07 {
    public static void main(String[] args) {

        int line = 5;
        int column = 8;

        int[][] array = new int[line][column];
        int num = 1;
        System.out.println("Заполняем двумерный массив змейкой 5 строк, 8 колонок");

        for (int i = 0; i < line; i++){
            if (i % 2 == 0){
                for (int k = 0; k < column; k++, num++){
                    array[i][k] = num;
                }
            }
            else {
                for (int k = column-1; k >= 0; k--, num++){
                    array[i][k] = num;
                }
            }
        }

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("\t" + array[i][j]);
            }
            System.out.println();
        }
    }
}

