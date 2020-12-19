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
    public boolean hasPathSum(TreeNode root, int sum) {
        int res = 0;
        return helper(root,sum,res);

    }
    public boolean helper(TreeNode root, int sum, int res){
        if(root == null){
            return false;
        }else if(root.left == null && root.right ==null && sum==(res+root.val)){
            return true;
        }else{
            return helper(root.left, sum, res+root.val) || helper(root.right, sum, res+root.val);
        }
    }
}