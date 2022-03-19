package com.company.laba3;
import java.util.Scanner;

public class example14_05_v2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество цифр в сумме: ");
        int nums = scan.nextInt();
        int sum = 0;
        int counter = 0;
        int i = 0;
        System.out.print("Ваши числа: ");
        while (counter < nums){
            if (i % 5 == 2 || i % 3 == 1){
                System.out.print(i + " ");
                sum += i;
                counter++;
            }
            i++;
        }
        System.out.println("\nСумма данных чисел равна: " + sum);
    }
}
