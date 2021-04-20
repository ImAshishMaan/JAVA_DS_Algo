import java.util.*;
class fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[1000];
        //System.out.println(fib(n,dp));
        //System.out.println(fibBU(n));
        System.out.println(fibSpaceOPT(n));

    }
    //Top Down approach
    public static int fib(int n,int[] dp){
       if(n == 0 || n == 1){
           return n;
       }
       if(dp[n]!=0){
           return dp[n];
       }
       int ans;
       ans = fib(n-1,dp) + fib(n-2,dp);
       dp[n] = ans;
       return ans;
    }
    //bottom up approach
    public static int fibBU(int n){
        if(n ==1 || n == 0){
            return n;
        }
        int[] dp = new int[1000];
        dp[1] = 1;
        for(int i=2 ; i<=n ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    //space optimization O(1)
    public static int fibSpaceOPT(int n){
        if(n == 1 || n == 0){
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i=2 ; i <= n ; i++){
            c = a +b;
            a = b;
            b = c;
        }
        return c;
    }
}