package DSA_learning_series;

import java.util.*;

class Smart_Phones{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            long T = sc.nextLong();
            long arr[] = new long[(int) T];
            for(long i=0 ; i<T ; i++){
                arr[(int) i] = sc.nextInt();
            }
            Arrays.sort(arr);
            long rev = 0;
            long r = 0;
            long l = 1;
            for(long j=1 ; j<=arr.length ; j++){
                r = arr[(int) (arr.length-l)] * j;
                l++;
                if(r>rev){
                    rev = r;
                }
            }
            System.out.println(rev);
        }catch (Exception e){}
    }
}