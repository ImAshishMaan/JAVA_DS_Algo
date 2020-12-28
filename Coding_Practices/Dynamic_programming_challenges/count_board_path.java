package Dynamic_programming_challenges;

import java.util.*;

class count_board_path{
    public static void main(String[] args){
        int end = 10;
        int[] arr = new int[end+1];
        System.out.println(boardpath(end,0,arr));
        System.out.println(board(end));
    }
    public static int boardpath(int end, int curr,int[] arr){
        if(end == curr){
            return 1;
        }
        if(curr > end) {
            return 0;
        }
        if(arr[curr] != 0){
            return arr[curr];
        }
        int count =0;
        for(int dice=1; dice<=6 ; dice++){
            count = count + boardpath(end,curr + dice,arr);
        }
        arr[curr] = count;
        return count;
    }
    public static int board(int end){
        int[] arr = new int[end+1];
        arr[end] = 1;
        int count;
        for(int i=end-1 ; i>=0 ; i--) {
            count = 0;
            for (int dice = 1; dice<=6 && dice + i < arr.length; dice++) {
                count = count + arr[dice + i];
            }
            arr[i] = count;
        }
        return arr[0];
    }
}