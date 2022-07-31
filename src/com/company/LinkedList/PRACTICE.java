package com.company.LinkedList;
public class PRACTICE {
    private Node head;
    private Node tail;
    private int size;
    public PRACTICE(){
        this.size=size;
    }
    private class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data= data;
            this.next= next;
        }
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public void insert(int val){
        // Create a new node with data is val
        Node newNode = new Node(val);
        // Point the next pointer to head of the new node
        newNode.next=head;
        // head always points to starting node
        head= newNode;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insertLast(int val){
        //if tail is empty call the insert first function
        if(tail==null){
            insert(val);
            return;
        }
        Node newNode= new Node(val);
        tail.next= newNode;
        newNode=tail;
        size++;
    }
    // O(N)
//    public void insertLast(int val){
//        Node newNode = new Node(val);
//        if(head==null){
//            insert(val);
//            return;
//        }
//        Node temp= head;
//        while(temp.next!=null){
//            temp=temp.next;
//        }
//        temp.next= newNode;
//    }
    public void insertIndex(int val,int index){
        if(index==0){
            insert(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp= head;
        //start for-loop from 1 because 0th index is 1 itself

        for(int i=1;i<index;i++){
            temp= temp.next;
        }

        Node newNode = new Node(val,temp.next);
        // now to insert , point temp to newNode
        temp.next= newNode;
        size++;
    }
    public int deleteFirst(){
        int val= head.data;
        head= head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    //Find the node with a given value O(n)
    public Node find(int value){
        Node node= head;
        while(node!=null){
            if(node.data==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    // get the node at a given index
    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast= get(size-2);
        int val= tail.data;

        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }

    public int deleteIndex(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val=prev.next.data;
        prev.next= prev.next.next;
        size--;
        return val;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");

            temp=temp.next;
        }
        System.out.println("END");
    }


    //insert using recursion
    public void insertRecursion(int val,int index){

    }






    public static void main(String[] args) {
        PRACTICE list = new PRACTICE();
//        list.insert(11);
//        list.insert(12);
//        list.insert(13);
//        list.insert(14);
//        list.insertLast(15);
//        list.insertIndex(10,0);
//        list.insertIndex(16,6);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);
        list.display();
        //4 -> 3 -> 2 -> 1 -> END
        System.out.println("Item deleted at first is : "+list.deleteFirst());
        list.display();
        System.out.println("Item deleted at last is : "+list.deleteLast());
        list.display();
        System.out.println("Item deleted at index 5 is :"+list.deleteIndex(5));
        list.display();
        System.out.println(list.size);
        Node a= list.find(4);
        System.out.println(a.data);

    }
}
