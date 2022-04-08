package com.company.laba10.task1;

public class MainExample15_11 {
    public static void main(String[] args) {
        try{
            System.out.println("0");                //(1) Выполнение блока try
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e){
            System.out.println("1");                //(2) Выполнение блока catch
        } finally {
            System.out.println("2");                //(3) Выполнение блока finally
        }
        System.out.println("3");                    //(4) Выполнение остального кода
    }
}
