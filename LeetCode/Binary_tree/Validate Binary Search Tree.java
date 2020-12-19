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

//using range of parent node
class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
    public boolean validate(TreeNode root, Integer low, Integer high) {
        if(root == null) return true;
        if((high != null && root.val >= high)) return false;

        return validate(root.left, low , root.val) && validate(root.right , root.val, high);
    }
}


//Using In-order traversal
class Solution {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        boolean b = true;
        for(int i=0 ; i<list.size()-1 ; i++){
            if(list.get(i) >= list.get(i+1)){
                b = false;
            }
        }
        return b;
    }
    public void helper(TreeNode root, List<Integer> list){
        if(root != null && root.left != null)
            helper(root.left, list);
        list.add(root.val);
        if(root != null && root.right != null)
            helper(root.right, list);
    }
}