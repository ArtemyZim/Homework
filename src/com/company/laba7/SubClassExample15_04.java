package com.company.laba7;

public class SubClassExample15_04 extends SuperClassExample15_04{

    public String str;

    SubClassExample15_04(char chr, String str){
        this.chr = chr;
        this.str = str;
    }

    SubClassExample15_04(SubClassExample15_04 obj){
        this.chr = obj.chr;
        this.str = obj.str;
    }
    SubClassExample15_04(){

    }

    @Override
    public String toString(){
        String classAndFields;
        classAndFields = "Class name: " + this.getClass().getSimpleName() +
                "\n" + "chr: " + chr + "\n" + "str: " + str;
        return classAndFields;
    }
}
