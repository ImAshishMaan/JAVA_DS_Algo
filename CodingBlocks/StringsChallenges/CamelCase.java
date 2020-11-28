//        One of the important aspect of object oriented programming is readability of the code. To enhance the readability of code, developers write function and variable names in Camel Case. You are given a string, S, written in Camel Case. FindAllTheWordsContainedInIt.
//        Input Format
//
//        A single line contains the string.
//        Constraints
//
//        |S|<=1000
//        Output Format
//
//        Print words present in the string, in the order in which it appears in the string.
//        Sample Input
//
//        IAmACompetitiveProgrammer
//
//        Sample Output
//
//        I
//        Am
//        A
//        Competitive
//        Programmer
//
//        Explanation
//
//        There are 5 words in the string.

package StringsChallenges;

import java.util.*;

class CamelCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        for(int i =0 ; i< s.length() ; i++) {
            if (Character.isUpperCase(s.charAt(i)))
                System.out.println();
            System.out.print(s.charAt(i));
        }
    }
}