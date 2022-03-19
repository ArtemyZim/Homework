package com.company.laba5;

class Example14_01 {

    private char symbol;

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getSymbolCode(){
        return this.symbol;
    }

    public void outputSymbolAndCode(){
        System.out.println("Символ " + this.symbol);
        System.out.println("Код символа " + (int) (this.symbol));
    }

}
