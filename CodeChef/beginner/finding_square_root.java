package beginner;
import java.util.*;
class finding_square_root{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                double n = sc.nextDouble();
                double f = Math.sqrt(n);
                System.out.printf("%.00f", Math.floor(f));
                System.out.println();
            }
        }catch (Exception e ){}
    }
}