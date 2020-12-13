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
    public boolean find(int item){
        return find(this.root, item);
    }
    public boolean find(Node node, int item){
        if(node == null){
            return false;
        }
        if(item > node.data){
            return find(node.right, item);
        }else if(item < node.data){
            return find(node.left, item);
        }else{
            return true;
        }
    }
    public int max(){
        return max(this.root);
    }
    public int max(Node node){
        if(node.right == null){
            return node.data;
        }
        return max(node.right);
    }

    public int min(){
        return min(this.root);
    }
    public int min(Node node){
        if(node.left == null){
            return node.data;
        }
        return min(node.left);
    }

    public void add(int item){
        add(this.root, item);
    }
    public void add(Node node, int item){
        if(item < node.data){
            if(node.left == null){
                Node nn = new Node();
                nn.data = item;
                node.left = nn;
            }else{
                add(node.left, item);
            }
        }else{
            if(node.right == null){
                Node nn = new Node();
                nn.data = item;
                node.right = nn;
            }else{
                add(node.right, item);
            }
        }
    }

    public static void main(String[] args){

        int[] arr = {10,20,30,40,50,60,70};
        Binary_Search_Tree tree = new Binary_Search_Tree(arr);

        tree.display();
        //System.out.println(tree.find(70));
        //System.out.println(tree.max());
        //System.out.println(tree.min());
        System.out.println("---------------------------");
        tree.add(100);
        tree.display();

    }

}