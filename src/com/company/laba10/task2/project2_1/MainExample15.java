package com.company.laba10.task2.project2_1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class MainExample15 {
    public static void main(String[] args) {

        int [][] nums_matrix = new int [5][5];
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++){
            System.out.println();
            for (int k = 0; k < 5; k++){
                nums_matrix[i][k] = random.nextInt(100);
                System.out.printf("%2d ", nums_matrix[i][k]);
            }
        }
        System.out.println();
        System.out.println("Введите номер столбца для вывода");
        try {
            int column = scan.nextInt();

            for (int i = 0; i < 5; i++) {
                System.out.println(nums_matrix[i][column]);
            }
        } catch (InputMismatchException e){
            System.out.println("Вы ввели строку вместо целочисленного значения");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Такого столбца не существует");
        }
    }
}
