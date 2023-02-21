package com.company.Random_Practice.DLL;

public class dll_1 {
    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head;

    public void insertfirst(int val) {
        Node newnode = new Node(val);
        newnode.next = head;
        newnode.prev = null;
        if (head != null) {
            head.prev = newnode;
        }
        head = newnode;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr=curr.next;
        }
        System.out.print("END");
        System.out.println();
    }
    public void displayreverse(){
        Node curr= head;
        while(curr.next!=null){
            curr= curr.next;
        }

        while(curr!=null){
            System.out.print(curr.data+"->");
            curr= curr.prev;
        }


    }

    public static void main(String[] args) {
        dll_1 list = new dll_1();
        list.insertfirst(17);
        list.insertfirst(8);
        list.insertfirst(2);
        list.insertfirst(3);
        list.display();
        list.displayreverse();
    }
}
