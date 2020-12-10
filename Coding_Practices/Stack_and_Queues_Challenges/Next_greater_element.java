package Stack_and_Queues;

import java.util.*;

class Next_greater_element{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int j;
        boolean flag = false;
        for(int i=0 ; i<arr.length ; i++){
            stack.push(arr[i]);
            for(j=i+1 ; j<arr.length; j++) {
                if(arr[j] > stack.peek()) {
                    stack.pop();
                    System.out.print(arr[j]+" ");
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                while(!stack.isEmpty()) {
                    System.out.print("-1 ");
                    stack.pop();
                }
            }
            flag = false;
        }
    }
}