package DSA_learning_series;

import java.util.*;
class Coin_Flip{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

            for (int i = 0; i < T; i++) {
                int G = sc.nextInt();
                for (int j = 0; j < G; j++) {
                    int I = sc.nextInt();
                    int N = sc.nextInt();
                    int Q = sc.nextInt();
                    if (I == 1 && N % 2 != 0) {
                        if (Q == 1)
                            System.out.println(N / 2);
                        if (Q == 2)
                            System.out.println((N / 2) + 1);
                    } else if (I == 2 && N % 2 != 0) {
                        if (Q == 1)
                            System.out.println((N / 2) + 1);
                        if (Q == 2)
                            System.out.println(N / 2);
                    }
                    if ((I == 1 || I == 2) && N % 2 == 0) {
                        if (Q == 1 || Q == 2)
                            System.out.println(N / 2);
                    }
                }
            }
        }catch (Exception e){}
    }
}