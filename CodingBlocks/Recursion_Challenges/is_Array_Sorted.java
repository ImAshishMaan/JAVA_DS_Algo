package Recursion_Challenges;

import java.util.*;
class is_Array_Sorted{
    public static void main(String[] args){
        int[] arr1 = {2,3,4,5,6};
        int[] arr2 = {2,3,4,5,1};
        System.out.println(isSorted(arr1,0));
        System.out.println(isSorted(arr2,0));
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