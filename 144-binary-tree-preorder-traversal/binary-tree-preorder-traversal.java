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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) return ak;
        preOrder(ak, root);
        return ak;
    }
    private void preOrder(List<Integer> ak, TreeNode root){
        if(root == null) return;
        ak.add(root.val);
        preOrder(ak, root.left);
        preOrder(ak, root.right);
    }
}