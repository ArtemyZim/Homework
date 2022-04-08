package com.company.laba10.task2.project3_1;

import java.util.InputMismatchException;
import java.util.Scanner;
public class MainExample15 {
    public static void main(String[] args) {

        long arraySum = 0;
        byte [] byteArray = new byte[5];
        Scanner scan = new Scanner(System.in);

        try{
            for (int i = 0; i < byteArray.length; i++) {
                byteArray[i] = scan.nextByte();
                arraySum += byteArray[i];

                if (arraySum > 127 || arraySum < -128) throw new ArithmeticException("За границей диапазона типа");
            }

            System.out.println("Сумма элементов массива типа byte = " + (byte) arraySum);

        } catch (ArithmeticException e){
            System.out.println("Ввод или вычисление значения за границами диапазона типа byte");
        } catch (InputMismatchException e){
            System.out.println("Ввод строки вместо числа");
        }
    }
}
