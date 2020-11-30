package Recursion_Challenges;

import java.util.*;

class recursion_basics_questions{
    public static void main(String[] args){
//        System.out.println(fact(4));
//        System.out.println(power(2,5));
//        System.out.println(fib(5));
//        int[] arr = {3,8,1,8,8,7};
//        System.out.println(isSorted(arr, 0));
//        System.out.println(firstIndex(arr, 0, 8));
//        System.out.println(lastIndex(arr, 0, 8));
//        System.out.println(lastIndex(arr, arr.length-1, 8));
//        pattern(5,1,1);
//        int[] ar = {50,40,30,20,10};
//        bubbleSort(ar,0,ar.length-1);
//        display(ar);
        int[] arr = {3,8,1,8,8,4};
        int [] ar = allIndices(arr,0,8,0);
        display(ar);
    }
    public static int fact(int n){
        if(n==1)
            return 1;
        int fnm1 = fact(n-1);
        int fn = n * fnm1;
        return fn;
    }
    public static int power(int x, int n){
        if(n==0)
            return 1;
        int po = power(x, n-1);
        int p = po * x;
        return p;
    }
    public static int fib(int n){
        if(n==0 || n==1)
            return n;
        int fib1 = fib(n-1);
        int fib2 = fib(n-2);
        int fb = fib1 + fib2;
        return fb;

    }
    public static boolean isSorted(int[] arr, int si){
        if(si == arr.length - 1)
            return true;

        if(arr[si]>arr[si+1]) {
            return false;
        }else{
            boolean rest = isSorted(arr, si+1);
            return rest;
        }
    }
    public static int firstIndex(int[] arr, int si, int data){
        if(si == arr.length - 1)
            return -1;
        if(arr[si]==data){
            return si;
        }else{
            int first = firstIndex(arr,si+1,data);
            return first;
        }
    }
    public static int lastIndex(int[] arr, int si, int data){
        if(arr.length - 1 == si){
            return -1;
        }
        int index = lastIndex(arr, si+1, data);
        if(index == -1){
            if(arr[si] == data){
                return si;
            }else{
                return -1;
            }
        }else {
            return index;
        }


//        if(si < 0)
//            return -1;
//        if(arr[si] == data){
//            return si;
//        }else{
//            int last = lastIndex(arr,si-1,data);
//            return last;
//        }
    }
    public static void pattern(int n, int row, int col){
        if(row>n){
            return;
        }
        if(col > row){
            System.out.println();
            pattern(n, row+1, 1);
            return;
        }

        System.out.print("*");
        pattern(n,row,col+1);
    }
    public static void bubbleSort(int[] arr, int si, int li){
        if(li==0){
            return;
        }
        if(si==li){
            bubbleSort(arr,0,li-1);
            return;
        }
        if(arr[si]>arr[si+1]){
            int temp = arr[si];
            arr[si] = arr[si+1];
            arr[si+1] = temp;
        }
        bubbleSort(arr,si+1,li);
    }
    public static void display(int[] arr){
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
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