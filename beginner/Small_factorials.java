package beginner;
import java.math.BigInteger;
import java.util.*;
class Small_factorials {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for(int i=0;i <T ; i++){
                int n = sc.nextInt();
                BigInteger f = new BigInteger("1");
                for(int j=2 ; j<=n ; j++){
                    f = f.multiply(BigInteger.valueOf(j));
                }
                System.out.println(f);
            }

        }catch (Exception e){}
    }

    static class Covid_run{
        public static void main(String[] args){
            try {
                Scanner sc = new Scanner(System.in);
                int T = sc.nextInt();

                for (int i = 0; i < T; i++) {
                    int N = sc.nextInt();
                    int K = sc.nextInt();
                    int X = sc.nextInt();
                    int x = X;
                    int Y = sc.nextInt();
                    boolean b = false;
                    for (int j = 0; j < 100; j++) {
                        if ((X + K) % N == Y) {
                            b = true;
                            break;
                        } else if ((X + K) % N == x) {
                            break;
                        }
                        X = ((X + K) % N);
                    }
                    if (b)
                        System.out.println("Yes");
                    else
                        System.out.println("No");
                }
            }catch (Exception e){}
        }
    }
}