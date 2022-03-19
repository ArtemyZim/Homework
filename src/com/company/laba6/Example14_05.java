package com.company.laba6;

public class Example14_05 {

    public static int recursionMeth(int num){
        if (num == 1) return 1;

        int result;
        result = recursionMeth(num-1) + num * num;
        return result;
    }
    public static int notRecursion(int num){
        int result = 0;
        for (int i = 1; i <= num; i++) result += i * i;
        return result;
    }
}
