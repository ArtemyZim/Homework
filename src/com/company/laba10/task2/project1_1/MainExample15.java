package com.company.laba10.task2.project1_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExample15 {
    public static void main(String[] args) {

        int positive_sum = 0;
        int positive_length = 0;
        int mid_num = 0;

        Scanner scan = new Scanner(System.in);
        int[] nums = new int [10];
        try {
            for (int i = 0; i < nums.length; i++) nums[i] = scan.nextInt();

            for (int x : nums) {
                if (x > 0) {
                    positive_sum += x;
                    positive_length++;
                }
            }

            mid_num = positive_sum / positive_length;
        } catch (InputMismatchException e){
            System.out.println("Вы ввели строку вместо числа или введён неверный числовой тип данных");
        } catch (ArithmeticException e){
            System.out.println("Отсутствуют положительные элементы в массиве");
        }
        System.out.println("Среднее значение положительных чисел в массиве равно: " + mid_num);
    }
}
