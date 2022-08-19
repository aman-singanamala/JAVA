package com.company.Random_Practice;

public class LL_MIDDLE {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;

        }
    }
    public void insert(int data){
        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
        }
        newNode.next=head;
        head= newNode;
    }
    public void printNOde(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }
    public int getLen(){
        int len=0;
        Node temp = null;
        while(temp!=null){
            len++;
            temp= temp.next;
        }
        return len;
    }


    public static void main(String[] args) {
        LL_MIDDLE list = new LL_MIDDLE();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.printNOde();

    }
}
