package Recursion_Challenges;

import java.util.*;

class power{
    public static void main(String[] args){
        System.out.println(getPower(2,6));
        System.out.println(getPower(2,5));
    }
    public static int getPower(int x, int y){
        if(y==0){
            return 1;
        }
        int pow = getPower(x,y-1);
        int p = pow * x;
        return p;
    }
}