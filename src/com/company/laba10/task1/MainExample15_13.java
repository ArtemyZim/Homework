package com.company.laba10.task1;

public class MainExample15_13 {
    public static void main(String[] args) {
        try{
            int l = args.length;
            System.out.println("размер массива = " + l);            //(1) Выполнение блока try
            int h = 10/l;
            args[l + 1] = "10";
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Индекс не существует");             //(2) Выполнение блока catch при передаче аргументов
        }                                                           //в командную строку
    }
}
