package com.company.laba6;

public class Example14_08 {

    public static int midNum(int [] nums){
        double result = 0;
        for (int num : nums) result += num;
        return (int) (result / nums.length);
    }
}
