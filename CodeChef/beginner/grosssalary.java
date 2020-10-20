package beginner;

import java.util.*;
class grosssalary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        double hra ,da,gs;
        for(int i=0 ; i<T ; i++){
            int s = sc.nextInt();
            if(s<1500) {
                hra = s*0.1;
                da = s*0.9;
            }else{
                hra = 500.0;
                da = s*0.98;
            }
            gs = s + hra + da;
            System.out.println(gs);
        }
    }

    static class Split_the_Str_Ing{
        public static void main(String[] args){
            try {
                Scanner sc = new Scanner(System.in);
                int T = sc.nextInt();
                for (int i = 0; i < T; i++) {
                    int N = sc.nextInt();
                    String S = null;
                    boolean b = false;
                    if(N!=0){
                        S = sc.next();
                    }
                    char B = S.charAt(S.length() - 1);
                    for (int j = 0; j <= S.length() - 2; j++) {
                        if (B == S.charAt(j)) {
                            b = true;
                        }
                    }
                    if (b) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }catch (Exception e){}
        }
    }
}