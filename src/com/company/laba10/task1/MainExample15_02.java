package com.company.laba10.task1;

public class MainExample15_02 {
    public static void main(String[] args) {
        try {
            System.out.println("1");        //(1)Выполнение блока try
            throw new RuntimeException("Непроверяемая ошибка");
            //System.out.println("2");  Данный блок не выполнится, так как возникнет ошибка типа unreachable statement
        } catch (Exception e){
            System.out.println("3 " + e);   //(2)Выполнение блока catch
        }
        System.out.println("4");            //(3)Выполнение остального кода
    }
}
