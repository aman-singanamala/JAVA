package com.company.Random_Practice;

public class LL {
    private Node head;
    private Node tail;
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

    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node= node.next;
        }
        return node;
    }

    public void insertFirst(int data){
        Node newnode = new Node(data);
        newnode.next= head;
        head= newnode;
        if(tail==null){
            tail= head;
        }
        size++;
    }

    public void insertLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            insertFirst(data);
        }
        tail.next= newNode;
        newNode = tail;
        size++;
    }

    public void printlist(){
        Node currentNode= head;
        while(currentNode != null){
            System.out.print(currentNode.data+" ");
            currentNode= currentNode.next;
        }
    }

    public void insertMiddle(int data, int index){
        if(index==0){
            insertFirst(data);
        }
        if(index== size){
            insertLast(data);
        }
        Node temp= head;
        for(int i=1;i< index;i++){
            temp = temp.next;
        }
        Node newNode = new Node(data, temp.next);
        temp.next= newNode;
        size++;
    }

    public int deleteFirst(){
        int val = head.data;
        head= head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public void reverse(){
        if(size<2){
            return ;
        }
        Node prev= null;
        Node present = head;
        Node next= present.next;
        while(present!= null){
            present.next= prev;
            prev= present;
            present= next;
            if(next!=null){
                next = next.next;
            }
        }
        head= prev;
    }
    public Node addTwonumbers(Node l1, Node l2){
        Node result= new Node(0);
        Node current=result;
        // Set up variables to track the carry over and the current sum
        int carry=0;
        int sum=0;
        // Traverse both input linked lists at the same time, adding the values
        // of the nodes at each position and storing the result in the new linked list
        while(l1!=null || l2!=null){
            int x,y;
            x = l1 != null ? l1.data : 0;
            y= l2 != null ? l2.data : 0;

            sum= carry+x+y;
            carry=sum/10;
            /*
            when 13/10  carry is 1
            and value addes to the sum is 13%10=3

             */

            // Add the sum to the new linked list
            current.next=new Node(sum%10);
            current=current.next;

            // Move to the next digit in the input linked lists
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
       }
        // If there is a final carry over, add it to the new linked list
        // if last 900+900=1800
        // 1 should be added

        if(carry>0){
            current.next=new Node(carry);
        }
        return result.next;
        /*
        The code returns result.next because the first node of the result list was only
        used as a placeholder, and does not contain any meaningful data.
        By returning result.next, the actual start of the result list is returned,
        skipping over the placeholder node.
         */

    }


    public Node Intersectionoflists(Node headA, Node headB){
        int lenA=getLength(headA);
        int lenB=getLength(headB);
        int diff= Math.abs(lenA-lenB);
        if (lenA>lenB){
            for(int i=0;i<diff;i++){
                head=head.next;
            }
        } else if (lenB>lenA) {
            for (int i = 0; i < diff; i++) {
                headB=headB.next;
            }
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;

    }
    public int getLength(Node head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }


    public static void main(String[] args){
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(10);
        list.insertFirst(15);
        list.insertFirst(20);
        list.printlist();

        //list.deleteFirst();
        System.out.println( );

        list.reverse();
        list.printlist();
    }


}
