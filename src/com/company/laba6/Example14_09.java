package com.company.laba6;

public class Example14_09 {

    public static int[] massChange(int [] nums){
        int [] result = new int[nums.length];
        for (int i = 0, k = nums.length-1; i < nums.length; i++, k--){
            result[i] = nums[k];
        }
        return result;
    }
}
