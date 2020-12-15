package Binary_Search_Tree_Challenges;

import java.util.*;
class Level_order_zigzag{

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Level_order_zigzag m = new Level_order_zigzag();
        BinaryTree bt = m.new BinaryTree();
        bt.levelOrderZZ();
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree() {
            this.root = this.takeInput(null, false);
        }

        public Node takeInput(Node parent, boolean ilc) {

            int cdata = scn.nextInt();
            Node child = new Node();
            child.data = cdata;
            this.size++;

            // left
            boolean hlc = scn.nextBoolean();

            if (hlc) {
                child.left = this.takeInput(child, true);
            }

            // right
            boolean hrc = scn.nextBoolean();

            if (hrc) {
                child.right = this.takeInput(child, false);
            }

            // return
            return child;
        }

        public void levelOrderZZ(){
            Node node = this.root;
            Stack<Node> s1 = new Stack<>();
            Stack<Node> s2 = new Stack<>();
            List<Integer> list = new ArrayList<>();
            s1.push(node);
            while (!s1.isEmpty() || !s2.isEmpty()){
                while (!s1.isEmpty()){
                    Node n = s1.pop();
                    list.add(n.data);
                    if(n.left != null){
                        s2.push(n.left);
                    }
                    if(n.right != null){
                        s2.push(n.right);
                    }
                }
                while (!s2.isEmpty()){
                    Node n = s2.pop();
                    list.add(n.data);
                    if(n.right != null){
                        s1.push(n.right);
                    }
                    if(n.left != null){
                        s1.push(n.left);
                    }
                }
            }
            for(int l : list){
                System.out.print(l + " ");
            }
            }
        }
    }

