package com.company.LinkedList;

import java.sql.SQLOutput;

public class PRACTICE2 {
    Node head;
    private class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data) {
            this.data = data;
        }
        public Node(int data,Node next ,Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    public Node find(int value){
        Node node= head;
        while(node!=null) {
            if (node.data == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insertFirst(int value){
        Node newNode = new Node(value);
        // join the newnode to the previous first element
        //wich has head
        newNode.next=head;
        newNode.prev=null;
        // if this is the first node you are inserting
        // Make the newNode as head
        if(head!=null){
            head.prev=newNode;
        }
        head=newNode;
    }
    public void insertLast(int value){
        Node last= head;
        Node newNode= new Node(value);
        newNode.next=null;
        if(head==null){
            newNode.prev=null;
            head=newNode;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next= newNode;
        newNode.prev=last;
    }
    public void insert(int after,int value){
        Node p= find(after);
        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node newNode= new Node(value);
        newNode.next=p.next;
        p.next=newNode;
        newNode.prev=p;
        if(newNode.next.prev!=null){
            newNode.next.prev=newNode;
        }
    }
    public void display(){
        Node node= head;
        Node last=null;
        while(node!=null){
            System.out.print(node.data+" -> ");
            last=node;
            node= node.next;
        }
        System.out.print("END");
        System.out.println();
        System.out.println ("REVERSE OF LIST : ");
        while(last!=null){
            System.out.print(last.data+" -> ");
            last=last.prev;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        PRACTICE2 dlist = new PRACTICE2();
        dlist.insertFirst(1);
        dlist.insertFirst(2);
        dlist.insertFirst(3);
        dlist.insertFirst(4);
        dlist.insertFirst(5);
        dlist.insertFirst(6);
        dlist.insertLast(11);
        dlist.insert(5,77);
        dlist.display();

    }
}
