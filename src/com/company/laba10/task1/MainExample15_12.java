package com.company.laba10.task1;

public class MainExample15_12 {
    public static void m (String str, double chislo){
        if (str == null){
            throw new IllegalArgumentException("Строка введена неверно");       //Блок "бросит" исключение типа
        }                                                                       //IllegalArgumentException (строка равна null)
        if (chislo>0.001){
            throw new IllegalArgumentException("Неверное число");               //Данный блок не выполнится
        }
    }
    public static void main(String[] args) {
        m(null, 0.000001);
    }
}
