package beginner;

import java.util.*;

class Enormous_input_test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        for(int i = 0 ; i<n ; i++){
            int x = sc.nextInt();
            if(x % k ==0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}