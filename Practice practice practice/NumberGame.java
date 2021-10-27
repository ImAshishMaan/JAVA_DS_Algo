import java.util.*;

class NumberGame{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            if(n % 4 == 1){
                System.out.println("ALICE");
            }else{
                System.out.println("BOB");
            }
        }
        sc.close();
    }
}