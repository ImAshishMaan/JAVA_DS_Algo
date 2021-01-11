import java.util.*;

class generate_brackets{
    public static void main(String[] args){

        int n = 2;
        char[] out = new char[1000];

        generate(0,n,out,0,0);
    }
    public static void generate(int idx, int n, char[] out,int open,int close){
        if(idx == 2*n){
            System.out.println(out);
            return;
        }
        if(open < n){
            out[idx] = '(';
            generate(idx+1, n, out,open+1, close);
        }
        if(close < open){
            out[idx] = ')';
            generate(idx+1,n, out, open, close+1);
        }
        return;
    }
}