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
import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr = l1;
        ListNode curr1 = l2;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        while(curr != null){
            sb.append(curr.val);
            curr = curr.next;
        }
        while(curr1 != null){
            sb1.append(curr1.val);
            curr1 = curr1.next;
        }
        BigInteger m = new BigInteger(sb.toString());
        BigInteger m1 = new BigInteger(sb1.toString());
        BigInteger res = m.add(m1);
        String ans = res.toString();
        //  System.out.println(res);
        ListNode ak = new ListNode(0);
        ListNode temp = ak;
        for(int i=0; i<ans.length(); i++){
            temp.next = new ListNode(ans.charAt(i) - '0');
            temp = temp.next;
        }
        return ak.next;
    }
}