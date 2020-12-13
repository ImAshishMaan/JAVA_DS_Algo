package Binary_Search_Tree_Challenges;

class Binary_Search_Tree{
    public class Node{
        int data;
        Node left;
        Node right;
    }
    public Node root;

    public Binary_Search_Tree(int[] arr){
        this.root = construct(arr,0,    arr.length-1);
    }
    private Node construct(int[] arr, int lo, int hi){
        if(lo > hi){
            return null;
        }

        int mid = (lo+hi)/2;
        Node nn = new Node();
        nn.data = arr[mid];

        nn.left = construct(arr,lo,mid-1);
        nn.right = construct(arr,mid+1,hi);

        return nn;

    }
    public void display(){
        display(root);
    }
    private void display(Node node){
        if(node == null){
            return;
        }
        if(node.left != null)
            System.out.print(node.left.data + " -> " );
        else
            System.out.print(" . -> ");

        System.out.print(node.data);

        if(node.right != null)
            System.out.print(" <- "+node.right.data);
        else
            System.out.print(" <- . ");
        System.out.println();
        display(node.left);
        display(node.right);
    }
    public static void main(String[] args){

        int[] arr = {10,20,30,40,50,60,70};
        Binary_Search_Tree tree = new Binary_Search_Tree(arr);

        tree.display();

    }

}