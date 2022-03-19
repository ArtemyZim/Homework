package com.company.laba3;
import java.util.Scanner;
public class example14_05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество цифр в сумме: ");
        int nums = scan.nextInt();
        int sum = 0;
        int counter = 0;
        System.out.print("Ваши числа: ");
        for (int i = 0; ;i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.print(i + " ");
                sum += i;
                counter++;
            }
            else continue;
            if (counter == nums) break;
        }
        System.out.println("\nСумма данных чисел равна: " + sum);
    }
}
