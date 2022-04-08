package com.company.laba10.task1;

    public class MainExample15_01 {
        public static void main(String[] args) {
            try{
                System.out.println("0");         //(1) Выполнение блока try
                throw new RuntimeException("Непроверямемая ошибка");
            }catch (RuntimeException e){
                System.out.println("1 " + e);    //(2) Выполнение блока catch
            }
            System.out.println("2");             //(3) Выполнение остального кода
        }
    }
