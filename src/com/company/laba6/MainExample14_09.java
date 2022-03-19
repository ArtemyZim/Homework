package com.company.laba6;

import java.util.Arrays;
public class MainExample14_09 {
    public static void main(String[] args) {

        int nums[] = {20, 25, 3, 5, 100, 6, 87, 8};
        System.out.println("Массив до сортировки " + Arrays.toString(nums));
        System.out.print("Массив после сортировки: ");
        System.out.println(Arrays.toString(Example14_09.massChange(nums)));
    }
}
