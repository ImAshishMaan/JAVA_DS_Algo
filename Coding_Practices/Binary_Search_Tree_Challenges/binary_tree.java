package Binary_Search_Tree_Challenges;
import java.util.*;

public class binary_tree{
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    private Node root = null;
    private int size = 0;
    binary_tree(){
        Scanner s = new Scanner(System.in);
        this.root = takeinput(s , null , false);
    }
    private Node takeinput(Scanner s ,Node parent, boolean isleftorright){
        if(parent == null){
            System.out.println("Enter the data for root node ");
        }else{
            if(isleftorright){
                System.out.println("Enter the data for the left child of "+parent.data);
            }else{
                System.out.println("Enter the data for the right child of "+parent.data);
            }
        }
        int nodedata = s.nextInt();
        Node node = new Node(nodedata,null,null);
        this.size++;
        boolean choice = false;
        System.out.println("Do you want left child of "+nodedata);
        choice = s.nextBoolean();
        if(choice){
            node.left = takeinput(s,node,true);
        }
        choice = false;
        System.out.println("Do you want right child of "+nodedata);
        choice = s.nextBoolean();
        if(choice){
            node.right = takeinput(s,node,false);
        }
        return node;
    }
    public void display(){
        this.display(this.root);
    }
    private void display(Node node){
        String str = "";
        if(node.left!=null){
            str = str + node.left.data +" =>";
        }else{
            str = str + "END =>";
        }
        str = str+node.data;
        if(node.right!=null){
            str = str +"<= "+ node.right.data;
        }else{
            str = str + "<= END";
        }
        System.out.println(str);
        if(node.left!=null){
            this.display(node.left);
        }
        if(node.right!= null){
            this.display(node.right);
        }
    }
    public int height(){
        return this.height(this.root);
    }
    private int height(Node node){
        if(node==null){
            return -1;
        }
        int lheight = this.height(node.left);
        int rheight = this.height(node.right);

        int height = Math.max(lheight,rheight)+1;
        return height;
    }
    public void preorder(){
        this.preorder(this.root);
    }
    private void preorder(Node node){
        if(node==null)
            return;
        System.out.print(node.data+", ");
        preorder(node.left);
        preorder(node.right);
    }
    public void inorder(){
        this.inorder(this.root);
        System.out.println("END");
    }
    private void inorder(Node node){
        if(node==null){
            return;
        }
        inorder(node.left);
        System.out.print(node.data+", ");
        inorder(node.right);
    }
    public void postorder(){
        this.postorder(this.root);
        System.out.println("END");
    }
    private void postorder(Node node){
        if(node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + ", ");

    }
    public void levelorder(){
        levelorder(this.root);
    }
    private void levelorder(Node node){
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node rv = queue.removeFirst();
            System.out.print(rv.data+", ");
            if(rv.left != null){
                queue.addLast(rv.left);
            }
            if(rv.right != null){
                queue.addLast(rv.right);
            }
        }
    }
    public static void main(String[] args){
        // 50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false
        binary_tree tree = new binary_tree();
        tree.display();
        //System.out.println("Height of the tree is "+tree.height());
        //tree.preorder();
        //System.out.println();
        tree.inorder();
        //System.out.println();
        //tree.postorder();
        //tree.levelorder();
    }
}