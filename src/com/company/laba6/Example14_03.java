package com.company.laba6;

import java.util.Arrays;
public class Example14_03 {

    static int maxNum(int...num){
        Arrays.sort(num);
        return num[num.length-1];
    }
    static int minNum(int...num){
        Arrays.sort(num);
        return num[0];
    }
    static int midNum(int...num){
        int sum = 0;
        for (int x : num) sum += x;
        return sum / num.length;
    }
}
