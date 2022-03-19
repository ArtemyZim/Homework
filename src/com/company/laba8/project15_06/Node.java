package com.company.laba8.project15_06;

public class Node {

    public int value;
    public Node next;
    public static Node ref;
    static int counter = 0;

    Node(int value, Node next){
        this.value = value;
        this.next = next;
    }

    public static Node createTail(int listValue){
        Node head = new Node(0, null);
        Node tail = head;
        for (int i = 0; i < listValue; i++){
            tail.next = new Node(i+1, null);
            tail = tail.next;
        }
        return head;
    }
    public static Node createHead(int listValue){
        Node head = null;
        for (int i = listValue; i >= 0; i--) {
            head = new Node(i, head);
        }
        return head;
    }
    @Override
    public String toString(){
        ref = this;
        String list = "";
        while (ref != null){
            list += ref.value + " ";
            ref = ref.next;
        }
        return list;
    }
    public static Node AddFirst(Node head, Node newHead){
        newHead = new Node(newHead.value, head);
        return newHead;
    }
    public static void AddLast(Node head, Node tail){
        ref = head;
        while (ref.next != null){
            ref = ref.next;
        }
        ref.next = tail;
    }
    public static void Insert(Node head, Node newNode, int elemPosition){
        ref = head;
        int counter = 1;
        while (ref.next != null && (counter < elemPosition)){
            ref = ref.next;
            counter++;
        }
        newNode.next = ref.next;
        ref.next = newNode;
    }
    public static Node RemoveFirst(Node head){
        head = head.next;
        return head;
    }
    public static void RemoveLast(Node head){
        ref = head;
        while (ref.next.next != null){
            ref = ref.next;
        }
        ref.next = null;
    }
    public static void Remove(Node head, int delElemPosition){
        ref = head;
        int counter = 1;
        while (ref.next != null && (counter < delElemPosition)){
            ref = ref.next;
            counter++;
        }
        ref.next = ref.next.next;
    }
    public static Node createTailRec(int listValue) {
        if (counter <= listValue){
            return new Node (counter++, createTailRec(listValue));
        }
        else
            counter = 0;
            return null;
    }
    public static Node createHeadRec(int listValue){
        if (listValue == 0){
            return null;
        }
        listValue -= 1;
        return new Node(listValue, createHeadRec(listValue));
    }
    public String toStringRec(){
        if (counter == 0){
            counter = 1;
            ref = this;
        }
        if (ref.next != null){
            String list = ref.value + " ";
            ref = ref.next;
            return list + toStringRec();
        }else
            counter = 0;
            return ref.value + " ";
    }
}
