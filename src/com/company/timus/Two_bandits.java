package com.company.timus;

import java.util.Scanner;

public class Two_bandits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int harry = scan.nextInt();
        int larry = scan.nextInt();
        int bottles = harry + larry - 1;

        System.out.println((bottles - harry) + " " + (bottles - larry));
    }
}
