//Q: Implementation of algorithm to determine if a string has all unique characters. What if You cannot use additional data structure?
package Arrays_and_Strings;

import java.util.*;

class Is_Unique{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isUnique(s));
    }
    public static boolean isUnique(String s){
        if(s.length() > 128)  // greater than 128 string means any one symbol is repeated.
            return false;
        boolean[] char_set = new boolean[128];
        for(int i=0 ; i<s.length(); i++){
            int val = s.charAt(i);    // converting symbol in ascii number
            if(char_set[val]){   // already found this char in String.
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}