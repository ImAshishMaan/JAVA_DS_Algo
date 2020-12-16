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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        ListNode h = head;
        int si = 1;
        while(h.next != null){
            h = h.next;
            si++;
        }

        k %= si;
        if(k==0){
            return head;
        }

        h.next = head;
        int n = si-k;
        while(n>0){
            h = h.next;
            n--;
        }
        head = h.next;
        h.next = null;

        return head;

    }
}