package com.company.laba10.task1;

public class MainExample15_14 {
    public static void m(int x) throws ArithmeticException{
        int h = 10/x;                                               //(2) Выполнение метода m()
    }

    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("Размер массива = " + l);            //(1) Выполнение блока try
            m(l);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль");          //(3) Выполнение блока catch
        }                                                            // при нулевом размере массива args[]
    }
}
