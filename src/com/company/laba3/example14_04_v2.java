package com.company.laba3;
import java.util.Scanner;

public class example14_04_v2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();
        if (num1 == num2) System.out.println(num1);
        else if (num1 < num2){
            while (num1 <= num2) {
                System.out.print(num1 + " ");
                num1++;
            }
        }
        else if (num2 < num1){
            while (num2 <= num1) {
                System.out.print(num2 + " ");
                num2++;
            }
        }
    }
}
