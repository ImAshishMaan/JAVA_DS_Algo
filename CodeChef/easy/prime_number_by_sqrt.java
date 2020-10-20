package easy;
import java.util.*;
class prime_number_by_sqrt {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            long T = sc.nextInt();
            for (long i = 0; i < T; i++) {
                long S = sc.nextInt();
                long E = sc.nextLong();

                for (long j=S; j<=E; j++){
                    boolean P = false;
                    for(long k=2; k<=Math.sqrt(j) ; k++){
                        if(j%k==0) {
                            P = true;
                            break;
                        }
                    }
                    if(P==false)
                        System.out.println(j);
                }
                System.out.println();
            }
        }
        catch (Exception e){}
    }
}