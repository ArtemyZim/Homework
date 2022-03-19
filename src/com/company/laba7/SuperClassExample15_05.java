package com.company.laba7;

public class SuperClassExample15_05 {

    protected String str;

    SuperClassExample15_05(String str){
        this.str = str;
    }
    SuperClassExample15_05(){

    }

    public void showClassAndFields(){
        String classAndFields;
        classAndFields = "Superclass name: " + this.getClass().getSimpleName() +
                "\n" + "str: " + str;
        System.out.println(classAndFields);
    }


}
