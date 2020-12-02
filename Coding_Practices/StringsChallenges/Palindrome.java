//Take as input S, a string. Write a function that returns true if the string is a palindrome and false otherwise. Print the value returned.
//        Input Format
//
//        String
//        Constraints
//
//        String length between 1 to 1000 characters
//        Output Format
//
//        Boolean
//        Sample Input
//
//        abba
//
//        Sample Output
//
//        true
//
//        Explanation
//
//        A string is said to be palindrome if reverse of the string is same as string. For example, “abba” is palindrome as it's reverse is "abba", but “abbc” is not palindrome as it's reverse is "cbba".

package StringsChallenges;

import java.util.*;

class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        boolean b = false;
        int l = p.length()-1;
        for(int i = 0; i<p.length() ; i++){
            if(p.charAt(i)==p.charAt(l)){
                b=true;
                l--;
            }else {
                b=false;
                break;
            }
        }
        if(b){
            System.out.println(true);
        }else
            System.out.println(false);

    }
}