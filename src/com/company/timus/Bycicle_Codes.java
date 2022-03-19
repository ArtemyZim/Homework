package com.company.timus;

import java.util.Scanner;
public class Bycicle_Codes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String code1 = scan.next();
        String code2 = scan.next();

        int int1 = Integer.parseInt(code1);
        int int2 = Integer.parseInt(code2);

        if (int1 % 2 == 1 && int2 % 2 == 0) System.out.println("no");
        else System.out.println("yes");

    }
}
