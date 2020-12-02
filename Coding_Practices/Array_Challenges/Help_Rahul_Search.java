//Rahul had a sorted array of numbers from which he had to find a given number quickly. His friend by mistake rotated the array. Now Rahul doesn't have time to sort the elements again. Help him to quickly find the given number from the rotated array.
//
//        Hint - Think Binary Search!
//
//        Input Format
//
//        The first line contains N - the size of the array. the next N lines contain the numbers of the array.The next line contains the item to be searched.
//
//        Constraints
//
//        Output Format
//
//        Output the index of number in the array to be searched. Output -1 if the number is not found.
//
//        Sample Input
//
//        5
//        4
//        5
//        1
//        2
//        3
//        2
//
//        Sample Output
//
//        3
//
//        Explanation
//
//        The given rotated array is [4, 5, 1, 2, 3]. The element to be searched is 2 whose index is 3.

package Array_Challenges;

import java.util.*;
class Help_Rahul_Search{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int bin[] = new int[n];
        for(int i=0 ; i<n ; i++){
            bin[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int a = binarsearch(bin,x);
        System.out.print(a);
    }
    public static int binarsearch(int[] bin, int x){
        int low = 0;
        int high = bin.length-1;
        while(low==high) {
            int mid = (int) (low + high) / 2;
            if(bin[mid] > x){
                low = mid+1;
            }else if(bin[mid] < x){
                high = mid-1;
            }else {
                return mid;
            }
        }
        return -1;

    }
}