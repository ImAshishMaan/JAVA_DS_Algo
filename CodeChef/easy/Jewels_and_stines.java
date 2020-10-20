package easy;

import java.util.*;

class Jewels_and_stines{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

            for (int i = 0; i < T; i++) {
                StringBuffer J = new StringBuffer(sc.next());
                StringBuffer S = new StringBuffer(sc.next());
                int count = 0;
                for (int j = 0; j < S.length(); j++) {
                    for (int k = 0; k < J.length(); k++) {
                        if (S.charAt(j) == J.charAt(k)) {
                            count++;
                            break;
                        }
                    }
                }
                System.out.println(count);
            }
        }
        catch (Exception e){}
    }
}
