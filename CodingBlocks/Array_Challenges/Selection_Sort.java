//Take as input N, the size of array. Take N more inputs and store that in an array. Write a function that selection sorts the array. Print the elements of sorted array.
//
//        1.It reads a number N.
//        2.Take Another N numbers as input and store them in an Array.
//        3.Sort the array using Selection Sort and print that Array.
//        Input Format
//
//        Constraints
//
//        N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000.
//        Output Format
//
//        Sample Input
//
//        4
//        2
//        -18
//        45
//        30
//
//        Sample Output
//
//        -18
//        2
//        30
//        45
//
//        Explanation
//
//        Write selection sort to sort the given integers in the problem.

package Array_Challenges;

import java.util.*;
class Selection_Sort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        int ar[] = selection(arr);
        for(int i=0 ; i< ar.length ; i++){
            System.out.println(arr[i]);
        }

    }
    public static int[] selection(int arr[]){
        for(int i = 0 ; i<arr.length ; i++){
            int min = i;
            for(int j=i+1 ; j< arr.length ; j++){
                if(arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}