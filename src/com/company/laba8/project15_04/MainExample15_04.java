package com.company.laba8.project15_04;

class Node {
    public int value;
    public Node next;

    Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
}

public class MainExample15_04 {
    public static void main(String[] args) {


        Node node0 = new Node (0, null);
        Node node1 = new Node (1, null);
        Node node2 = new Node (2, null);
        Node node3 = new Node (3, null);

        System.out.println("Соединим узлы");
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        System.out.println("Выведем значения узлов согласно их порядку в линейном списке");
        Node ref = node0;
        while (ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }

    }
}
