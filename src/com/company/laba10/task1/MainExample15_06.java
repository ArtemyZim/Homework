package com.company.laba10.task1;

public class MainExample15_06 {
    public static void main(String[] args) {
        try{
            System.out.println("0");               //(1) Выполнение блока try
            throw new NullPointerException("ошибка");
        } catch (ArithmeticException e){
            System.out.println("1");
        } catch (RuntimeException e){
            System.out.println("2");                //(2) Выполнение блока catch
        }catch (Exception e){
            System.out.println("3");
        }
        System.out.println("4");                    //(3) Выполнение остального кода
    }
}
