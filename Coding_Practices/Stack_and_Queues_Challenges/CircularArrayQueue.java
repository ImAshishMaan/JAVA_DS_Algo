package Stack_and_Queues;

class CircularArrayQueue{
    private int[] arr;
    private int cs;
    private int ms;
    private int front;
    private int rear;


    public static int DEFAULT_CAPACITY=5;

    CircularArrayQueue(){
        this(DEFAULT_CAPACITY);
    }
    CircularArrayQueue(int capacity){
        this.arr = new int[capacity];
        this.cs = 0;
        this.ms = capacity;
        this.front = 0;
        this.rear = capacity-1;
    }
    public boolean isfull(){
        return this.cs==this.ms;
    }
    public boolean isempty(){
        return this.cs==0;
    }
    public void enqueue(int data){
        if(!this.isfull()){
            this.rear = (this.rear+1)%this.arr.length;
            this.arr[this.rear]= data;
            this.cs++;
        }else{
            System.out.println("queue is full");
        }
    }
    public void deenqueue(){
        if(!this.isempty()){
            this.front = (this.front+1)%this.arr.length;
            this.cs--;
        }
    }
    public int getfront(){
        return this.arr[this.front];
    }
    public int length(){
        return this.arr.length;
    }
    public static void main(String[] args){
        CircularArrayQueue cq = new CircularArrayQueue();
        for(int i=1; i<=5;i++ ){
            cq.enqueue(i);
        }
//        cq.deenqueue();
//        cq.deenqueue();
        cq.enqueue(8);
        System.out.println(cq.length());
        while(!cq.isempty()){
            System.out.println(cq.getfront());
            cq.deenqueue();
        }
    }
}