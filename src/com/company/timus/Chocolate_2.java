package com.company.timus;

import java.util.Scanner;
public class Chocolate_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int m, n;

        m = scan.nextInt();
        n = scan.nextInt();

        if (m * n % 2 == 0) System.out.println("[:=[first]");
        else System.out.println("[second]=:]");

    }
}
