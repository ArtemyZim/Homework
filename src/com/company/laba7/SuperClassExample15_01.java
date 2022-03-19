package com.company.laba7;

public class SuperClassExample15_01 {

    private String str1;

    SuperClassExample15_01(String str){
        this.str1 = str;
    }

    SuperClassExample15_01(){

    }

    @Override
    public String toString(){
        String superClassAndFieldName;
        superClassAndFieldName = "superClass name: " +
                this.getClass().getSimpleName() + "\nstr1: " +
                str1;
        return superClassAndFieldName;
    }

    public void setStr1(String str){
        this.str1 = str;
    }
    public String getStr1(){
        return str1;
    }
}
