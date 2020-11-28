//        Print "lowercase" if user enters a character between 'a-z' , Print "UPPERCASE" is character lies between 'A-Z' and print "Invalid" for all other characters like $,.^# etc.
//        Input Format
//
//        Single Character .
//        Constraints
//
//        -
//        Output Format
//
//        lowercase UPPERCASE Invalid
//        Sample Input
//
//        $
//
//        Sample Output
//
//        Invalid

package StringsChallenges;

import java.util.*;
class lower_upper {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        char s = scn.next().charAt(0);
        if(Character.isLowerCase(s)){
            System.out.println("lowercase");
        }
        else if(Character.isUpperCase(s)){
            System.out.println("UPPERCASE");
        }else
            System.out.println("Invalid");
    }
}
