package com.company.laba10.task1;

public class MainExample15_04 {
    public static void main(String[] args) {
        
        try {
            System.out.println("0");            //(1) Выполнение блока try
            throw new RuntimeException("ошибка");
        }catch (NullPointerException e){
            System.out.println("1");
        }catch (Exception e){
            System.out.println("2");            //(2) Выполнение блока catch с подходящим классом
        }catch (Error e){
            System.out.println("3");
        }
        System.out.println("4");                //(3) Выполнение остального кода
    }
}
