package com.company.timus;

import java.util.Scanner;

public class Four_devils {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nums = scan.nextInt();

        if ((nums*(nums+1)/2) % 2 == 0) System.out.println("black");
        else System.out.println("grimy");
    }
}
