package com.company.timus;

import java.util.Scanner;

public class Question_of_sports {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix.length; k++) {
                matrix[i][k] = scan.nextInt();
            }
        }
        for (int k = 0; k < n*2; k++){
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    if (i + j == k) System.out.print(matrix[j][i] + " ");
                }
            }
        }
    }
}
