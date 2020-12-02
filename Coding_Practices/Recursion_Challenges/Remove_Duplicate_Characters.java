package Recursion_Challenges;

import java.util.*;
class Remove_Duplicate_Characters{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        removeduplicate(str,"");

    }
    public static void removeduplicate(String str, String ans){
        if(str.length()==1){
            System.out.println(ans+str.charAt(0));
            return;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);
        if(cc == ros.charAt(0)) {
            removeduplicate(ros, ans);
        }else{
            removeduplicate(ros,ans+cc);
        }
    }
}