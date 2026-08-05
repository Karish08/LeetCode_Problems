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
    public int[] nextLargerNodes(ListNode head) {
        int left = 0;
        int right = 0;
        int n = 0;
        ListNode curr = head;
        while(curr != null){
            n++;
            curr = curr.next;
        }
        int ak[] = new int[n];
        int kb[] = new int[n];
        curr = head;
        int k = 0; 
        while(curr != null){
            ak[k++] = curr.val;
            curr = curr.next;
        }
        // int i = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(ak[i] < ak[j]){
                    kb[i] = ak[j];
                    break;
                }
            }
        }
        return kb;
    }
}