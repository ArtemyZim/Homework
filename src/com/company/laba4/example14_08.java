package com.company.laba4;

import java.util.Scanner;
public class example14_08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = scan.next();
        int key;
        do{
            System.out.print("Введите ключ: ");
            while (!scan.hasNextInt()){
                System.out.println("Такое значение для ключа недопустимо");
                System.out.print("Введите целочисленное значение ");
                scan.next();
            }
            key = scan.nextInt();
            if (key <= 0) System.out.println("Отрицательное значение или значение 0 для ключа недопустимо");
        } while (key <= 0);

        char[] afterText = new char [text.length()];

        for (int i = 0; i<text.length(); i++)
            afterText [i] = (char) (text.charAt(i) + key);

        System.out.println("Текст после преобразования: " + new String(afterText));
        System.out.print("Вы хотите выполнить обратное преобразование? (y/n) ");
        String answer = scan.next();
        while (true) {
            if (answer.equals("y") || answer.equals("Y")) {
                for (int i = 0; i< afterText.length; i++)
                    afterText [i] -= key;
                System.out.println("Текст после обратного преобразования: " + new String(afterText));
                System.out.println("До свидания!");
                break;
            }
            else if (answer.equals("n") || answer.equals("N")) {
                System.out.println("До свидания!");
                break;

            }
            else System.out.println("Введите корректное значение (y/n)");
        }
    }
}
