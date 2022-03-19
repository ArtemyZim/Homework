package com.company.laba7;

public class SubClassExample15_02 extends SuperClassExample15_02{

    public int num;

    SubClassExample15_02(int num, String str){
        super(str);
        this.num = num;
    }

    SubClassExample15_02(){

    }

    @Override
    public void setFields(){
        super.setFields();
        num = 0;
    }

    @Override
    public void setFields(String str){
        super.setFields(str);
    }

    public void setFields(int num){
        this.num = num;
    }

    public void setFields(String str, int num){
        this.num = num;
        super.setFields(str);
    }

    public String getFields(){
        return "str: " + super.getStr() + "\n" + "num: " +  num;
    }

}
