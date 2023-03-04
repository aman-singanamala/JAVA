package com.company.LinkedList;

public class reverse_both_parts {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;

        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static Node reverse(Node head) {
        Node curr=head;
        Node prev=null;
        Node temp;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public static Node reverse(Node head, int k) {
        // code here
        Node temp=head;
        for(int i=0;i<k-1;i++){
            temp=temp.next;
        }
        Node nxt=temp.next;
        temp.next=null;
        Node rev1=reverse(head);
        Node rev2=reverse(nxt);
        temp=rev1;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=rev2;
        return rev1;

    }





    static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Node head = new Node(8);
        Node node1 = new Node(3);
        Node node2 = new Node(4);
        Node node3 = new Node(12);
        Node node4 = new Node(5);
        Node node5 = new Node(6);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        printlist(head);

        Node ans = reverse(head,2);
        printlist(ans);

    }
}