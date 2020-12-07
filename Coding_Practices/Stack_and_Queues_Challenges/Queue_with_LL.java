package Stack_and_Queues;

import java.util.LinkedList;

class Queue_with_LL{
    LinkedList<Integer> queue;

    Queue_with_LL(){
        queue = new LinkedList<>();
    }

    public boolean isempty(){
        return queue.isEmpty();
    }
    public void enqueue(int data){
        queue.addLast(data);
    }
    public void denqueue(){
        queue.removeFirst();
    }
    public int getfront(){
        return queue.getFirst();
    }
    public static void main(String[] args){
        Queue_with_LL ql = new Queue_with_LL();
        for(int i=1 ; i<=5 ; i++){
            ql.enqueue(i);
        }
        ql.denqueue();
        ql.denqueue();
        ql.enqueue(8);
        while(!ql.isempty()){
            System.out.println(ql.getfront());
            ql.denqueue();
        }
    }
}