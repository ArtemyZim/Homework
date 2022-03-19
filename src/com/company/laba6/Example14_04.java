package com.company.laba6;

public class Example14_04 {

    public static int recursionMeth(int num){
        int result;

        if (num == 1) return 1;
        if (num == 2) return 2;
        result = recursionMeth(num - 2) * num;
        return result;
    }

    public static int notRecursion(int num){
        if (num == 1) return 1;
        if (num == 2) return 2;

        int result = 1;
        if (num % 2 == 0){
            for (int i = 2; i <= num; i += 2) result *= i;
            return result;
        }
        else{
            for (int i = 1; i <= num; i += 2) result *= i;
            return result;
        }
    }
}
