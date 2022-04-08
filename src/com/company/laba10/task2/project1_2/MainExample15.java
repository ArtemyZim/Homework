package com.company.laba10.task2.project1_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExample15 {
    static int positive_sum = 0;
    static int positive_length = 0;

    static int[] nums = new int [10];
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        try{
            FillTheArray(nums);
            FindPositiveNums(nums);
            System.out.println(MidValue());
        } catch (InputMismatchException e){
            System.out.println("Вы ввели строку вместо числа или введён неверный числовой тип данных");
        } catch (ArithmeticException e){
            System.out.println("Отсутствуют положительные элементы в массиве");
        }
    }
    private static void FillTheArray(int [] nums) throws InputMismatchException {
        for (int i = 0; i < nums.length; i++) nums[i] = scan.nextInt();
    }
    private static void FindPositiveNums(int [] nums) throws ArithmeticException{
        for (int x : nums) {
            if (x > 0) {
                positive_sum += x;
                positive_length++;
            }
        }
        if (positive_length == 0) throw new ArithmeticException();
    }
    private static int MidValue () throws ArithmeticException{
        return positive_sum / positive_length;
    }
}
