package com.company.laba7;

public class SubClass2Example15_05 extends SuperClassExample15_05{

    protected char chr;

    SubClass2Example15_05(){

    }

    SubClass2Example15_05(char chr, String str){
        this.chr = chr;
        this.str = str;
    }

    @Override
    public void showClassAndFields(){
        String classAndFields;
        classAndFields = "Subclass name: " + this.getClass().getSimpleName() +
                "\n" + "str: " + str + "\n" + "chr: " + chr;
        System.out.println(classAndFields);
    }
}
