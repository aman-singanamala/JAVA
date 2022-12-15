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
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        // CREATE A NEW LINKED LIST TO STORE THE SUM
//        ListNode result= new ListNode(0);
//        ListNode current= result;
//        int carry=0;
//        int sum=0;
//        while(l1!=null || l2!=null){
//            int x,y;
//            if(l1!=null){
//                x=l1.val;
//            }else{
//                x=0;
//            }
//            if(l2!=null){
//                y=l2.val;
//            }else{
//                y=0;
//            }
//
//            /*
//            when 13/10  carry is 1
//            and value addes to the sum is 13%10=3
//
//             */
//            sum=x+y+carry;
//            carry=sum/10;
//
//            // Add the sum to the new linked list
//            current.next= new ListNode(sum%10);
//            current=current.next;
//
//            // Move to the next digit in the input linked lists
//            if(l1!=null) l1=l1.next;
//            if(l2!=null) l2=l2.next;
//
//        }
//        // If there is a final carry over, add it to the new linked list
//        // if last 900+900=1800
//        // 1 should be added
//        if(carry>0){
//            current.next= new ListNode(carry);
//
//        /*
//        The code returns result.next because the first node of the result list was only
//        used as a placeholder, and does not contain any meaningful data.
//        By returning result.next, the actual start of the result list is returned,
//        skipping over the placeholder node.
//         */
//        }
//        return result.next;
//
//
//    }
//}