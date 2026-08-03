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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;
        ArrayList<Integer> ak = new ArrayList<>();
        while(curr != null){
            ak.add(curr.val);
            curr = curr.next;
        }
        int n = ak.size();
        Collections.swap(ak, k-1, n-k);
        ListNode temp = new ListNode(0);
        ListNode m = temp;
        for(int i : ak){
            m.next = new ListNode(i);
            m = m.next;
        }
        return temp.next;
    }
}