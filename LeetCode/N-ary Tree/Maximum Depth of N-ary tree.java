/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    private int maxd;
    public int maxDepth(Node root) {
        if(root == null)
            return 0;
        
        getmax(root,1);
        return maxd;
    }
    public void getmax(Node node, int depth){
        if(node == null){
            return;
        }
        maxd = Math.max(depth, maxd);
        for(Node c : node.children)
            getmax(c, depth+1);
    }
}
