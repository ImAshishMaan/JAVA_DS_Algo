import java.util.*;

class Chef_and_Division3{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

            while (T-- > 0) {
                int N = sc.nextInt();
                int K = sc.nextInt();
                int D = sc.nextInt();
                int[] arr = new int[N];
                int total = 0;
                for (int i = 0; i < N; i++) {
                    arr[i] = sc.nextInt();
                    total = total + arr[i];
                }
                int count;
                count = total / K;
                if(count < D) {
                    System.out.println(count);
                }else{
                    System.out.println(D);
                }
            }
        }
        catch (Exception e){}
    }
}