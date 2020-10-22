package DSA_learning_series;

import java.util.*;
class Factorial{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int z = sc.nextInt();
                int r = 0;
                while (z >= 5) {
                    z = z / 5;
                    r = r + z;
                }
                System.out.println(r);
            }
        }catch (Exception e){}
    }
}