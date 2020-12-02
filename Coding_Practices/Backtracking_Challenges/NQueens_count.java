package Backtracking_Challenges;

import java.util.*;
class NQueens_count{
    public static void main(String[] args){
        boolean[][] board = new boolean[4][4];
        System.out.println(countNQueens(board,0)+" ways");
        printNQueens(board,0,"");
    }
    public static int countNQueens(boolean[][] board, int row){
        if(row == board.length){
            return 1;
        }
        int count = 0;
        for(int col=0; col<board[row].length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count =count + countNQueens(board,row+1);
                board[row][col] = false;
            }
        }
        return count;
    }
    public static void printNQueens(boolean[][] board, int row, String result) {
        if (row == board.length) {
            System.out.println(result);
            return;
        }
        int count = 0;
        for (int col = 0; col < board[row].length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                printNQueens(board, row + 1, result + "{" + (row + 1) + "-" + (col + 1) + "}");
                board[row][col] = false;
            }
        }
    }
    public static boolean isSafe(boolean[][] board,int row,int col){

        for(int i=row; i>=0; i--){
            if(board[i][col])
                return false;
        }

        for(int i=row, j=col; i>=0 && j>=0 ; i--,j--){
            if(board[i][j])
                return false;
        }

        for(int i=row, j=col; i>=0 && j<board.length; i--,j++){
            if(board[i][j])
                return false;
        }

        return true;
    }
}