package Recursion_print;

import java.util.*;
class maze_path_diag {
    public static void main(String[] args) {
        printdiagpath(0, 0, 2, 2, " ");
        System.out.println(printdiagpath(0, 0, 2, 2));
    }

    public static void printdiagpath(int r, int c, int er, int ec, String ans) {
        if (r == er && c == ec) {
            System.out.println(ans);
            return;
        }
        if (r > 2 || c > 2) {
            return;
        }
        printdiagpath(r + 1, c, er, ec, ans + 'H');
        printdiagpath(r, c + 1, er, ec, ans + 'V');
        printdiagpath(r+1, c + 1, er, ec, ans + 'D');
    }
    public static int printdiagpath(int r, int c,int er, int ec){
        if(r==er && c==ec){
            return 1;
        }
        if(r>2 || c >2){
            return 0;
        }
        int count = 0;
        count += printdiagpath(r+1, c,er,ec);
        count += printdiagpath(r,c+1,er,ec);
        count += printdiagpath(r+1,c+1,er,ec);
        return count;
    }
}