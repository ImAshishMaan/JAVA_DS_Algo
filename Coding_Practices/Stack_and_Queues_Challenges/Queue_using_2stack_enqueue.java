package Stack_and_Queues;

import java.util.*;

class Queue_using_2stack_enqueue{
    private DynamicStack primary;
    private DynamicStack secondary;

    private Queue_using_2stack_enqueue() throws Exception {
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
        this.primary.push(data);
    }

    public int dequeue() throws Exception {
        while(primary.size()!=1){
            this.secondary.push(primary.pop());
        }
        int rv = primary.pop();
        while(!secondary.isEmpty()){
            primary.push(secondary.pop());
        }
        return rv;
    }

    public int front() throws Exception {
        while(primary.size()!=1){
            this.secondary.push(primary.pop());
        }
        int rv = primary.top();
        while(!secondary.isEmpty()){
            primary.push(secondary.pop());
        }
        return rv;
    }

    public void display() throws Exception {
        reversestack(primary,secondary,0);
        primary.display();
        reversestack(primary,secondary,0);
    }
    private static void reversestack(DynamicStack stack, DynamicStack helper,int index) throws Exception {
        if(stack.isEmpty()){
            return;
        }
        int item = stack.pop();
        reversestack(stack,helper, index+1);
        helper.push(item);
        if(index==0){
            while(!helper.isEmpty()){
                stack.push(helper.pop());
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Queue_using_2stack_enqueue queue = new Queue_using_2stack_enqueue();
        for(int i=1 ; i<=5 ; i++){
            queue.enqueue(i*10);
        }
        queue.display();
        System.out.println(queue.dequeue());
        queue.display();
    }
}