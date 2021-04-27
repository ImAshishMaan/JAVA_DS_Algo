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
        int c = 0;
        int value = 0;
        ListNode l3 = new ListNode();
        int sum=0;
        ListNode head = l3;
        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + c;
            c = sum/10;
            value = sum %10;
            ListNode temp = new ListNode();
            temp.val = value;
            l1 = l1.next;
            l2 = l2.next;
            l3.next = temp;
            l3 = temp;
        }
        while(l1 != null){
            sum = l1.val + c;
            c = sum/10;
            value = sum %10;
            ListNode temp = new ListNode();
            temp.val = value;
            l1 = l1.next;
            l3.next = temp;
            l3 = temp;
        }
        while(l2 != null){
            sum = l2.val + c;
            c = sum/10;
            value = sum %10;
            ListNode temp = new ListNode();
            temp.val = value;
            l2 = l2.next;
            l3.next = temp;
            l3 = temp;
        }
        if(c != 0){
            ListNode temp = new ListNode();
            temp.val = c;
            l3.next = temp;
            l3 = temp;
        }
        return head.next;
    }
}