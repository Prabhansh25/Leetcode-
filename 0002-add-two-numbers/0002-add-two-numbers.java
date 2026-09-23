/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy ;
        int carry = 0 ;
        while( l1 != null || l2 != null || carry != 0){
            int Sum = 0 ;
            if(l1 != null){
                Sum += l1.val ;
                l1 = l1.next ;
            }
            if(l2 != null){
                Sum += l2.val ;
                l2 = l2.next ;
            }
            Sum += carry ;
            carry = Sum/10 ;
            ListNode node = new ListNode(Sum%10) ;
            temp.next = node ;
            temp = temp.next ;
        }
        return dummy.next ;
    }
}