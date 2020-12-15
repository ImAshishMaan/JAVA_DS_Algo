package Binary_Search_Tree_Challenges;

import java.util.*;
class is_identical{

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        is_identical m = new is_identical();
        BinaryTree bt1 = m.new BinaryTree();
        BinaryTree bt2 = m.new BinaryTree();
        System.out.println(bt1.structurallyIdentical(bt2));
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

        public boolean structurallyIdentical(BinaryTree other) {
            return this.structurallyIdentical(this.root, other.root);
        }

        private boolean structurallyIdentical(Node p, Node q) {
            // write your code here
            if(p == null && q == null)
                return true;
            else if(p == null || q== null)
                return false;
            else if(p.data != q.data)
                return false;
            else
                return structurallyIdentical(p.left, q.left) && structurallyIdentical(p.right, q.right);

        }

    }
}
