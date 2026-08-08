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
    public ListNode insertionSortList(ListNode head) {
        ListNode curr = head;
        ArrayList<Integer> ak = new ArrayList<>();
        while(curr != null){
            ak.add(curr.val);
            curr = curr.next;
        }
        Collections.sort(ak);
        ListNode m = new ListNode(0);
        curr = m;
        for(int i : ak){
            curr.next = new ListNode(i);
            curr = curr.next;
        }return m.next;
    }
}