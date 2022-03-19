package com.company.laba8.project15_01;

public class ExampleRec2 {
    public static void m(int x){
        if((2*x+1) < 20){
            m(2*x + 1);
        }
        System.out.println("x = " + x);
    }
}
