package easy;
import java.util.*;
class Prime_generator_by_sieve{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            long T = sc.nextInt();
            for (long i = 0; i < T; i++) {
                long S = sc.nextInt();
                long N = sc.nextLong();
                int arr[] = new int[(int) N + 5];
                for (long j = 3; j <= N; j += 2) {
                    arr[(int) j] = 1;
                }
                //System.out.println(Arrays.toString(arr));
                for (long k = 3; k <= N; k += 2) {
                    if (arr[(int) k] == 1) {
                        for (long l = k * k; l <= N; l += k) {
                            arr[(int) l] = 0;
                        }
                    }
                }
                arr[2] = 1;
                arr[1] = arr[0] = 0;
                for (long m = S; m <= N; m++) {
                    if (arr[(int) m] == 1) {
                        System.out.println(m);
                    }
                }
                System.out.println();
            }
        }
        catch (Exception e){}
    }
}