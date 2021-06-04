import java.util.*;

class minstep{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[10000];
        System.out.println(min(n,dp));
    }
    public static int min(int n,int[] dp){
        //Base case
        if(n == 1){
            return 0;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        int opt1, opt2, opt3;
        opt1 = opt2 = opt3 = Integer.MAX_VALUE;
        if(n % 3 == 0){
            opt1 = min(n/3,dp) + 1;
        }
        if(n % 2 == 0){
            opt2 = min(n/2,dp) + 1;
        }
        opt3 = min(n-1,dp) + 1;

        int ans =0;
        ans = ans + Math.min(Math.min(opt1,opt2),opt3);
        return dp[n] = ans;

    }
}