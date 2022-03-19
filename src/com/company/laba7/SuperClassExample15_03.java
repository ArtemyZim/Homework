package com.company.laba7;

public class SuperClassExample15_03 {

    public int num;

    SuperClassExample15_03(int num){
        this.num = num;
    }
    SuperClassExample15_03(){

    }

    public void setFields(int num){
        this.num = num;
    }

    @Override
    public String toString(){
        String classAndFields;
        classAndFields = "Superclass name: " + this.getClass().getSimpleName() +
                "\n" + "num: " + num;
        return classAndFields;
    }
}
