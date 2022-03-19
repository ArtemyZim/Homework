package com.company.laba8.project15_01;

public class ExampleFib {
    public static int fib(int n){
        if (n == 0) {
            System.out.println("Внутри fib(0)");
            return 0;
        }
        if (n == 1) {
            System.out.println("Внутри fib(1)");
            return 1;
        }
        else{
            System.out.println("Внутри fib(" + n + ")");
            return fib(n-1) + fib(n-2);
        }
    }
}
