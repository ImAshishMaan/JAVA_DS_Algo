import java.util.*;

class NUm_of_binary_string{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int N = sc.nextInt();
            System.out.println(binStr(N,0));
        }
    }
    public static int binStr(int n,int p){
        if(n == 0)
            return 1;

        int zero = binStr(n-1,0);
        int one = 0;
        if(p==0)
            one = binStr(n-1,1);
        return zero+one;
    }
}