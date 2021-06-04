import java.util.*;

class Tiling_problem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tiling(n));
    }
    public static int tiling(int n){
        if(n == 0){
            return 1;
        }
        int num2=0;
        int num1 = tiling(n-1);
        if(n >=4){
            num2 = tiling(n-4);
        }
        return num1+num2;

    }
}