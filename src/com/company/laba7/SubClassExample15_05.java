package com.company.laba7;

public class SubClassExample15_05 extends SuperClassExample15_05{

    protected int num;

    SubClassExample15_05(){

    }
    SubClassExample15_05(int num, String str){
        this.num = num;
        this.str = str;
    }

    @Override
    public void showClassAndFields(){
        String classAndFields;
        classAndFields = "Subclass name: " + this.getClass().getSimpleName() +
                "\n" + "str: " + str + "\n" + "num: " + num;
        System.out.println(classAndFields);
    }
}
