package Binary_Search_Tree_Challenges;
import java.util.*;

class generic_tree{
    private class Node{
        int data;
        ArrayList<Node> children;
        Node(int data){
            this.data = data;
            this.children = new ArrayList<>();
        }
    }
    private Node root;
    private int size = 0;

    generic_tree(){
        Scanner s = new Scanner(System.in);
        this.root = takeinput(s, null, 0);
    }
    private Node takeinput(Scanner s, Node parent, int ithchild){
        if(parent==null){
            System.out.println("Enter root node");
        }else{
            System.out.println("Enter the data for the "+ithchild+"th child of "+parent.data);
        }
        int nodedata = s.nextInt();
        Node node =new Node(nodedata);
        this.size++;

        System.out.println("Enter no. of children for "+ node.data);
        int children = s.nextInt();
        for(int i=0; i<children; i++){
            Node child = this.takeinput(s , node,i);
            node.children.add(child);
        }
        return node;
    }
    public void display(){
        this.display(this.root);
    }
    private void display(Node node){
        String str=node.data+"=>";
        for(int i=0; i<node.children.size() ; i++){
            str = str + node.children.get(i).data+", ";
        }
        str = str +"END";
        System.out.println(str);
        for(int i=0; i<node.children.size() ; i++){
            this.display(node.children.get(i));
        }
    }

    public static void main(String[] args){
        //60 3 41 2 17 0 16 0 15 1 21 0 24 2 33 0 84 0
        generic_tree tree = new generic_tree();
        tree.display();
    }
}