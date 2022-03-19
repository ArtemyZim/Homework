package com.company.laba6;

public class Example14_01 {
    String text;
    char chr;

    public void set(String text){
        this.text = text;
    }
    public void set(char chr){
        this.chr = chr;
    }
    public void set(char...chr){
        if (chr.length == 1){
            this.chr = chr[0];
        }
        else if(chr.length > 1){
            text = new String(chr);
        }
    }

    public char getChr() {
        return chr;
    }

    public String getText() {
        return text;
    }
}
