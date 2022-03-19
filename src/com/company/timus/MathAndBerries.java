package com.company.timus;

import java.util.Scanner;
public class MathAndBerries {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        String [] m_str1 = str1.split(" ");
        String str2 = scan.nextLine();
        String [] m_str2 = str2.split(" ");
        String str3 = scan.nextLine();
        String [] m_str3 = str3.split(" ");

        int a1 = Integer.parseInt(m_str1[0]);
        int b1 = Integer.parseInt(m_str1[1]);
        int b2 = Integer.parseInt(m_str2[1]);
        int a3 = Integer.parseInt(m_str3[0]);

        System.out.println((a1 - a3) + " " + (b1 - b2));
    }
}
