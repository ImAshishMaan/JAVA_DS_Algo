//        Given K painters to paint N boards where each painter takes 1 unit of time to paint 1 unit of boards i.e. if the
//        length of a particular board is 5, it will take 5 units of time to paint the board. Compute the minimum amount of
//        time to paint all the boards.
//
//        Note that:
//
//        Every painter can paint only contiguous segments of boards.
//        A board can only be painted by 1 painter at maximum.
//
//        Input Format
//
//        First line contains K which is the number of painters. Second line contains N which indicates the number of boards.
//        Third line contains N space separated integers representing the length of each board.
//        Constraints
//
//        1 <= K <= 10
//        1 <= N <= 10
//        1<= Length of each Board <= 10^8
//        Output Format
//
//        Output the minimum time required to paint the board.
//        Sample Input
//
//        2
//        2
//        1 10
//
//        Sample Output
//
//        10

package Array_Challenges;

import java.util.*;

class Painters_partition_problem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(paintersproblem(arr,k));
    }
    public static int paintersproblem(int[] arr, int k){
        int lo = getmax(arr);
        int hi = getsum(arr);
        int minTime = 0;
        while(lo<=hi){
            int mid = (lo+hi)/2;

            int paintercount = getpaintersno(arr, mid);
            if(paintercount > k){
                lo = mid +1;
            }else{
                hi = mid-1;
                minTime = mid;
            }
        }
        return minTime;
    }

    private static int getsum(int[] arr) {
        int sum = 0;
        for(int val : arr){
            sum += val;
        }
        return sum;
    }

    private static int getmax(int[] arr) {
        int max = 0;
        for(int val : arr){
            max = Math.max(val,max);
        }
        return max;
    }

    public static int getpaintersno(int[] arr, int maxSize){
        int total = 0;
        int painters = 1;
        for(int i=0 ; i < arr.length; i++){
            total += arr[i];
            if(total>maxSize){
                painters++;
                total = arr[i];
            }
        }
        return painters;
    }
}