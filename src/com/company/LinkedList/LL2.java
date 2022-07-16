package com.company.LinkedList;


public class LL2 {
    static Node head;
    private static int size;
    LL2(){
        this.size=0;
    }
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("Null");
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
// Size

        size--;

        // move the head to next node
        // node1 | node2 | node3 |
        // head--> newHead
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        // single Node

        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastNode= head.next;
        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL2 list = new LL2();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        list.addFirst("d");
        System.out.println(list.getSize());
    }


}
