package Stack_and_Queues;

import java.util.*;

class First_non_repeating_char{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        HashMap<Character, Integer> hash = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();

        while(ch!='.'){
            queue.add(ch);
            if(hash.containsKey(ch)){
                 hash.put(ch,hash.get(ch)+1);
            }else{
                hash.put(ch,1);
            }
            while(!queue.isEmpty()){
                char fc = queue.peek();
                if(hash.get(fc)==1){
                    System.out.println(fc);
                    break;
                }else{
                    queue.remove();
                }
            }
            if(queue.isEmpty()){
                System.out.println("-1");
            }
            ch = sc.next().charAt(0);
        }
    }
}