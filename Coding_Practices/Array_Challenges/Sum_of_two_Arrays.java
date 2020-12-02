//Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, the size of second
//array and take M more inputs and store that in second array. Write a function that returns the sum of two arrays.
// Print the value returned.

//        Input Format
//
//        Constraints
//        Length of Array should be between 1 and 1000.
//
//        Sample Input
//        4
//        1 0 2 9
//        5
//        3 4 5 6 7
//
//        Sample Output
//
//        3, 5, 5, 9, 6, END
//
//        Explanation
//
//        Sum of [1, 0, 2, 9] and [3, 4, 5, 6, 7] is [3, 5, 5, 9, 6] and the first digit represents carry over , if any (0 here ) .


package Array_Challenges;

import java.util.*;

class Sum_of_two_Arrays{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr1[] = new int[a];
        for(int i =0 ; i < a ; i++){
            arr1[i] = s.nextInt();
        }
        int b = s.nextInt();
        int arr2[] = new int[b];
        for(int i =0 ; i < b ; i++){
            arr2[i] = s.nextInt();
        }
        ArrayList<Integer> fin = new ArrayList<Integer>();
        int l1 = arr1.length-1;
        int l2 = arr2.length-1;
        int L;
        if(l1 > l2)
            L = l1+1;
        else
            L = l2+1;
        int sum;
        int rem = 0;
        for(int i = 0 ; i< L ; i++){
            if(l1< 0 && l2 >= 0){
                fin.add(rem+arr2[l2]);
                rem = 0;
            }else if(l1>= 0 && l2 < 0){
                fin.add(rem+arr1[l1]);
                rem = 0;
            } else{
                sum = rem + (arr1[l1] + arr2[l2]);
                fin.add(sum%10);
                rem = sum/10;
            }
            l1--;
            l2--;
        }
        if(rem != 0)
        fin.add(rem);
        for(int i=fin.size()-1 ; i>=0; i--){
            System.out.print(fin.get(i));
            System.out.print(", ");
        }
        System.out.print("END");
    }
}