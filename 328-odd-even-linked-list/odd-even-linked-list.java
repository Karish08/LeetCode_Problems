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
    public ListNode oddEvenList(ListNode head) {
        ListNode curr = head;
        if(head == null || head.next == null) return head;
        ListNode temp = new ListNode(0);
        ListNode m = temp;
        while(curr != null && curr.next != null){
           temp.next = curr.next;
           curr.next = curr.next.next;
           temp = temp.next;
           if(curr.next == null) break;
           curr = curr.next;
        }
        if(temp.next != null) temp.next = null;
        curr.next = m.next;
        return head;
    }
}