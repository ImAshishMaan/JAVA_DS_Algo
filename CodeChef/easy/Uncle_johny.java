package easy;

import java.util.*;
class Uncle_johny{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0; i<T ; i++){
            int n = sc.nextInt();
            int arr[] = new int[n+1];
            for(int j=1 ; j<=n ; j++){
                arr[j] = sc.nextInt();
            }
            int K = sc.nextInt();
            int p = arr[K];
            Arrays.sort(arr);
            int f =0;
            for(int l=1;l<=n;l++){
                if(arr[l]==p){
                    f = l;
                }
            }
            System.out.println(f);

        }
    }
}
