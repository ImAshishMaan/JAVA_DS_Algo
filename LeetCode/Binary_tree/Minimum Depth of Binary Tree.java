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
    public int minDepth(TreeNode root) {
        return helper(root);
    }
    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = helper(root.left);
        int r = helper(root.right);
        if(l == 0)
            return r+1;
        
        if(r == 0)
            return l+1;
        return Math.min(l,r)+1;
    }
}