package com.company.Random_Practice.Sortings_algorithms;

public class linkedlistsort {

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = null;
        }
    }

    static ListNode sort(ListNode A) {
        if (A == null || A.next == null) {
            return A;
        }

        ListNode slow = A;
        ListNode fast = A.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Example
        /*
        8 -> 3 -> 4 -> 12 -> 5 -> 6 -> null

        after above while loop
        slow pointer points to 4 and
        fast pointer points to null , so it terminates
         */

        ListNode secondHalf = slow.next;
        slow.next=null;
        // for breking the list
        /*
        In the context of merge sort on a linked list,
        the slow pointer is used to find the middle node of the list.
        Once the middle node is found, it needs to be detached from the second half of the list,
        which starts from secondHalf.
        This is because we need to divide the original list into
        two separate lists to sort them individually.

The first half of the list is already being sorted recursively by the merge sort function.
The second half of the list, starting from secondHalf,
will be passed to the same function to be sorted recursively.
         */

        ListNode left= sort(A);
        ListNode right= sort(secondHalf);

        return merger(left, right);

    }

    static ListNode merger(ListNode A, ListNode B) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (A != null && B != null) {
            if (A.val <= B.val) {
                current.next = A;
                A = A.next;
                current= current.next;
            } else {
                current.next = B;
                B = B.next;
                current= current.next;
            }


        }
        while (A != null) {
            current.next = A;
            A = A.next;
        }

        while (B != null) {
            current.next = B;
            B = B.next;
        }

        return dummy.next;
    }

    static void printlist(ListNode A){


        while(A!=null){
            System.out.print(A.val+"->");
            A= A.next;
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(8);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(12);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode ans= sort(head);
        printlist(ans);

    }

}