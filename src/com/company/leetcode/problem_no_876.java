///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//    public ListNode middleNode(ListNode head) {
//        if(head==null){
//            return null;
//        }
//        // Use two pointers, slow and fast, to find the middle node
//        // The slow pointer moves one node at a time, while the fast pointer
//        // moves two nodes at a time. This way, when the fast pointer reaches
//        // the end of the linked list, the slow pointer will be at the middle
//        ListNode slow = head;
//        ListNode fast=head;
//        while(fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        return slow;
//    }
//
//
//}