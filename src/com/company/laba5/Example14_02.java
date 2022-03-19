package com.company.laba5;

class Example14_02 {

    private char symbol1;
    private char symbol2;

    public void setSymbol2(char symbol2) {
        this.symbol2 = symbol2;
    }

    public void setSymbol1(char symbol1) {
        this.symbol1 = symbol1;
    }

    public char[] getSymbols(){
        char [] symbols = new char[(int) (Math.abs(symbol1-symbol2) + 1)];
        System.out.print("Символы: ");
        if (symbol1 < symbol2){
                for (int i = 0; i <= (symbol2-symbol1); i++){
                    System.out.print((char) (symbol1 + i) + " ");
                    symbols [i] = (char) (symbol1 + i);
                }
        }
        else if (symbol1 > symbol2){
            for (int i = 0; i <= (symbol1-symbol2); i++){
                 System.out.print((char) (symbol1 - i) + " ");
                 symbols[i] = (char) (symbol1 - i);
            }
        }
        return symbols;
    }
}
