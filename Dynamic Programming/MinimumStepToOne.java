import java.util.*;
class MinimumStepToOne{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int dp[] = new int[1000];
        //System.out.println(minSteps(n,dp));
        System.out.println(minStepsBU(n));
    }
    public static int minSteps(int n, int[] dp){
        if(n == 1){
            return 0;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        int opt1,opt2,opt3;
        opt1 = opt2 = opt3 = Integer.MAX_VALUE;

        if(n%3 == 0){
            opt1 = minSteps(n/3, dp) + 1;
        }
        if(n%2 == 0){
            opt2 = minSteps(n/2 , dp) + 1;
        }
        opt3 = minSteps(n-1, dp) + 1;

        int ans = Math.min(Math.min(opt1,opt2),opt3);
        return dp[n] = ans;
    }
    public static int minStepsBU(int n){
        int dp[] = new int[100];
        dp[1] = 0;

        for(int i=2; i<=n ; i++ ){
            int opt1, opt2, opt3;
            opt1 = opt2 = opt3 = Integer.MAX_VALUE;
            if(n % 3 == 0){
                opt1 = dp[i/3];
            }
            if(n % 2 == 0){
                opt2 = dp[i/2];
            }
            opt3 = dp[i-1];

            dp[i] = Math.min(Math.min(opt1,opt2),opt3) + 1;
        }
        return dp[n];
    }
}