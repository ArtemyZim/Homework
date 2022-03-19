package com.company.laba7;

public class MainExample15_03 {
    public static void main(String[] args) {

        SuperClassExample15_03 superClassObject = new SuperClassExample15_03(5);
        String supClassAndFieldsName = superClassObject.toString();
        System.out.println(supClassAndFieldsName);

        SubClassExample15_03 subClassObject = new SubClassExample15_03(10, 'H');
        String subClassAndFieldsName = subClassObject.toString();
        System.out.println(subClassAndFieldsName);

        SubClass2Example15_03 subClass2Object = new SubClass2Example15_03(11, 'A', "some string");
        String subClass2AndFieldsName = subClass2Object.toString();
        System.out.println(subClass2AndFieldsName);

    }
}
