package com.company.timus;

import java.util.Scanner;
public class Localization {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();

        if (amount <= 4) System.out.println("few");
        else if (amount <= 9) System.out.println("several");
        else if (amount <= 19) System.out.println("pack");
        else if (amount <= 49) System.out.println("lots");
        else if (amount <= 99) System.out.println("horde");
        else if (amount <= 249) System.out.println("throng");
        else if (amount <= 499) System.out.println("swarm");
        else if (amount <= 999) System.out.println("zounds");
        else System.out.println("legion");
    }
}
