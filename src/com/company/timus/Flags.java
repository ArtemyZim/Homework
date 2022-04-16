package com.company.timus;

import java.util.Scanner;

public class Flags {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        long m = 2;
        if(N == 1) System.out.println(2);
        else {
            for (long i = 0, j = 1; j < N; i = m-i, j++){
                m += i;
            } System.out.println(m);
        }
    }
}
