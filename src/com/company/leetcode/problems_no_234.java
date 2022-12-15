//* Definition for singly-linked list.
//        * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode() {}
// *     ListNode(int val) { this.val = val; }
// *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// * }
// */
//class Solution {
//    public boolean isPalindrome(ListNode head) {
//        ListNode slow=head;
//        ListNode fast=head;
//        while(fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//
//        ListNode revofSecondHalf=reverse(slow);
//        ListNode firstHalf=head;
//        while(revofSecondHalf!=null){
//            if(firstHalf.val!=revofSecondHalf.val){
//                return false;
//            }
//            firstHalf=firstHalf.next;
//            revofSecondHalf=revofSecondHalf.next;
//
//        }
//        return true;
//
//
//
//    }
//    static ListNode reverse(ListNode node){
//        ListNode prev=null;
//        ListNode present=node;
//
//        while(present!=null){
//            ListNode next= present.next;
//            present.next=prev;
//            prev=present;
//            present=next;
//        }
//        return prev;
//    }
//}


