package com.company.laba3;

import java.util.Scanner;

public class example14_03_v2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Какое количество чисел должно быть в последовательности: ");
        int nums = scan.nextInt();
        int sum = 1;
        int first = 0;
        System.out.print(sum + " ");
        int counter = 1;
        if (nums > 1) {

            while (counter < nums){
                int total = sum + first;
                System.out.print(total + " ");
                first = sum;
                sum = total;
                counter++;
            }
        }
    }
}