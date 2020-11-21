//Q: Given two String, write a method to decide if one is a permutation of the other.

package Arrays_and_Strings;

import java.util.*;

class Check_Permutation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String ss = sort(s);      //sorted s
        String tt = sort(t);      //sorted t
        if(ss.length() != tt.length())
            System.out.println("false");
        else if(ss.equals(tt))
            System.out.println("true");
        else
            System.out.println("false");
    }
    public static String sort(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

}