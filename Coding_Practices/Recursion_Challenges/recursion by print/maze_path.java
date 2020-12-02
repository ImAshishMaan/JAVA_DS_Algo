package Recursion_print;

import java.util.*;
class maze_path{
    public static void main(String[] args){
        printpath(0,0,2,2," ");
        System.out.println(printpath(0,0,2,2));
    }
    public static void printpath(int r, int c,int er, int ec, String ans){
        if(r==er && c==ec){
            System.out.println(ans);
            return;
        }
        if(r>2 || c >2){
            return;
        }

        printpath(r+1, c,er,ec,ans+'H');
        printpath(r,c+1,er,ec,ans+'V');
    }
    public static int printpath(int r, int c,int er, int ec){
        if(r==er && c==ec){
            return 1;
        }
        if(r>2 || c >2){
            return 0;
        }
        int count = 0;
        count += printpath(r+1, c,er,ec);
        count += printpath(r,c+1,er,ec);
        return count;
    }
}