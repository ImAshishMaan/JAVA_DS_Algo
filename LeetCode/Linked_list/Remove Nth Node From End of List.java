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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l = head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int s = 0;
        while(l!= null){
            l = l.next;
            s++;
        }
        int si = s-n;

        l = dummy;
        while(si>0){
            si--;
            l = l.next;
        }

        l.next = l.next.next;
        return dummy.next;
    }
}