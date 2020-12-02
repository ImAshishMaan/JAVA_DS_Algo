package Recursion_Challenges;

import java.util.*;
class Convert_String_to_Integer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StrToInt(str,"");
    }
    public static void StrToInt(String str, String ans){
        if(str.length()==0){
            char[] chars = ans.toCharArray();
            System.out.println(chars);
            return;
        }

        char cc = str.charAt(0);
        String ros = str.substring(1);
        StrToInt(ros,ans+cc);
    }
}