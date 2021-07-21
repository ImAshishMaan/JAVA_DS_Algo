class Solution {
    public int helper(int N,int[] dp){
        if(N == 1){
            return 0;
        }
        if(dp[N] != 0)
            return dp[N];
        else{
            for(int i=1 ; i*i<=N ; i++){
                if(N%i == 0){
                    if(helper(N-i,dp) == 0)
                        return dp[N]=1;
                    if((i!=1) && helper(N-(N/i),dp) == 0)
                        return dp[N]=1;
                }
            }
            return dp[N] = 0;
        }
    }
    public boolean divisorGame(int n) {
        
        int[] dp = new int[1001];
        int p = helper(n,dp);
        if(p == 1){
            return true;
        }
        return false;
    }
}