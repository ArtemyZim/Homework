package com.company.laba10.task2.project3_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainExample15 {

    static long arraySum = 0;
    static byte [] byteArray = new byte[5];
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            ByteArrayInput();
            ByteArraySum();
            System.out.println("Сумма элементов массива типа byte = " + arraySum);
        } catch (InputMismatchException e){
            if (!scan.hasNextInt() && !scan.hasNextFloat() && !scan.hasNextLong()
                                 && !scan.hasNextShort() && !scan.hasNextDouble()){

                System.out.println("Ввод строки вместо числа");
            }
            else System.out.println("Ввод значения за границами диапазона типа byte");
        } catch (ArithmeticException e){
            System.out.println("Вычисление значения за границами диапазона типа byte");
        }
    }
    private static void ByteArrayInput() throws InputMismatchException{
        for (int i = 0; i < byteArray.length; i++) byteArray[i] = scan.nextByte();
    }
    private static void ByteArraySum() throws ArithmeticException{
        for (byte x : byteArray) arraySum += x;
        if (arraySum > 127 || arraySum < -128) throw new ArithmeticException("За границей диапазона типа");
    }
}
