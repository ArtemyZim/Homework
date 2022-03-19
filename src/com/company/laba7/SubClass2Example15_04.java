package com.company.laba7;

public class SubClass2Example15_04 extends SubClassExample15_04{

    public int num;

    SubClass2Example15_04(char chr, String str, int num){
        this.chr = chr;
        this.str = str;
        this.num = num;
    }

    SubClass2Example15_04(SubClass2Example15_04 obj){
        this.chr = obj.chr;
        this.str = obj.str;
        this.num = obj.num;
    }
    SubClass2Example15_04(){

    }

    @Override
    public String toString(){
        String classAndFields;
        classAndFields = "Class name: " + this.getClass().getSimpleName() +
                "\n" + "chr: " + chr + "\n" + "str: " + str + "\n" + "num: " + num;
        return classAndFields;
    }


}
