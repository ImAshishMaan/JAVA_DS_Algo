package DSA_learning_series;

import java.lang.reflect.Array;
import java.util.*;

class Lapindromes{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                String S = sc.next();
                String s1;
                String s2;
                s1 = S.substring(0, S.length()/2);
                if (S.length() % 2 == 0) {
                    s2 = S.substring(S.length()/2);
                } else {
                    s2 = S.substring(S.length()/2 + 1);
                }
                char a[] = s1.toCharArray();
                char b[] = s2.toCharArray();
                Arrays.sort(a);
                Arrays.sort(b);
                if(String.valueOf(a).equalsIgnoreCase(String.valueOf(b))) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            }
        }catch (Exception e){}
    }
}
