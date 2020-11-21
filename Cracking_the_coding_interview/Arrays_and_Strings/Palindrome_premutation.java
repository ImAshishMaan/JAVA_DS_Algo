// Q: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase
// that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to
// be limited to just dictionary wards;

package Arrays_and_Strings;

import java.util.*;

class Palindrome_premutation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // Method 1
        if(s==null){
            System.out.println("false");
        }
        BitSet bs = new BitSet(256);
        for(char c: s.toCharArray())
            bs.flip(c);
        if(bs.cardinality()<=1)
            System.out.println("true");
        else
            System.out.println("false");

        // Method 2
//        int[] table = new int[128];
//        int count = 0;
//        for(int i=0 ; i<s.length(); i++){
//            table[s.charAt(i)]++;
//            if(table[s.charAt(i)] % 2 == 0)
//                count--;
//            else
//                count++;
//        }
//        if(count<=1)
//            System.out.println("true");
//        else
//            System.out.println("false");
    }
}