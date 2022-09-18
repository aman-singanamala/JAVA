package com.company.Random_Practice;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size= size;
    }

    private class Node{
        int data;
        Node next;

        Node(int data){
            this.data= data;
        }
        Node(int data, Node next){
            this.data= data;
            this.next= next;
        }
    }

    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node= node.next;
        }
        return node;
    }

    public void insertFirst(int data){
        Node newnode = new Node(data);
        newnode.next= head;
        head= newnode;
        if(tail==null){
            tail= head;
        }
        size++;
    }

    public void insertLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            insertFirst(data);
        }
        tail.next= newNode;
        newNode = tail;
        size++;
    }

    public void printlist(){
        Node currentNode= head;
        while(currentNode != null){
            System.out.print(currentNode.data+" ");
            currentNode= currentNode.next;
        }
    }

    public void insertMiddle(int data, int index){
        if(index==0){
            insertFirst(data);
        }
        if(index== size){
            insertLast(data);
        }
        Node temp= head;
        for(int i=1;i< index;i++){
            temp = temp.next;
        }
        Node newNode = new Node(data, temp.next);
        temp.next= newNode;
        size++;
    }

    public int deleteFirst(){
        int val = head.data;
        head= head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }


    public static void main(String[] args){
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(10);
        list.insertFirst(15);
        list.insertFirst(20);
        list.printlist();

        list.deleteFirst();
        System.out.println( );
        list.printlist();

    }


}
