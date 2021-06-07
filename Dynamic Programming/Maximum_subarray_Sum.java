import java.util.*;
 class Maximum_subarray_Sum{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int[] arr = new int[]{-3,2,5,-1,6,3,-2,7,-5,2};
         int[] dp = new int[10000];
         System.out.println(subarr(arr,dp));
     }
     public static int subarr(int[] arr,int[] dp){

         dp[0] = Math.max(arr[0], 0);
         int max_so_far = dp[0];
         for(int  i=1 ;i<arr.length ; i++){
             dp[i] = dp[i-1] + arr[i];
             if(dp[i] < 0){
                 dp[i] = 0;
             }
             max_so_far = Math.max(dp[i], max_so_far);
         }
         return max_so_far;
     }
 }