package com.company.laba5;

class Example14_03 {

    private int num1;
    private int num2;

    Example14_03(){
        num1 = 0;
        num2 = 0;
    }

    Example14_03(int num){
        num1 = num;
        num2 = num;
    }

    Example14_03(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public void output(){
        System.out.println("Выводим значения полей: " + num1 + " " + num2);
    }

}
