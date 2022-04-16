package com.company.timus;

import java.util.Scanner;

public class One_Ten_Hundred_Thousand {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int str_count = scan.nextInt();
        long [] positions = new long[str_count];

        for (int i = 0; i < str_count; i++) positions[i] = scan.nextLong();

        for (long position : positions) {
            if (isTriangular(position - 1)) System.out.println(1);
            else System.out.println(0);
        }
    }
    private static boolean isTriangular(long position){
        if (position == 0) return true;
        return Math.ceil(Math.sqrt(8 * (position) + 1)) / Math.sqrt(8 * (position) + 1) == 1;
    }
}
