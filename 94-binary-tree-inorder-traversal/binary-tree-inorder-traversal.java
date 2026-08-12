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
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return ak;        
        inOrder(ak, root);
        return ak;
    }
    static void inOrder(List<Integer> ak, TreeNode root){
        if(root == null) return;
        inOrder(ak, root.left);
        ak.add(root.val);
        inOrder(ak, root.right);
    }
}