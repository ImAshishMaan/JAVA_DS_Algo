package Recursion_print;

import java.util.*;

class Board_path{
    public static void main(String[] args){
        //printpath(0," ",10);
        System.out.println(printcount(0,10));
    }
    public static void printpath(int curr, String ans,int end){
        if(curr==end){
            System.out.println(ans);
            return;
        }
        if(curr>end){
            return;
        }
        for(int i=1 ; i<=6; i++){
            printpath(curr+i,ans+i,end);
        }
    }
    public static int printcount(int curr,int end){
        if(curr==end){
            return 1;
        }
        if(curr>end){
            return 0;
        }
        int count = 0;
        for(int i=1 ; i<=6; i++){
            count += printcount(curr+i,end);
        }
        return count;
    }
}