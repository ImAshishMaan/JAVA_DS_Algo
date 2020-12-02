package Recursion_print;

import java.util.*;
class subsequence{
    public static void main(String[] args){
        printss("abc"," ");
    }
    public static void printss(String str,String result){
        if(str.length()==0){
            char[] c = result.toCharArray();
            ArrayList<Character> ch = new ArrayList<>();
            for(int i=0 ; i<c.length; i++){
                if(c[i]!= ' '){
                    char x = c[i];
                    ch.add(x);
                }
            }
            for(int i=0 ; i<ch.size();i++){
                int a = ch.get(i);
                System.out.print(ch.get(i) + " "+ a +" ");
            }
            System.out.println();
            return;
        }
        char cc= str.charAt(0);
        String ros = str.substring(1);
        printss(ros, result);
        printss(ros,result+cc);
    }
}