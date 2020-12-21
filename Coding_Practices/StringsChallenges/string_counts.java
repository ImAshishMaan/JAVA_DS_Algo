package StringsChallenges;
import java.util.*;

class string_counts{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        int count = 1;
        for(int i=0 ; i<s.length()-1 ; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            if(s.charAt(i)!=s.charAt(i+1)){
                System.out.print(s.charAt(i));
                System.out.print(s.charAt(count));
                count=1;
            }
        }
    }
}