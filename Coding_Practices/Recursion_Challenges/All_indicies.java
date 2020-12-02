package Recursion_Challenges;

import java.util.*;

class All_indicies{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] ar= allIndices(arr,0,m,0);
        for(int a : ar){
            System.out.print(a+" ");
        }

    }
    public static int[] allIndices(int[] arr, int si, int data, int count){
        if(si==arr.length){
            int[] base = new int[count];
            return base;
        }
        int[] indices = null;
        if(arr[si] == data){
            indices = allIndices(arr,si+1, data, count+1);
        }else{
            indices = allIndices(arr,si+1, data, count);
        }
        if(arr[si]==data){
            indices[count] = si;
        }
        return indices;
    }
}