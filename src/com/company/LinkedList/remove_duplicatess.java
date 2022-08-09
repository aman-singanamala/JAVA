package com.company.LinkedList;

public class remove_duplicatess {
    private Node head;
    private Node tail;
    private int size;

    public remove_duplicatess(){
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
    public void insert(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head= newNode;
        if(tail==null){
            tail= head;
        }
        size++;
    }
    public void display(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
    }
    public void remove(){
        Node temp= head;
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next= temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        tail= temp;
        tail.next=null;
    }

    public static void main(String[] args) {
        remove_duplicatess list= new remove_duplicatess();
        list.insert(1);
        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(3);
        list.insert(4);
        list.insert(4);
        list.insert(6);
        list.remove();
        list.display();

    }

}