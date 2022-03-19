package com.company.laba4;

public class example14_02 {
    public static void main(String[] args) {

        System.out.println("Прямоугольный треугольник с размерами 10 на 10:");
        for (int i = 0; i < 11; i++) {
            for (int k = 0; k < i; k++) System.out.print("* ");
            System.out.println();
        }
    }
}

