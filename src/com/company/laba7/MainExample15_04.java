package com.company.laba7;

public class MainExample15_04 {
    public static void main(String[] args) {

        SuperClassExample15_04 superClassExample15_04 = new SuperClassExample15_04('G');
        String supClassAndFields = superClassExample15_04.toString();
        System.out.println(supClassAndFields);

        SubClassExample15_04 subClassExample15_04 = new SubClassExample15_04('H', "string");
        String subClassAndFields = subClassExample15_04.toString();
        System.out.println(subClassAndFields);

        SubClass2Example15_04 subClass2Example15_04 = new SubClass2Example15_04('Z', "string2", 9);
        String subClassAndFields2 = subClass2Example15_04.toString();
        System.out.println(subClassAndFields2);

        SubClass2Example15_04 subClass2CopyExample15_04 = new SubClass2Example15_04(subClass2Example15_04);
        String subClassAndFields2Copy = subClass2Example15_04.toString();
        System.out.println(subClassAndFields2Copy);
    }
}
