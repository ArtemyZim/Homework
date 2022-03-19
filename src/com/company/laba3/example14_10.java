package com.company.laba3;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class example14_10 {
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
        System.out.println();
        Arrays.sort(nums);
        int targetArray [] = new int [amount];
        for (int i = --amount, k = 0; i >= 0 ; i--, k++){
            targetArray[k] = nums[i];
            System.out.println("Элемент массива " + targetArray[k] + " на [" + k + "] месте");
        }
        System.out.println("Произведена сортировка массива в порядке убывания");
    }
}
