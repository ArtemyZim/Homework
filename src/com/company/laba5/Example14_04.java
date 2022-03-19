package com.company.laba5;

public class Example14_04 {

    private final int num;
    private final char symbol;

    Example14_04(int num, char symbol){
        this.num = num;
        this.symbol = symbol;
    }

    Example14_04(double num){
        this.symbol = (char) Math.floor(num);
        this.num = (int) ((num % this.symbol) * 100);

    }

    public void outputSymbolAndNum(){
        System.out.println("Целочисленное поле равно " + num + ", а символьное равно " + symbol);
    }
}
