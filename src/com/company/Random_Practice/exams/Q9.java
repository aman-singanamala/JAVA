package com.company.Random_Practice.exams;
import java.util.Scanner;
public class Q9 {
    static Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
        }
    }
    public int returnmiddle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null &&  fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public void insert(int value){
        Node newNode= new Node(value);
        newNode.next= head;
        head= newNode;
    }
    public void display(){
        Node curr= head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.print("END");
    }
    public static void main(String[] args) {
        int n;
        Q9 ll= new Q9();
        Scanner in = new Scanner(System.in);
        n= in.nextInt();
        for (int i = 0; i < n; i++) {
            ll.insert(in.nextInt());
        }
        int ans= ll.returnmiddle();
        ll.display();
        System.out.println();
        System.out.println(ans);
    }
}