package com.company.laba3;

import java.util.Scanner;

public class example14_03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Какое количество чисел должно быть в последовательности: ");
        int nums = scan.nextInt();
        int sum = 1;
        int first = 0;
        System.out.print(sum + " ");
        if (nums > 1) {

            for (int i = 1; i < nums; i++) {
                int total = sum + first;
                System.out.print(total + " ");
                first = sum;
                sum = total;
            }
        }
    }
}