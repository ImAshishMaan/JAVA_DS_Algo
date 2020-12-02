package Recursion_Challenges;

import java.util.*;
class upper_bound_index{
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,2,2,5,6};
        int[] arr2 = {1,3,3,4,2,1,5,6};
        System.out.println(method1(arr1, arr1.length-1,2));
        System.out.println(method1(arr2, arr1.length-1,2));
        System.out.println(method2(arr1, 0,2));
        System.out.println(method2(arr2, 0,2));
    }
    //Method 1 : Using finding from reverse.
    public static int method1(int[] arr, int si, int data){
        if(si==0){
            return -1;
        }
        if(arr[si]==data){
            return si;
        }
        int index = method1(arr, si-1, data);
        return index;
    }
    //Method 2 : Using finding from front.
    public static int method2(int[] arr, int si, int data){
        if(si==arr.length-1)
            return -1;
        int index = method2(arr,si+1, data);
        if(index==-1){
            if(arr[si]==data){
                return si;
            }else{
                return -1;
            }
        }
        return index;
    }
}