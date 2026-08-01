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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
         ListNode curr = head;
         if(head == null || head.next == null) return head;
        //  ListNode ak = new ListNode(0);
        //  ListNode temp = ak;
         while(curr.next != null){
             int gcd = GCDOf(curr.val, curr.next.val);
             ListNode ak = new ListNode(gcd);
             ak.next = curr.next;
             curr.next = ak;
             curr = curr.next.next;
         }
         return head;
    }
    static int GCDOf(int a, int b){
        if(b == 0) return a;
        return GCDOf(b, a % b);
    }
}