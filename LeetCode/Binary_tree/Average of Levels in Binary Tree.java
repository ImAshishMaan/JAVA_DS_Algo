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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return list;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            Double l = 0.0;
            for(int i=0 ; i<size ; i++){
                TreeNode rn = q.remove();
                l += rn.val;
                if(rn.left != null)
                    q.add(rn.left);
                if(rn.right != null)
                    q.add(rn.right);
                
            }
            list.add(l/size);
        }
        return list;
    }
}