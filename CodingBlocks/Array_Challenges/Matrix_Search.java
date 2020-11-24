// Given an n x m matrix, where every row and column is sorted in increasing order, and a number x . Find if element x is present in the matrix or not.
//        Input Format
//
//        First line consists of two space separated integers N and M, denoting the number of element in a row and column
//        respectively. Second line of each test case consists of N*M space separated integers denoting the elements in
//        the matrix in row major order. Third line of each test case contains a single integer x, the element to be searched.
//
//        Constraints
//
//        1 <= N,M <= 30 0 <= A[i] <= 100
//
//        Output Format
//
//        Print 1 if the element is present in the matrix, else 0.
//
//        Sample Input
//
//        3 3
//        3 30 38
//        44 52 54
//        57 60 69
//        62
//
//        Sample Output
//
//        0
//
//        Explanation
//
//        Search the element in the sorted matrix. If the element is present print 1 otherwise print 0. In the sample
//        input,in first case 62 is not present in the matrix so 0 is printed. Similarly, for second case 55 is present
//        in the matrix so 1 is printed.

package Array_Challenges;

import java.util.*;
class Matrix_Search{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int f = sc.nextInt();
        int o = search(arr,f);
        System.out.println(o);
    }
    public static int search(int arr[][],int f){
        for(int i=0 ; i<arr.length ; i++){
            for(int j =0 ; j<arr[i].length ; j++){
                if(arr[i][j] == f ){
                    return 1;
                }
            }
        }
            return 0;

    }
}