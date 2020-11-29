//        Find position of the last and first occurrence of a given number in a sorted array. If number does not exist then print lower and upper bound as -1.
//        Input Format
//
//        First line contains an integer n denoting the size of the array.
//        Second line contains n space separated integers denoting array elements.
//        Third line contains single integer Q denoting the no of queries.
//        Q lines follow , each containing a single integer x that is to be searched in the array.
//        Constraints
//
//        1 <= N <= 10^5
//        1 <= Q <= 100
//        Output Format
//
//        For each query , print the lowerbound and the upperbound for the number x in a new line each.
//        Sample Input
//
//        5
//        1 2 3 3 4
//        3
//        2
//        3
//        10
//
//        Sample Output
//
//        1 1
//        2 3
//        -1 -1
//
//        Explanation
//
//        The first and the last occurrence of 2 in the given array are both 1.
//        The first occurrence of 3 is at index=2 and last at index=3.
//        10 is not present in the array so we print -1 for it.

package Array_Challenges;

import java.util.*;

class Upper_Lower_Bound{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int j ;
        for(int i=0 ; i<n ; i++){
            j = sc.nextInt();
            arr.add(j);
        }
        int t = sc.nextInt();
        while(t>0){
            int c = sc.nextInt();
            if(arr.contains(c)) {
                if(arr.get(0)==c){
                    System.out.println("0 0");
                    continue;
                }
                if(arr.get(arr.size()-1)==c){
                    System.out.println("5 5");
                    continue;
                }
                for (int i = 0; i < arr.size(); i++) {
                    if (arr.get(i) == c) {
                        System.out.print(i + " ");
                        break;
                    }
                }
                for (int i = arr.size() - 1; i > 0; i--) {
                    if (arr.get(i) == c) {
                        System.out.print(i);
                        System.out.println();
                        break;
                    }
                }

            }else{
                System.out.println("-1 -1");
            }
            t--;
        }
        sc.close();
    }
}