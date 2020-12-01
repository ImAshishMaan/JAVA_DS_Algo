package Recursion_Challenges;

import java.util.*;
class lower_bound_index{
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,2,2,5,6};
        int[] arr2 = {1,3,3,4,2,2,5,6};
        System.out.println(lower_index(arr1,0,2));
        System.out.println(lower_index(arr2,0,2));
    }
    public static int lower_index(int[] arr, int si, int data){
        if(si == arr.length-1){
            return -1;
        }
        if(arr[si]==data)
            return si;
        int index = lower_index(arr, si+1, data);
        return index;
    }
}