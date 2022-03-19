package com.company.laba7;

public class MainExample15_02 {
    public static void main(String[] args) {

        SuperClassExample15_02 superClassObject = new SuperClassExample15_02("в суперклассе");
        String strLength = superClassObject.getStrLength();
        System.out.println(superClassObject.getStr());
        System.out.println(strLength);


        SubClassExample15_02 subClassObject = new SubClassExample15_02(5, "в подклассе");
        System.out.println(subClassObject.getFields());
        System.out.println(subClassObject.getStrLength());
    }

}
