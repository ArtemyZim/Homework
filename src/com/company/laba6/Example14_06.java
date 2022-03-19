package com.company.laba6;

public class Example14_06 {

    public static int[] newMassive(int [] nums, int num){
        int [] nums1;
        if (nums.length < num) {
            nums1 = nums;
        }
        else {
            nums1 = new int[num];
            for (int i = 0; i < num; i++) {
                nums1[i] = nums[i];
            }
        }
        return nums1;
    }
}
