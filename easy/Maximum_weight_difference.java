package easy;

import java.util.*;
class Maximum_weight_difference{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int N = sc.nextInt();
                int K = sc.nextInt();
                int W = K;
                int arr[] = new int[N];
                int sum = 0;
                for (int j = 0; j < N; j++) {
                    arr[j] = sc.nextInt();
                    sum = sum + arr[j];
                }
                Arrays.sort(arr);
                int child = 0;
                int c = 0;
                while (K != 0) {
                    child = child + arr[c];
                    c++;
                    K--;
                }
                int Chef = 0;
                int Z = N - W;
                while (Z > 0) {
                    Chef = Chef + arr[c];
                    c++;
                    Z--;
                }
                System.out.println(Math.max(Math.abs(child-(sum-child)),Math.abs(Chef-(sum-Chef))));
//                if(Chef>child){
//                    System.out.println(Chef-child);
//                }else if(child>Chef){
//                    System.out.println(child-Chef);
//                }
            }
        }
        catch (Exception e) {}
    }
}