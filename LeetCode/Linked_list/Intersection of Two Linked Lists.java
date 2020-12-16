/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sa = 1;
        int sb = 1;
        ListNode a = headA;
        while(a !=null){
            a = a.next;
            sa++;
        }
        ListNode b = headB;
        while(b !=null){
            b = b.next;
            sb++;
        }
        ListNode ac = headA;
        ListNode bc = headB;
        int diff = Math.abs(sa-sb);
        if(sa > sb){
            for(int i=0 ; i<diff ; i++){
                ac = ac.next;
            }
        }else{
            for(int i=0 ; i<diff ; i++){
                bc = bc.next;
            }
        }
        while(ac != bc){
            ac = ac.next;
            bc = bc.next;
            if(ac == null || bc == null){
                return null;
            }
        }
        return ac;
    }
}