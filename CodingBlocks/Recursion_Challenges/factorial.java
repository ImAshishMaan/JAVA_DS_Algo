package Recursion_Challenges;

import java.util.*;
class factorial{
    public static void main(String[] args){
        System.out.println(getFactorial(4));
        System.out.println(getFactorial(6));
    }
    public static int getFactorial(int n){
        if(n==0){
            return 1;
        }
        int fact = getFactorial(n-1);
        int f = fact * n;
        return f;
    }
}