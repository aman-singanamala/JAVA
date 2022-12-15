///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) { val = x; }
// * }
// */
//class Solution {
//// in given example 4->5->1->9
//// we just need to turn node 5 into node 1
//
//    public void deleteNode(ListNode node) {
//        //checking the node is not a tail
//        if(node==null || node.next==null){
//            return;
//        }
//        node.val=node.next.val;
//        node.next= node.next.next;
//    }
//}