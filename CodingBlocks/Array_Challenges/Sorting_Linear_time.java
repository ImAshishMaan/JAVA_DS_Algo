//You will be given an array containing only 0s, 1s and 2s. you have sort the array in linear time that is O(N) where N is the size of the array.
//        Input Format
//
//        The first line contains N, which is the size of the array. The following N lines contain either 0, or 1, or 2.
//
//        Constraints
//
//        1 <= N <= 10^6
//        Each input element x, such that x ∈ { 0, 1, 2 }.
//
//        Output Format
//
//        Output the sorted array with each element separated by a newline.
//
//        Sample Input
//
//        5
//        0
//        1
//        2
//        1
//        2
//
//        Sample Output
//
//        0
//        1
//        1
//        2
//        2

package Array_Challenges;

import java.util.*;

class Sorting_Linear_time{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<n ; i++){
            System.out.println(arr[i]);
        }

    }
}