package com.company.timus;

import java.util.Scanner;
public class Enia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int panels = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(panels * ((a * b) * 2));
    }
}
