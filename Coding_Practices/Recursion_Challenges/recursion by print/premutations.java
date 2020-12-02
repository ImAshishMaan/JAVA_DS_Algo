package Recursion_print;

import java.util.*;
class premutations{
    public static void main(String[] args){
        printper("abc"," ");

    }
    public static void printper(String que, String ans){
        if(que.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0 ; i<que.length(); i++){
            char c = que.charAt(i);
            String roq = que.substring(0,i)+ que.substring(i+1);
            printper(roq, ans+c);
        }
    }
}