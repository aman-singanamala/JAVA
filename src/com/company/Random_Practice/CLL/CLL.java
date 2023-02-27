package com.company.Random_Practice.CLL;

public class CLL {
    private class Node {
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;
        }

        tail.next = newnode;
        newnode.next = head;
        tail = newnode;


    }

    public void delete(int val) {
        Node curr = head;
        if (curr == null) {
            System.out.println("List is empty");
            return;
        }

        if(curr.data==val){
            head= head.next;
            tail.next=head;
        }

        do{
            Node n= curr.next;
            if(n.data== val){
                curr.next= n.next;
                break;
            }
            curr=curr.next;
        }while(curr!=head);
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        do {
            System.out.print(curr.data + "->");
            curr = curr.next;
        } while (curr != head);
        System.out.print("HEAD");
    }

    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.display();
        System.out.println();
        list.delete(5);
        list.display();


    }
}


