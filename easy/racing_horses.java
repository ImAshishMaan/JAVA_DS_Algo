package easy;

import java.util.*;
class racing_horses{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int min = arr[1]-arr[0];
            for(int j = 1; j<arr.length ; j++){
                if(arr[j]-arr[j-1]<min){
                    min = arr[j]-arr[j-1];
                }
            }
            System.out.println(min);
        }
    }
}