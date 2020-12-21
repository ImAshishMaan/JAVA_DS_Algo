//        Take the following as input.
//
//        A character (ch) Write a function that returns ‘U’, if it is uppercase; ‘L’ if it is lowercase and ‘I’ otherwise. Print the value returned.
//        Input Format
//
//        Character (ch)
//        Constraints
//
//        No constraints
//        Output Format
//
//        'L' (if ch is lower-case) 'U' (if ch is upper-case) 'I' (otherwise)
//        Sample Input
//
//        s
//
//        Sample Output
//
//        L
//
//        Explanation
//
//        Anyone can Do it using Ascii codes. I dare you - "Try to not use ascii codes." ;)

package StringsChallenges;

import java.util.*;
class Character_type{
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        char s = scn.next().charAt(0);
        if(Character.isLowerCase(s)){
            System.out.println("L");
        }
        else if(Character.isUpperCase(s)){
            System.out.println("U");
        }else
            System.out.println("I");
    }
}