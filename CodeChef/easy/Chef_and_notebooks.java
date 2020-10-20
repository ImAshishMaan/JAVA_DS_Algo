package easy;

import java.util.*;
class Chef_and_notebooks{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0 ;i<T ; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int K = sc.nextInt();
            int N = sc.nextInt();
            boolean a = false;

            for(int j=0 ; j<N; j++) {
                int P = sc.nextInt();
                int C = sc.nextInt();
                int RP = X-Y;
                if(RP<=P && C<=K){
                    a = true;
                }
            }
            if(a){
                System.out.println("LuckyChef");
            }else
                System.out.println("UnluckyChef");
        }
    }
}