package com.company.Random_Practice;

import com.company.LinkedList.middle_of_a_list;

public class LL_middle {
    Node head;
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
        Node(int data, Node next){
            this.data= data;
            this.next=next;
        }
    }
    public void pushNode(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head= newNode;
    }
    public int getsize(){
        Node curr= head;
        int size=0;
        while(curr!=null){
            size++;
            curr= curr.next;
        }
        return size;
    }
    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.println("END");
    }
    public void returnmiddle() {
        if (head != null) {
            int length = getsize();
            Node temp = head;
            int middle = length / 2;
            while (middle != 0) {
                temp = temp.next;
                middle--;
            }
            System.out.println(temp.data);
        }
    }
    public static void main(String[] args){
        LL_middle list = new LL_middle();
        list.pushNode(5);
        list.pushNode(4);
        list.pushNode(3);
        list.pushNode(2);
        list.pushNode(1);
        list.display();
        list.returnmiddle();
    }
}
