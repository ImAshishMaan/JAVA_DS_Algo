package Recursion_Challenges;

import java.util.*;
class is_Array_Sorted{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr,0));
    }
    public static boolean isSorted(int[] arr, int si){
        if(si == arr.length-1){
            return true;
        }
        if(arr[si]>arr[si+1]){
            return false;
        }
        boolean is = isSorted(arr, si+1);
        return is;
    }
}