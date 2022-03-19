package com.company.timus;

import java.util.Scanner;
import java.util.Arrays;
public class Easy_task {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int [] nums = {num1, num2, num3};
        Arrays.sort(nums);
        int a = nums[0] - nums[1] - nums[2];
        int b = nums[0] - nums[1] * nums[2];
        System.out.println(Math.min(a, b));
    }
}
