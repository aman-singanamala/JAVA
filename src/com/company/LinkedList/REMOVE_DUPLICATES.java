package com.company.LinkedList;

import java.util.HashSet;

public class REMOVE_DUPLICATES {
    private Node head;
    private Node tail;
    private int size;
    public REMOVE_DUPLICATES(){
        this.size=size;
    }
    private class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data= data;
            this.next= next;
        }
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public void insert(int val){
        // Create a new node with data is val
        Node newNode = new Node(val);
        // Point the next pointer to head of the new node
        newNode.next=head;
        // head always points to starting node
        head= newNode;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void Remove(){
        Node node= head;
        while(node.next!=null){
            if(node.data == node.next.data){
                node.next=node.next.next;
                size--;
            }
            else{
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");

            temp=temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        REMOVE_DUPLICATES list = new REMOVE_DUPLICATES();
        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(3);
        list.insert(3);

        list.display();
        list.Remove();
        list.display();
    }
}
