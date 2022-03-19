package com.company.laba7;

public class SubClassExample15_01 extends SuperClassExample15_01{

    private String str2;
    private String str3;

    SubClassExample15_01(String str1, String str2){
        this.str2 = str1;
        this.str3 = str2;
    }

    SubClassExample15_01(String str){
        super(str);
    }

    @Override
    public String toString(){
        String subClassNameAndFieldValue;
        subClassNameAndFieldValue = "subClass name: " +
                this.getClass().getSimpleName() + "\nstr2: " +
                str2 + "\nstr3: " + str3;
        return subClassNameAndFieldValue;
    }

    public String getStr2(){
        return str2;
    }

    public void setStr2(String str){
        this.str2 = str;
    }

    public String getStr3(){
        return str3;
    }

    public void setStr3(String str){
        this.str3 = str;
    }

}
