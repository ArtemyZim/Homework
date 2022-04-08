package com.company.timus;

import java.util.Scanner;
public class Wedding_dinner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cost = 0;

        int n = scan.nextInt();

        String [] str = new String [n];

        for (String x : str) {
            x = scan.next();
            if (x.contains("+")){
                n += 1;
                cost += 200;
            }
            else cost += 100;
        }

        if (n == 11) cost += 100;

        System.out.println(cost + 200);
    }
}
