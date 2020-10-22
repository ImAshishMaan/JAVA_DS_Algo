package DSA_learning_series;

import java.util.*;

class Carvans{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for(int i=0 ; i<T ; i++){
                int N = sc.nextInt();
                int arr[] = new int[N];
                for(int j=0 ; j<N ; j++){
                    arr[j] = sc.nextInt();
                }
                int count =1;
                int prev = arr[0];
                for(int k=1 ; k<N; k++){
                    if(prev>=arr[k]){
                        count++;
                        prev = arr[k];
                    }
                }
                System.out.println(count);
            }
        }catch (Exception e){}
    }
}