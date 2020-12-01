package Recursion_Challenges;

import java.util.*;

class Permutation{
    public static void main(String[] args){
        System.out.println(getPermutation("abc"));
        System.out.println(getPermutation("abcdef"));
    }
    public static ArrayList<String> getPermutation(String str){
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add(" ");
            return base;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> recResult = getPermutation(ros);
        ArrayList<String> myResult = new ArrayList<>();
        for(String s : recResult){
            for(int i=0 ; i<s.length() ; i++){
                String val = s.substring(0,i)+ cc + s.substring(i);
                myResult.add(val);
            }
        }
        return myResult;
    }
}