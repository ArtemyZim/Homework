package com.company.laba7;

public class SuperClassExample15_04 {

    public char chr;

    SuperClassExample15_04(char chr){
        this.chr = chr;
    }

    SuperClassExample15_04(SuperClassExample15_04 obj){
        this.chr = obj.chr;
    }
    SuperClassExample15_04(){

    }

    @Override
    public String toString(){
        String classAndFields;
        classAndFields = "Class name: " + this.getClass().getSimpleName() +
                "\n" + "chr: " + chr;
        return classAndFields;
    }
}
