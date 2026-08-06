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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr = head;
        int n = 0;
        while(curr != null){
           n++;
           curr = curr.next;
        }
        int ak[] = new int[n];
        curr = head;
        int ind  =0;
        while(curr != null){
             ak[ind++] = curr.val;
             curr = curr.next;
        }
        for(int i=0; i <= n-k;i+=k){
           int left = i;
           int right = i + k - 1;
           while(left < right){
               int temp = ak[left];
               ak[left]  = ak[right];
               ak[right] = temp;
               left++;
               right--;
           }
        }
        // System.out.println(Arrays.toString(ak));
        ListNode m = new ListNode(0);
        ListNode temp = m;
        for(int i : ak){
           m.next = new ListNode(i);
           m = m.next;
        } 
        return temp.next;
    }
}