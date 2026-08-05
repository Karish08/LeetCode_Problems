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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        for(ListNode m : lists){
            if(m !=null) pq.offer(m);
        }
        ListNode m = new ListNode(0);
        ListNode temp = m;
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            temp.next = node;
            temp = temp.next;

            if (node.next != null)
            {
                pq.offer(node.next);
            }
        }
        return m.next;
    }
}