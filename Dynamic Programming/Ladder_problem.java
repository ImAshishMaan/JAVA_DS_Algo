import java.util.*;
class Ladder_problem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] dp = new int[1000];
        System.out.println(steps(n,k,dp) + " Ways");
    }
    public static int steps(int n,int k,int[] dp){
        if(n == 0){
            return 1;
        }
        if(dp[n] != 0)
            return dp[n];

        int step = 0;
        for(int i=1 ; i <= k ;i++){
            if(n >= i)
                step = step + steps(n-i,k,dp);
        }
        return dp[n] = step;
    }
}