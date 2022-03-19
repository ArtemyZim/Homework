package com.company.laba3;
import java.util.Scanner;
import java.util.Random;
public class example14_09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение массива: ");
        int amount = scan.nextInt();

        System.out.println("Размер массива равен " + amount);
        int nums [] = new int [amount];
        Random random = new Random();
        for (int i = 0; i < amount; i++){
            nums [i] = random.nextInt(200);
            System.out.println("Элемент массива [" + i + "] равен " + nums[i]);
        }
        int minimum = nums[0];
        for (int i = 1; i < amount; i++){
            if (minimum > nums[i]) minimum = nums[i];
        }
        for (int i = 0; i < amount; i++){
            if (minimum == nums[i])
                System.out.println("Минимальный элемент массива равен " + minimum + " и находится на " + i + " позиции");
        }
    }
}
