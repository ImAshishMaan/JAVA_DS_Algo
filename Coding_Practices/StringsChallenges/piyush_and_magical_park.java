package StringsChallenges;

import java.util.*;

class piyush_and_magical_park{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int K = sc.nextInt();
        int S = sc.nextInt();
        char[][] arr = new char[row][col];
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                arr[i][j] = sc.next().charAt(0);
            }
        }
        for(int i=0 ; i<arr.length ; i++){
            if(S>=K) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] == '.') {
                        if (j == arr[i].length - 1) {
                            S = S - 2;
                        } else
                            S = S - 3;
                    } else if (arr[i][j] == '*') {
                        if (j == arr[i].length - 1)
                            S = S + 5;
                        else
                            S = S + 4;

                    } else if (arr[i][j] == '#') {
                        break;
                    }
                }
            }else{
                break;
            }
        }
        if(S > K){
            System.out.println("Yes");
            System.out.println(S);
        }else{
            System.out.println("No");
        }
    }
}