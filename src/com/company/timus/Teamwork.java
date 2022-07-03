package com.company.timus;

import java.util.Scanner;

public class Teamwork {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        int [] input_nums = new int[N];

        for (int i = 0; i < input_nums.length; i++) input_nums[i] = scan.nextInt();

        for (int i = 0, k = 1; i < input_nums.length; i++){

            if (i < input_nums.length-1 && input_nums[i] == input_nums[i+1]) k++;
            else {
                System.out.printf("%d %d ", k, input_nums[i]);
                k = 1;
            }
        }
    }
}
