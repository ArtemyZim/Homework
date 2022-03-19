package com.company.laba6;

public class Example14_07 {

    public static int [] getIntMass(char [] chr){
        int [] symbNums = new int[chr.length];
        for (int i = 0; i < chr.length; i++){
            symbNums[i] = chr[i];
        }
        return symbNums;
    }
}
