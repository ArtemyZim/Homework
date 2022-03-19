package com.company.laba7;

public class SubClassExample15_03 extends SuperClassExample15_03{

    public char chr;

    SubClassExample15_03(int num, char chr){
        this.chr = chr;
        this.num = num;
    }
    SubClassExample15_03(){

    }

    public void setFields(int num, char chr){
        this.num = num;
        this.chr = chr;
    }

    @Override
    public String toString(){
        String classAndFields;
        classAndFields = "Subclass name: " + this.getClass().getSimpleName() +
                "\n" + "chr: " + chr + "\n" + "num: " + num;
        return classAndFields;
    }
}
