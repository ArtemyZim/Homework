package com.company.laba8.project15_01;

public class ExampleFact {
    public static int fact (int n){
        int result;
        if (n == 1) return 1;
        else {
            result = fact(n-1) * n;
            return result;
        }
    }
}
