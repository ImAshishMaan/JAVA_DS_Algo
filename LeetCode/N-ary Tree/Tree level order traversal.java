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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> l = new ArrayList<>();
        Queue<Node> que = new LinkedList<>();
        
        if(root == null){
            return l;
        }
        que.add(root);
        while(!que.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = que.size();
            for(int i=0 ; i<size ; i++){
                Node n = que.poll();
                list.add(n.val);
                for(Node c : n.children){
                    que.add(c);
                }
            }
            l.add(list);
        }
        return l;
    }
  
}
