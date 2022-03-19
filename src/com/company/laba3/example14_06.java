package com.company.laba3;
import java.util.Scanner;
public class example14_06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int amount;
        do {
            System.out.print("Введите целочисленный размер массива: ");
            while(!scan.hasNextInt()){
                System.out.println("Это не целое число");
                System.out.print("Введите целочисленный размер массива: ");
                scan.next();
            }
            amount = scan.nextInt();
            if (amount <= 0) System.out.println("Такое значение недопустимо");
        } while (amount <= 0);

        int nums [] = new int [amount];
        int i, k;
        for (i = 0, k = 1; i < amount; i++, k++){
            if (k % 5 == 2){
                nums [i] = k;
                System.out.println("Значение " + k + " находится на [" + i + "] позиции массива");
            }
            else i--;
        }
    }
}
