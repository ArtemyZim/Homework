package com.company.laba6;

import java.util.Arrays;
public class MainExample14_06 {
    public static void main(String[] args) {

        int [] massive = {1, 2, 3, 4, 5};
        System.out.print("Выведем массив содержащий 3 значения: ");
        System.out.println(Arrays.toString(Example14_06.newMassive(massive, 3)));
        System.out.print("Выведем копию исходного массива: ");
        System.out.println(Arrays.toString(Example14_06.newMassive(massive, 10)));
    }
}
