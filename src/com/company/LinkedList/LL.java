package com.company.LinkedList;
import java.io.*;
//---------------------------------------------------------
public class LL {
    static Node head; //head of the list
    // Linked List Node
    // This class is static, so we can access anywhere [in main()]
    static class Node{
        String data;
        Node next;
        //Constructor
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    // add -first----------------------------------------
    public  void addFirst(String data){
        //Create a new node with given Data
        Node newNode= new Node(data);
        newNode.next=null;

        // if the Linked List is empty make the new node as head
        if(head==null){
            head= newNode;
            return;
        }
        //if already a list exists
        newNode.next=head;
        head= newNode;
    }
    // add -last---------------------------------------------
    public void addLast(String data){
        //Create a new node with given Data
        Node newnode= new Node(data);
        // if the Linked List is empty make the new node as head
        if(head==null){
            head= newnode;
            return;
        }
        // Create a new Node for traversing (with same to head)
        Node currentNode= head;
        while(currentNode.next!=null){
            currentNode= currentNode.next;
        }
        currentNode.next=newnode;
    }
    // print -----------------------------------------------------
    public void printlist(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node currentNode= head;
        while(currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode= currentNode.next;
        }
        System.out.println("NULL");
    }
    // main() -----------------------------------------------------
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("Apple");
        list.addFirst("Bat");
        list.printlist();
        list.addLast("Cat");
        list.printlist();
    }
}
