package easy;
import java.util.*;
class Nuclear_reactors{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            long A = sc.nextLong();
            int N = sc.nextInt();
            int K = sc.nextInt();
            int chambers[] = new int[K];
            for (int i = 0; i < A; i++) {
                for (int j = 0; j < K; j++) {
                    chambers[j]++;
                    if (chambers[j] > N) {
                        chambers[j] = 0;
                    }else
                        break;
                }
            }
            for(int x:chambers)
                System.out.print(x+" ");
        }
        catch (Exception e){}
    }
}