package DSA_learning_series_week2;

import java.util.*;
class chief_and_street_food{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

            while (T-- > 0) {
                int N = sc.nextInt();
                int profit = 0;
                while (N-- > 0) {
                    int max = 0;
                    int S = sc.nextInt();
                    int P = sc.nextInt();
                    int V = sc.nextInt();
//                    if (P % (S + 1) != 0) {
//                        continue;
//                    }
                    P = P/(S+1);
                    int cost = P * V;
                    //max = cost / (S + 1);
                    if (cost > profit)
                        profit = cost;
                }
                System.out.println(profit);
            }
        }catch (Exception e){}
    }
}