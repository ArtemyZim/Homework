package com.company.laba8.project15_02;

public class ExampleBin {
    public static String binary(int x){
        if (x == 2){
            return "10";
        }
        if (x == 1){
            return "1";
        }
        return binary(x/2) + (x % 2);
    }
}
