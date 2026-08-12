/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> ak = new ArrayList<>();    
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) return ak;
        postOrder(ak, root);
        // int a = 0;
        return ak;
    }
    public void postOrder(List<Integer> ak, TreeNode root){
        if(root == null) return;
        postOrder(ak, root.left);
        postOrder(ak, root.right);
        // System.out.println(a);
        ak.add(root.val);
    }
}