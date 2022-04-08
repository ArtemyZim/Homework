package com.company.laba10.task1;

public class MainExample15_10 {
    public static int m(){
        try {
            System.out.println("0");            //(1) Выполнение блока try
            return 15;
        } finally {
            System.out.println("1");
            return 20;                          //(2) Выполнение блока finally
        }
    }

    public static void main(String[] args) {
        System.out.println(m());                /*(3) Вывод значения 20, так как блок finally выпоняется в любом случае
                                                выполнение основного метода*/
    }

}
