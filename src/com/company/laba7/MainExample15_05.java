package com.company.laba7;

public class MainExample15_05 {
    public static void main(String[] args) {

        SuperClassExample15_05 superClassExample15_05 = new SuperClassExample15_05("string");
        SubClassExample15_05 subClassExample15_05 = new SubClassExample15_05(5, "string2");
        SubClass2Example15_05 subClass2Example15_05 = new SubClass2Example15_05('I', "string3");

        superClassExample15_05.showClassAndFields();
        subClassExample15_05.showClassAndFields();
        subClass2Example15_05.showClassAndFields();

        SuperClassExample15_05 superClassObject = new SubClassExample15_05(6, "def string");
        superClassObject.showClassAndFields();
    }
}
