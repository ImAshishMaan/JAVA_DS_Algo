package Recursion_Challenges;

import java.util.*;

class Nth_Fibonacci{
    public static void main(String[] args){
        System.out.println(getFibonacci(5));
    }
    public static int getFibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib1 = getFibonacci(n-1);
        int fib2 = getFibonacci(n-2);
        int f = fib1 + fib2;
        return f;

    }
}