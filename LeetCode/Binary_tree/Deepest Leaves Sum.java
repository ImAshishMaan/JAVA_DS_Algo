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
    public int deepestLeavesSum(TreeNode root) {
        int sum = 0;
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return sum;
        }
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            sum = 0;
            for(int i=0 ; i<size ; i++){
                TreeNode rn = q.remove();
                sum += rn.val;
                if(rn.left != null){
                    q.add(rn.left);
                }
                if(rn.right != null){
                    q.add(rn.right);
                }
            }
        }
        return sum;
    }
}