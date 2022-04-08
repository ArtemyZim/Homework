package com.company.laba10.task1;

public class MainExample15_07 {
    public static void main(String[] args) {
        try {
            System.out.println("0");                //(1) Выполнение блока try
            throw new NullPointerException("ошибка");
        }catch (NullPointerException e){
            System.out.println("1");                //(2) Выполнение блока catch
            throw new ArithmeticException();
        }catch (ArithmeticException e){
            System.out.println("2");
        }
        System.out.println("3");                    /*Данный блок не выполнится, так как для перехвата исключения
                                                    типа ArithmeticException требуется новый обработчик*/
    }
}
