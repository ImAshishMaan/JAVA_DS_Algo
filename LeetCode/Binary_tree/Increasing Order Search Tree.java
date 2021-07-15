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
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root,list);
        TreeNode ans = new TreeNode(0);
        TreeNode head = ans;
        for(int i : list){
            ans.right = new TreeNode(i);
            ans = ans.right;
        }
        return head.right;
    }
    public void helper(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }
}