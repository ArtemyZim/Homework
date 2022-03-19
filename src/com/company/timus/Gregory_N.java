package com.company.timus;

import java.util.Scanner;
public class Gregory_N {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tasks_1 = scan.nextInt();
        int minutes_left = 240;
        int tasks_left = 12 - tasks_1;
        if(tasks_left * 45 > minutes_left) System.out.println("NO");
        else System.out.println("YES");

    }
}
