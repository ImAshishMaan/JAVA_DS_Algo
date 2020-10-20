package easy;

import java.util.*;

class Decreasing_Srrnmieeda {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for(int i = 0; i<T ; i++) {
                int L = sc.nextInt();
                int R = sc.nextInt();

                if(L==1){
                    System.out.println("-1");
                    continue;
                }
                if(R%L!=R-L)
                    System.out.println("-1");
                else
                    System.out.println(R);
            }
        }catch (Exception e){}
    }
}