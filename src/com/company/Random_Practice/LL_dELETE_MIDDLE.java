package com.company.Random_Practice;

public class LL_dELETE_MIDDLE {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data= data;
        }
        Node(int data, Node next){
            this.data=data;
            this.next=next;
        }
    }
    public void pushNode(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head= newNode;
    }
    public void print(){
        Node curr= head;
        while(curr!= null){
            System.out.println(curr.data+" ");
            curr= curr.next;
        }
    }
    public int getlen(){
        int len=0;
        Node curr = head;
        while(curr!= null){
            len++;
            curr=curr.next;
        }
        return len;
    }
    public void deletemiddle(){

    }


}
