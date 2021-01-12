import java.util.*;
class kanpsack_recursion{
    public static void main(String[] args){

        int[] prices = {40,20,30,100};
        int[] weights = {1,2,3,5};
        int N = 4;
        int C = 7;
        System.out.println(knapsack(prices, weights, N, C));
    }
    public static int knapsack(int[] pr, int[] wt, int N, int C){
        if(N == 0 || C == 0){
            return 0;
        }
        int inc = 0 , exc = 0;

        if(wt[N-1] <= C){
            inc = pr[N-1] + knapsack(pr,wt,N-1,C-wt[N-1]);
        }
        exc = knapsack(pr,wt,N-1,C);

        return Math.max(inc,exc);
    }
}