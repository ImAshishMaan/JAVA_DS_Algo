package Stack_and_Queues;

import java.util.*;

class DynamicStack extends stack_by_array{
    public DynamicStack() throws Exception{
        this(DEFAULT_CAPACITY);
    }
    public DynamicStack(int capacity) throws Exception{
        super(capacity);
    }

    public void push(int item) throws Exception {
        if(this.size()==this.data.length){
            int[] arr = new int[2*this.data.length];
            for(int i=0 ; i<this.size();i++){
                arr[i] = this.data[i];
            }
            this.data = arr;
        }
        super.push(item);
    }
    public static void main(String[] args) throws Exception {
        stack_by_array s = new DynamicStack();
        for(int i=1 ; i<=12; i++){
            s.push(i * 10);
        }
        s.display();
        stack_by_array helper = new stack_by_array(s.size());
        reversestack(s,helper,0);
        s.display();
    }
}
