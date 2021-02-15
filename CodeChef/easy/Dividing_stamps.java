package easy;

import java.util.*;

class Dividing_stamps{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            int msum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];

            }
            for(int i=1 ; i <= n ; i++){
                msum += i;
            }
            if (sum == msum) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }catch (Exception e){}
    }
}