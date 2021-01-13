package DSA_learning_series_week2;

import java.util.*;
class penalty_shoot_out2{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            while (T-- > 0) {
                int N = sc.nextInt();
                String str = sc.next();
                int A = 0;
                int B = 0;
                int an = N;
                int bn = N;
                int i = 0;
                for (i = 0; i < 2 * N; i++) {
                    if (str.charAt(i) == '1') {
                        if (i % 2 == 0) {
                            A++;
                            an--;
                        } else {
                            B++;
                            bn--;
                        }
                    } else if (str.charAt(i) == '0') {
                        if (i % 2 == 0) {
                            B++;
                            bn--;
                        } else {
                            A++;
                            an--;
                        }
                    }
                    if (A - B > bn || B - A > an) {
                        i++;
                        break;
                    }
                }
                System.out.println(i);
            }
        }catch (Exception e){}
    }
}