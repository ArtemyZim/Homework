package com.company.laba10.task2.project2_2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MainExample15 {

    static Scanner scan = new Scanner(System.in);
    static int [][] nums_matrix = new int [7][7];

    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < nums_matrix.length; i++){
            System.out.println();
            for (int k = 0; k < nums_matrix.length; k++){
                nums_matrix[i][k] = random.nextInt(100);
                System.out.printf("%2d ", nums_matrix[i][k]);
            }
        }
        System.out.println();
        System.out.println("Введите номер столбца для вывода");

        try{
            ColumnOutput(ColumnInput());
        } catch (InputMismatchException e){
            System.out.println("Вы ввели строку вместо числа");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Такого столбца не существует");
        }
    }
    private static int ColumnInput() throws InputMismatchException{
        return scan.nextInt();
    }
    private static void ColumnOutput(int column) throws IndexOutOfBoundsException{
        for (int[] numsMatrix : nums_matrix) {
            System.out.println(numsMatrix[column]);
        }
    }

}
