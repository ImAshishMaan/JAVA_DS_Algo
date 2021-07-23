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
    TreeNode xparent,yparent;
    int xh,yh;
    public boolean isCousins(TreeNode root, int x, int y) {
        
        
        helper(root,x,y,null,0);
        if(xh == yh && xparent != yparent){
            return true;
        }
        return false;
        
    }
    public void helper(TreeNode root, int x, int y, TreeNode parent, int h){
        if(root == null)
            return;
        if(root.val == x){
            xparent = parent;
            xh = h;
        }
        if(root.val == y){
            yparent = parent;
            yh = h;
        }
        helper(root.left,x,y,root,h+1);
        helper(root.right,x,y,root,h+1);
    }
}