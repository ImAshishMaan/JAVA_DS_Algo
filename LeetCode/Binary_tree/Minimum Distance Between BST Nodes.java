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
    int difference = Integer.MAX_VALUE;
    ArrayList<Integer> list = new ArrayList<>();
    public int minDiffInBST(TreeNode root) {
        traverseTree(root);
        System.out.print(list);
        for(int i=0;i<list.size()-1;i++) {
            if(Math.abs(list.get(i) - list.get(i+1)) < difference) {
                difference = Math.abs(list.get(i) - list.get(i+1));
            }
        }
        return difference;
    }
    
    void traverseTree(TreeNode root) {       
        if(root == null) {
            return;
        }        
        traverseTree(root.left);
        list.add(root.val);
        traverseTree(root.right);
    }
}