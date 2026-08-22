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
    public boolean isPalindrome(ListNode head) {        
        int n = 0;
        for(ListNode curr = head; curr != null; curr = curr.next){
            n++;
        } 
        n /= 2;
        ListNode curr = head;
        ListNode temp = new ListNode(0);
        for(int i = 0;i<n; i++){
            curr = curr.next;
        }
        temp.next = curr;
        curr = null; 
        // print(head);
        ListNode prev = null;
        curr = temp;
        while(curr != null){
            ListNode temp1 = prev;
            prev = curr;
            curr = curr.next;
            prev.next = temp1;
        }
        // print(prev);
        for(int i = 0; i<n; i++){
            if(head.val != prev.val) return false;
            head = head.next;
            prev = prev.next;
        }
        return true;
    }
    // void print(ListNode m){
    //     ListNode curr = m;
    //     if(m == null) {
    //         System.out.print("null");
    //         return;
    //     }
    //     while(curr != null){
    //         System.out.print(curr.val + "->");
    //         curr = curr.next;
    //     }System.out.print("null");
    //     System.out.println();
    // }
}