// PMO gives two random numbers a & b to the Prime Minister. PM Modi wants to visit all countries between a and b (inclusive)
// However due to shortage of time he can't visit each and every country , So PM Modi decides to visit only those countries,
// for which country number has two divisors. So your task is to find number of countries Mr. Modi will visit.
//
//        Input Format
//
//        The first line contains N , no of test cases. The next N lines contain two integers a and b denoting the range of country numbers.
//        Constraints
//
//        a<=1000000 & b<=1000000.
//        N<=1000
//        Output Format
//
//        Output contains N lines each containing an answer for the test case.
//        Sample Input
//
//        2
//        1 10
//        11 20
//
//        Sample Output
//
//        4
//        4
//
//        Explanation
//
//        PM Modi chooses countries with numbers 2,3,5 and 7 for the first testcase.
//        For the second testcase , he chooses countries with numbers 11,13,17 and 19.

package Array_Challenges;

import java.util.*;

class Prime_Visits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        for(int i=0 ; i<n ; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            int p[] = new int[1000000];

            for(int j=3 ; j<=1000000 ; j +=2){
                p[j] = 1;
            }
            for(long j =3 ; j<1000000; j += 2){
                if(p[(int) j]==1){
                    for(long k = j*j ; k< 100000 ; k +=j)
                        p[(int) k] = 0;
                }
            }
            p[2] = 1;
            p[1] = p[0] = 0;
            int count=0;
            for(long a = x; a <= y ; a++){
                if(p[(int)a]==1) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

