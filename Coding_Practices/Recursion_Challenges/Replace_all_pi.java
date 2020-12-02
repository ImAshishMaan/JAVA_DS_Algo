package Recursion_Challenges;

import java.util.*;

class Replace_all_pi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            System.out.println(replace(str));
        }
    }
    public static String replace(String str){
        if(str.length() <= 1){
            return str;
        }
        if(str.endsWith("pi")){
            return replace(str.substring(0, str.length()-2)) +"3.14";
        }
        else{
            return replace(str.substring(0,str.length()-1)) + str.substring(str.length()-1);
        }
    }
}