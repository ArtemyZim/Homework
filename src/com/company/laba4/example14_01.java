package com.company.laba4;

public class example14_01 {
    public static void main(String[] args) {

        System.out.println("Прямоугольник с шириной - 23 колонки, высотой - 11 строк");
        for (int i = 0; i<11; i++){
            for (int j = 0; j<23 ; j++){
                System.out.print("+");
            }
            System.out.println();
        }
    }
}
