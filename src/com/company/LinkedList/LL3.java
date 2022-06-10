package com.company.LinkedList;

public class LL3 {
    private Node head;
    private Node tail;
    private int size;
    public LL3 (){
        this.size=0;
    }


    public void insertFirst(int val){
        Node node= new Node(val); // create a new node with value = val
        node.next=head; //assign the new node's next to head;
        head= node; // head always points to starting node .
        if(tail ==null){
            tail=head;
        }
        size=size+1;
    }

    public void insertLast(int val){// we can insert at last with constant time complexity (use of tail)
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node= new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp= head;
        for (int i = 1; i <index ; i++) {
            temp=temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next=node;
        size++;
    }

    public int deleteFirst(){
        int val= head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.print("End");
    }

    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
            this.next=null;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        LL3 list = new LL3();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertLast(99);
        list.insert(100,3);
        list.display();
        System.out.println();
        System.out.println(list.deleteFirst());
        list.display();
    }
}
