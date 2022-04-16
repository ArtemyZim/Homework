package com.company.timus;

import java.util.Scanner;
public class Titan_ruins_secret_enter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int wall_sectors = scan.nextInt();
        int [] powers = new int[wall_sectors];
        int max_power_sum = 0;
        int mid_sector_num = 0;

        for (int i = 0; i < wall_sectors; i++){
            powers[i] = scan.nextInt();
        }

        for (int i = 1; i < powers.length-1; i++){
            if (max_power_sum < (powers[i-1] + powers[i] + powers[i+1])){
                max_power_sum = powers[i-1] + powers[i] + powers[i+1];
                mid_sector_num = i+1;
            }
        }
        System.out.printf("%d %d", max_power_sum, mid_sector_num);
    }
}
