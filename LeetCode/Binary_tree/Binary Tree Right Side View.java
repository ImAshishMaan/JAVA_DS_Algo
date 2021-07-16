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
    
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return list;
        }
        q.add(root);
        int h = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=1 ; i<=size ; i++){
                TreeNode rn = q.remove();
                if(size == i){
                    list.add(rn.val);
                }
                if(rn.left != null){
                    q.add(rn.left);
                }
                if(rn.right != null){
                    q.add(rn.right);
                }
            }
        }
        return list;
        
    }
}