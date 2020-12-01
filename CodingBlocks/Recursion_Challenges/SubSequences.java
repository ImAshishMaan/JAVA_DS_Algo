package Recursion_Challenges;

import java.util.*;

class SubSequences{
    public static void main(String[] args){
        System.out.println(getSS("abc"));
    }
    public static ArrayList<String> getSS(String str){
        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add(" ");
            return base;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> myResult= new ArrayList<>();
        ArrayList<String> recResult = getSS(ros);
        for(int i= 0 ; i< recResult.size() ; i++){
            myResult.add(recResult.get(i));
            myResult.add(cc + recResult.get(i));
        }
        return myResult;
    }
}