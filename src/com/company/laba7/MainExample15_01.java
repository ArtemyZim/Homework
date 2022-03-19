package com.company.laba7;

public class MainExample15_01 {
    public static void main(String[] args) {

        SuperClassExample15_01 superClassObject = new SuperClassExample15_01("в конструкторе суперкласса");
        String superClassAndField = superClassObject.toString();
        System.out.println(superClassAndField);

        SubClassExample15_01 subClassObject1 = new SubClassExample15_01("в конструкторе подкласса");
        String subClassAndField = subClassObject1.toString();
        System.out.println(subClassAndField);

        SubClassExample15_01 subClassObject2 = new SubClassExample15_01("в конструкторе подкласса", "два параметра");
        String subClassAndField2 = subClassObject2.toString();
        System.out.println(subClassAndField2);

    }

}
