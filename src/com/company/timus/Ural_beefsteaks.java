package com.company.timus;

import java.util.Scanner;
public class Ural_beefsteaks {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String [] m_str = str.split(" ");
        int beefsteaks = Integer.parseInt(m_str[0]);
        int pan_power = Integer.parseInt(m_str[1]);

        if (beefsteaks <= pan_power) System.out.println(2);
        else {
            int per_one_min = beefsteaks / pan_power;
            if (beefsteaks % pan_power == 0) System.out.println(per_one_min * 2);
            else if (beefsteaks % pan_power > (pan_power / 2)) System.out.println(per_one_min * 2 + 2);
            else System.out.println(per_one_min * 2 + 1);
        }
    }
}
