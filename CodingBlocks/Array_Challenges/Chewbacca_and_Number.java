//        Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them.
//        Inverting digit t means replacing it with digit 9-t.
//
//        Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero)
//        digits. The decimal representation of the final number shouldn't start with a zero.
//
//        Input Format
//
//        The first line contains a single integer x (1≤x≤10^18) — the number that Luke Skywalker gave to Chewbacca.
//
//        Constraints
//
//        x <= 100000000000000000
//
//        Output Format
//
//        Print the minimum possible positive number that Chewbacca can obtain after inverting some digits. The number shouldn't contain leading zeroes.
//
//        ample Input
//
//        4545
//
//        Sample Output
//
//        4444
//
//        Explanation
//
//        There are many numbers form after inverting the digit. For minimum number, check if inverting digit is less than
//        or greater than the original digit. If it is less, then invert it otherwise leave it.
package Array_Challenges;
import java.util.*;
class Chewbacca_and_Numbers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] x = n.toCharArray();
        for(int i=0 ; i<n.length();i++){
            int v = x[i] - '0';
            if(i==0 && v == 9)
                continue;
            if(v>4)
                v = 9 - v;
            x[i] = (char) (v + '0');
        }
        System.out.println(x);
    }
}
