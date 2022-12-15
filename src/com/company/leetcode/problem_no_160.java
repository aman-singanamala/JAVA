///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) {
// *         val = x;
// *         next = null;
// *     }
// * }
// */
//public class Solution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        // get the lengths of the two lists
//        int lenA=getLength(headA);
//        int lenB=getLength(headB);
//        // calculate the difference in lengths
//        int diff= Math.abs(lenA-lenB);
//
//        // move the longer list forward by the difference in lengths
//        if(lenA>lenB){
//            for(int i=0;i<diff;i++){
//                headA=headA.next;
//            }
//        }else if(lenB>lenA){
//            for(int i=0;i<diff;i++){
//                headB=headB.next;
//            }
//        }
//        // move both lists forward until they intersect
//        while(headA!=headB){
//            headA=headA.next;
//            headB=headB.next;
//        }
//        return headA;
//    }
//    // function to get the length of a linked list
//    static int getLength(ListNode head){
//        int len=0;
//        while(head!=null){
//            len++;
//            head=head.next;
//        }
//        return len;
//    }
//}