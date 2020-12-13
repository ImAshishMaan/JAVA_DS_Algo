package Stack_and_Queues;

class Queue_using_2stack_dequeue{
    DynamicStack primary;
    DynamicStack secondary;

    public Queue_using_2stack_dequeue() throws Exception {
        this.primary = new DynamicStack();
        this.secondary = new DynamicStack();
    }

    public boolean isEmpty(){
        return this.primary.isEmpty();
    }
    public int size(){
        return this.primary.size();
    }
    public void enqueue(int data) throws Exception {
        while(!this.primary.isEmpty()){
            this.secondary.push(this.primary.pop());
        }
        this.primary.push(data);
        while(!this.secondary.isEmpty()){
            this.primary.push(this.secondary.pop());
        }
    }
    public int dequeue() throws Exception {
        return this.primary.pop();
    }
    public int front() throws Exception {
        return this.primary.top();
    }
    public void display(){
        this.primary.display();
    }

    public static void main(String[] args) throws Exception {
        Queue_using_2stack_dequeue queue = new Queue_using_2stack_dequeue();
        for(int i=1 ; i<=5; i++){
            queue.enqueue(i*10);
        }
        queue.display();

    }
}