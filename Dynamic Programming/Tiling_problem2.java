import java.util.*;

class Tiling_problem2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            if (n > 0 && m > 0) {
                System.out.println(tiling2(n, m));
            }else{
                System.out.println("0");
            }
        }
    }
    public static long tiling2(long n, long m){
        if(n == 0){
            return 1;
        }
        long ver = 0;
        long hor = tiling2(n-1,m);
        if(n>=m)
            ver = tiling2(n-m,m);

        return hor + ver;
    }
}