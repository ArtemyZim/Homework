package com.company.laba5;

class Example14_06{

    private static int max;
    private static int min;

    Example14_06(int num){
        if (num > max) max = num;
        else if (num < min) min = num;
    }

    Example14_06(int num1, int num2){

        if (num1 > num2){
            max = num1;
            min = num2;
        }
        else if (num1 < num2){
            max = num2;
            min = num1;
        }
        else{
            max = num1;
            min = num1;
        }
    }


    public static void setMaxMin(int num){
        if (num > max){
            max = num;
        }
        else if (num < min){
            min = num;
        }
    }

    public static void setMaxMin(int num1, int num2){

        if (num1 > num2){
            if (num1 > max) max = num1;
            if (num2 < min) min = num2;

        }
        else if (num1 < num2){
            if (num2 > max) max = num2;
            if (num1 < min) min = num1;

        }
        else{
            if (num1 > max) max = num1;
            else if (num1 < min) min = num1;
        }

    }

    public static void outputMaxMin(){
        System.out.println("Значение max = " + max);
        System.out.println("Значение min = " + min);
        System.out.println();
    }
}
