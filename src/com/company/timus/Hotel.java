package com.company.timus;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int [][] matrix = new int[num][num];

        for(int i = 0; i < num; i++) matrix[i][num-1] = (i+1)*(i+2)/2;

        for (int i = 0; i < num-1; i++) {
            for (int k = num - 2; k >= i; k--) matrix[i][k] = matrix[i][k+1] + num - k + i-1;
        }
        for (int i = 1; i < num; i++){
            for (int k = i-1; k>=0; k--) matrix[i][k] = matrix[i][k+1] + num + k - i;
        }
        for (int i = 0; i < num; i++){
            for (int k = 0; k < num; k++) System.out.print(matrix[i][k] + " ");
            System.out.println();
        }
    }
}
