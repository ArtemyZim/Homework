package com.company.laba7;

public class SubClass2Example15_03 extends SubClassExample15_03{

    public String str;

    SubClass2Example15_03(int num, char chr, String str){
        this.str = str;
        this.num = num;
        this.chr = chr;
    }

    SubClass2Example15_03(){

    }

    public void setFields (int num, char chr, String str){
        this.str = str;
        this.num = num;
        this.chr = chr;
    }

    @Override
    public String toString(){
        String classAndFields;
        classAndFields = "Subclass2 name: " + this.getClass().getSimpleName()+
                "\n" + "str: " + str + "\n" + "chr: " + chr + "\n" + "num: " + num;
        return classAndFields;
    }
}
