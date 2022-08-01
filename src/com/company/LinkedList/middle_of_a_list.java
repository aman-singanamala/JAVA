package com.company.LinkedList;

public class middle_of_a_list {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public int getSize(){
        int size=0;
        Node temp= head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }

    public void insertNode(int value){
        Node newNode= new Node(value);
        newNode.next= head;
        head= newNode;
    }
    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.println("END");
    }
    public void displayMiddle(){
        if(head!=null){
            int len= getSize();
            Node temp= head;
            int mid= len/2;
            while(mid!=0){
                temp=temp.next;
                mid--;
            }
            System.out.println("Middle element is : "+temp.data);
        }
    }

    public static void main(String[] args) {
        middle_of_a_list list = new middle_of_a_list();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);

        list.display();
        System.out.println(list.getSize());
        list.displayMiddle();
    }





}

