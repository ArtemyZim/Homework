package com.company.timus;

import java.util.Scanner;
public class MEGA_turn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        String [] m_str1 = str1.split(" ");
        String [] m_str2 = str2.split(" ");

        int[] cars = new int[m_str2.length];

        int cars_per_m = Integer.parseInt(m_str1[0]);
        int minutes = Integer.parseInt(m_str1[1]);
        int differ = 0;

        for (int i = 0; i < minutes; i++){
            cars[i] = Integer.parseInt(m_str2[i]) + differ;
            differ = Math.max(cars[i] - cars_per_m, 0);

        }
        if (cars[cars.length-1] > cars_per_m)
            System.out.println(cars[cars.length-1] - cars_per_m);
        else System.out.println(0);
    }
}
