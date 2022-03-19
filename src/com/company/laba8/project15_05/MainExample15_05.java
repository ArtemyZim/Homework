package com.company.laba8.project15_05;

import java.util.InputMismatchException;
import java.util.Scanner;
class Node{
    public int value;
    public Node next;

    Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
}
public class MainExample15_05 {
    public static void main(String[] args) {

        int choice = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Как Вы желаете заполнить список (с хвоста или с головы)?");
        System.out.print("Введите число соответственно (1 или 2): ");
        try{
            choice = scan.nextInt();
        } catch (InputMismatchException e){
            System.out.println("");
        }

        Node head = null;
        switch (choice) {
            case 1 -> {
                head = new Node(0, null);
                Node tail = head;
                for (int i = 0; i < 9; i++) {
                    tail.next = new Node(i + 1, null);
                    tail = tail.next;
                }
            }
            case 2 -> {
                for (int i = 9; i >= 0; i--) {
                    head = new Node(i, head);
                }
            }
            default -> System.out.println("Вы ввели неверное значение");
        }
        Node ref = head;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
