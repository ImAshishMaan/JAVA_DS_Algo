package Stack_and_Queues;

class stack_by_array{
    protected int[] data;
    protected int top;

    public static final int DEFAULT_CAPACITY = 10;
    public stack_by_array() throws Exception {
        this(DEFAULT_CAPACITY);
    }

    public stack_by_array(int capacity) throws Exception {
        if(capacity<1){
            throw new Exception("Invalid Capacity");
        }
        this.data = new int[capacity];
        this.top = -1;
    }

    public int size(){
        return this.top+1;
    }
    public boolean isEmpty(){
        return this.size()==0;
    }

    public void push(int value) throws Exception {
        if(this.size()==this.data.length){
            throw new Exception("Stck is full");
        }
        this.top++;
        this.data[this.top] = value;

    }
    public int pop() throws Exception {
        if(this.size()==0){
            throw new Exception("Stack is empty");
        }

        int rv = this.data[this.top];
        this.data[this.top] = 0;
        this.top--;
        return rv;
    }
    public int top() throws Exception {
        if(this.size()==0){
            throw new Exception("Stack is empty");
        }

        int rv = this.data[this.top];
        return rv;
    }
    public void display() {
        for (int i = this.top; i >= 0; i--) {
            System.out.print(this.data[i] + ", ");
        }
        System.out.println("END");
    }
    public static void main(String[] args) throws Exception {
        stack_by_array s = new stack_by_array(5);
        for(int i=1 ; i<=5; i++){
            s.push(i * 10);
        }
        s.display();
        stack_by_array helper = new stack_by_array(s.size());
        reversestack(s,helper,0);
        s.display();
    }
    public static void reversestack(stack_by_array s, stack_by_array helper,int index) throws Exception {
        if(s.isEmpty()){
            return;
        }
        int item = s.pop();
        reversestack(s,helper,index+1);
        helper.push(item);
        if (index == 0) {
            while (!helper.isEmpty()){
                s.push(helper.pop());
            }
        }

        //        for(int i=s.top; i>=0 ; i--){
//            helper.push(s.data[i]);
//        }
//        for(int i=helper.top; i>=0 ; i--){
//            s.push(helper.data[i]);
//        }
    }
}













































