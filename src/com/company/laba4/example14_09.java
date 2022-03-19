package com.company.laba4;

import java.util.Scanner;
public class example14_09 {
    public static void main(String[] args) {

        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F',
                           'G', 'H', 'I', 'J', 'K', 'L',
                           'M', 'N', 'O', 'P', 'Q', 'R',
                           'S', 'T', 'U', 'V', 'W', 'X',
                           'Y', 'Z', 'a', 'b', 'c', 'd',
                           'e', 'f', 'g', 'h', 'i', 'j',
                           'k', 'l', 'm', 'n', 'o', 'p',
                           'q', 'r', 's', 't', 'u', 'v',
                           'w', 'x', 'y', 'z'};

        Scanner scan = new Scanner(System.in);
        System.out.print("Исходный алфавит: ");
        for (char c : alphabet) {
            System.out.print(c);
        }

        System.out.println();
        boolean isInText;

        do {
            System.out.print("Введите текст для шифрования согласно алфавиту: ");
            if (scan.hasNextInt()) System.out.println("Целочисленные значения недопустимы");
            String text = scan.next();
            char[] afterText = new char [text.length()];
            for (int i = 0; i<text.length(); i++) {
                afterText[i] = text.charAt(i);
            }
            isInText = true;

            for (char c : afterText) {
                if (!isInText) {
                    System.out.println("Данный текст не соотвествует алфавиту");
                    System.out.println("Возможно указаны неверные значения");
                    break;
                }
                for (char value : alphabet) {
                    if (c == value) {
                        isInText = true;
                        break;
                    }
                    isInText = false;
                }
            }
            if (isInText){
                System.out.println();
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
                for (int i = 0; i < afterText.length; i++) {
                    for (int k = 0; k < alphabet.length; k++) {
                        if (afterText[i] == alphabet[k]) {
                            if (k + key >= alphabet.length)
                                afterText[i] = alphabet[(k + key) % alphabet.length];
                            else
                                afterText[i] = alphabet[k + key];
                            break;
                        }
                    }
                }
                System.out.println("Текст после преобразования: " + new String(afterText));
                System.out.print("Вы хотите выполнить обратное преобразование? (y/n) ");
                String answer = scan.next();
                while(true){
                    if (answer.equals("y") || (answer.equals("Y"))){
                        for (int i = 0; i < afterText.length; i++){
                            for (int k = 0; k < alphabet.length; k++){
                                if (afterText[i] == alphabet[k]){
                                    if (k - key < 0)
                                        afterText[i] = alphabet[alphabet.length + (k-key)];
                                    else
                                        afterText[i] = alphabet[k-key];
                                    break;
                                }
                            }
                        }
                        System.out.println("Текст после обратного преобразования: " + new String(afterText));
                        System.out.println("До свидания!");
                        break;
                    }
                    else if (answer.equals("N") || (answer.equals("n"))){
                        System.out.println("До свидания!");
                        break;
                    }
                }
            }
        } while (!isInText);

    }
}
