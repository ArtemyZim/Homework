package com.company.laba3;
import java.util.Scanner;
public class example14_04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();
        if (num1 < num2){
            for (int i = num1; i <= num2; i++) System.out.print(i + " ");
        }
        else if (num2 < num1){
            for (int i = num2; i <= num1; i++) System.out.print(i + " ");
        }
        else {
            System.out.println(num1);
        }
    }
}
