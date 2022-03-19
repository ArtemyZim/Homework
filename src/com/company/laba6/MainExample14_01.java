package com.company.laba6;

public class MainExample14_01 {
    public static void main(String[] args) {

        Example14_01 example14_01 = new Example14_01();

        example14_01.set('a');
        example14_01.set("This is a string");

        System.out.println("Символьное поле: " + example14_01.getChr() + " Строковое поле: " + example14_01.getText());

        char[] chr1 = {'a', 'b', 'c'};

        example14_01.set(chr1);

        System.out.println("Строковое поле: " + example14_01.getText());

        char[] chr2 = {'b'};

        example14_01.set(chr2);

        System.out.println("Символьное поле: " + example14_01.getChr());
    }
}
