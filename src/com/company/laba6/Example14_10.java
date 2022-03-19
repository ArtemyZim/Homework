package com.company.laba6;

import java.util.Arrays;
public class Example14_10 {

    public static int[] maxAndMin(int...nums){
        Arrays.sort(nums);
        int result [] = new int[2];
        result[0] = nums[0];
        result[1] = nums[nums.length-1];
        return result;

    }
}
