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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> ak = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            ak.add(curr.val);
            curr = curr.next;
        }
        Collections.sort(ak);
        int k = 0;
        ListNode temp = new ListNode();
        ListNode curr1 = temp;
        // k++;
        for(int i=k; i<ak.size(); i++){
            curr1.next = new ListNode(ak.get(i));
            curr1 = curr1.next;
        }
        return temp.next;
    }
}