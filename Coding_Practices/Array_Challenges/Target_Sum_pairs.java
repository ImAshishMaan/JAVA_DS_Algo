//Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all pairs of numbers which sum to target.
//        Input Format
//        The first line contains input N. Next N lines contains the elements of array and (N+1)th line contains target number.
//
//        Constraints
//
//        Length of the arrays should be between 1 and 1000.
//
//        Output Format
//
//        Print all the pairs of numbers which sum to target. Print each pair in increasing order.
//
//        Sample Input
//
//        5
//        1
//        3
//        4
//        2
//        5
//        5
//
//        Sample Output
//
//        1 and 4
//        2 and 3
//
//        Explanation
//
//        Find any pair of elements in the array which has sum equal to target element and print them.

package Array_Challenges;
import java.util.*;
class Target_Sum_pairs{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int li[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            li[i] = scn.nextInt();
        }
        int a = scn.nextInt();
        Arrays.sort(li);
        int low = 0;
        int high = li.length-1;
        while(low<high) {

            if ((li[high] + li[low]) == a) {
                System.out.println(li[low] + " and " + li[high]);
                low++;
                high--;
            }else if((li[high] + li[low]) > a){
                high--;
            }else
                low++;

        }
    }
}