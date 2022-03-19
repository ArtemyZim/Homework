package com.company.laba8.project15_03;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExampleRec {

    public static int counter = 0;
    static int [] nums;

    static Scanner scan = new Scanner(System.in);

    public static int[] recInput(int m) {
        if (counter < 0) counter = 0;
        if (counter == 0) nums = new int[m];
        if (counter == m) {
            counter = -1;
            return nums;
        }
        try{
            nums[counter] = scan.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Вы ввели неверное значение");
            return nums;
        }
        counter++;
        return recInput(m);
    }
    public static String recOutput(){
        counter++;
        if (counter == nums.length) {
            counter = 0;
            return "";
        }
        return nums[counter] + " " + recOutput();
    }
}
