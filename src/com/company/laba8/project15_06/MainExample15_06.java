package com.company.laba8.project15_06;

public class MainExample15_06 {
    public static void main(String[] args) {

        Node head;
        head = Node.createHead(5);
        System.out.println("После создания списка");
        System.out.println(head.toString());

        Node node1 = new Node(8, null);
        Node.AddLast(head, node1);
        System.out.println("После добавлеия элемента в конец списка");
        System.out.println(head.toString());

        Node.RemoveLast(head);
        System.out.println("После того как удалили последний элемент из списка");
        System.out.println(head.toString());

        Node node2 = new Node(15, null);
        Node.Insert(head, node2, 3);
        System.out.println("После того как вставили элемент в 3 позицию");
        System.out.println(head.toString());

        Node.Remove(head, 3);
        System.out.println("После того, как удалили 3 элемент из списка");
        System.out.println(head.toString());

        Node head2;
        head2 = Node.createTailRec(10);
        System.out.println("Создаем однонаправленный список через рекурсию");
        System.out.println("И выводим его через рекурсивный метод");
        System.out.println(head2.toStringRec());
    }
}
