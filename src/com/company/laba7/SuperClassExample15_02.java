package com.company.laba7;

public class SuperClassExample15_02 {
    private String str;

    SuperClassExample15_02(String str) {
        this.str = str;
    }

    SuperClassExample15_02() {

    }

    public void setFields(){
        str = "default";
    }

    public void setFields(String str){
        this.str = str;
    }

    public String getStrLength(){
        return "Длина строки: " + str.length();
    }
    public String getStr(){
        return str;
    }
}
