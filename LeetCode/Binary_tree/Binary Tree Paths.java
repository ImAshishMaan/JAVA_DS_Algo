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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        
        if(root == null){
            return list;
        }
        String str = "";
        helper(root,str,list);
        return list;
    }
    public void helper(TreeNode root,String str, List<String> list){
        if(root == null){
            return;
        }
        str += root.val;
        if(root.left == null && root.right == null){
            list.add(str);
        }
        helper(root.left,str + "->", list);
        helper(root.right,str + "->", list);
        
        
    }
}