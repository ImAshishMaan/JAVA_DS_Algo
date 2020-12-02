//        You are given two integers n and k. Find the greatest integer x, such that, x^k <= n.
//
//        Input Format
//
//        First line contains number of test cases, T. Next T lines contains integers, n and k.
//
//        Constraints
//
//        1<=T<=10
//        1<=N<=10^15
//        1<=K<=10^4
//
//        Output Format
//
//        Output the integer x
//
//        Sample Input
//
//        2
//        10000 1
//        1000000000000000 10
//
//        Sample Output
//
//        10000
//        31
//
//        Explanation
//
//        For the first test case, for x=10000, 10000^1=10000=n

package Array_Challenges;
import java.util.*;
class KTH_ROOT {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            long n = scn.nextLong(), k = scn.nextLong();

            if(k==1){
                System.out.println(n);;
                continue;
            }
            long lo = 1, hi = 1000000, ans = -1;
            while(lo<=hi) {
                long mid = (lo+hi)/2;
                long var=1;
                for(int i=1;i<=k;i++)
                {
                    var*=mid;
                    if(var>n)
                    {
                        break;
                    }
                }
                if(var == n) {
                    ans = mid;
                    break;
                } else if (var < n) {
                    ans = mid;
                    lo=mid+1;
                } else {
                    hi=mid-1;
                }
            }
            System.out.println(ans);;
        }
    }
}