package Binary_Search_Tree_Challenges;

import java.util.*;
class Is_Balanced {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        Is_Balanced m = new Is_Balanced();
        BinaryTree bt = m.new BinaryTree();
        System.out.println(bt.isBalanced());
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

        public boolean isBalanced() {
            return this.isBalanced(this.root) != null;
        }

        private Integer isBalanced(Node node) {
            // write your code here
            if(node == null){
                return 1;
            }
            Integer lh = isBalanced(node.left);
            Integer rh = isBalanced(node.right);

            if(lh == null || rh == null){
                return null;
            }
            if(Math.abs(lh-rh) > 1){
                return null;
            }
            return Math.max(lh,rh)+1;
        }
    }
}
