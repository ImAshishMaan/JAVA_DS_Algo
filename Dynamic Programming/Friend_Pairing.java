import java.util.*;

class Friend_Pairing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int n = sc.nextInt();
        int[] dp = new int[1000];
        System.out.println(pair(n,dp));
    }
    public static int pair(int n,int[] dp){
        if(n == 1)
            return 1;

        if(n == 2)
            return 2;
        if(dp[n]!= 0)
            return dp[n];

        int sub = pair(n-1,dp) + pair(n-2,dp) * (n-1);

        return dp[n] =  sub;
    }
}