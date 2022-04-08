package com.company.laba10.task1;

public class MainExample15_09 {
    public static int m(){
        try{
            System.out.println("0");            //(1) Выполнение блока try
            return 55;
        } finally {
            System.out.println("1");            //(2) Выполнение блока finally
        }
    }
    public static void main(String[] args) {
        System.out.println(m());                //(3) Вывод значения 55 (выполнение основного метода)
    }
}
