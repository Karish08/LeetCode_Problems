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
    public ListNode removeNodes(ListNode head) {
        ListNode curr = head;
        ListNode prev = null; 
        while(curr != null){
            ListNode temp = prev;
            prev = curr;
            curr = curr.next;
            prev.next = temp;
        }
        if(prev == head) return head;
        ListNode ak = new ListNode(prev.val);
        ListNode temp1 = ak;
        ListNode m = prev.next;
        int max = prev.val;
        while(m != null){
            if(max <= m.val){
                ak.next = new ListNode(m.val);
                ak = ak.next;
                max = m.val;
            }m = m.next;
        }
        // if(count == 0) return prev;
        ListNode curr1 = temp1;
        ListNode prev1 = null; 
        while(curr1 != null){
            ListNode temp3 = prev1;
            prev1 = curr1;
            curr1 = curr1.next;
            prev1.next = temp3;
        }
        return prev1;
    }
}