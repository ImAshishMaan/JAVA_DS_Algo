package beginner;

import java.util.*;
class ATM2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T ; i++){
            int n = sc.nextInt();
            int t = sc.nextInt();
            for(int j=0 ; j<n ;j++){
                int a = sc.nextInt();
                if(t>=a){
                    System.out.print(1);
                    t = t-a;
                }else if(t<a){
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}