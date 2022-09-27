package com.company.Random_Practice.File;

public class LL {
    private Node head;
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
    public void insertFirst(int val){
        Node newNode= new Node(val);
        newNode.next= head;
        head= newNode;
        size++;
    }
    public void insertLast(int val){
        Node newNode = new Node(val);
        if(head==null){
            insertFirst(val);
            return;
        }
        newNode.next=null;
        Node temp= head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next= newNode;
        return;
    }
    public void printlist(){
        Node curr= head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr= curr.next;
        }
        System.out.print("END");
    }
    public static LL mergeLists(LL first, LL second){
        Node f= first.head;
        Node s= second.head;
        LL ans = new LL();

        while(f!=null && s!= null){
            if(f.data<=s.data){
                ans.insertLast(f.data);
                f=f.next;
            }else{
                ans.insertLast(f.data);
                s=s.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.data);
            f=f.next;
        }
        while(s!=null){
            ans.insertLast(s.data);
            s=s.next;
        }
        return ans;
    }
    public static void main(String[] args){
        LL list1= new LL();
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(3);
        list1.insertLast(4);
        list1.insertLast(5);


        LL list2= new LL();
        list2.insertLast(10);
        list2.insertLast(15);
        list2.insertLast(20);
        LL ans= LL.mergeLists(list1, list2);
        ans.printlist();

    }
}
