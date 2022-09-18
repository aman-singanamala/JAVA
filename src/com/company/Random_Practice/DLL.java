package com.company.Random_Practice;

public class DLL {
    Node head;
    private class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data= data;
        }
        public Node(int data, Node next, Node prev){
            this.data= data;
            this.next= next;
            this.prev= prev;
        }
    }
//    public Node find(int value){
//
//    }
    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next= head;
        newNode.prev= null;
        if(head!=null) {
            head.prev = newNode;
        }
        head= newNode;
    }
    public void print(){
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

    public static void main(String[] args){
        DLL list = new DLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.print();
    }


}
