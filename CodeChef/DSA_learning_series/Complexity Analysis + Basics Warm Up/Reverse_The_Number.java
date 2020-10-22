package DSA_learning_series;
import java.util.*;
class Reverse_The_Number
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for(int i=0 ; i<T ; i++){
                int N = sc.nextInt();
                int r,p=0;
                while(N!=0){
                    r = N%10;
                    N=N/10;
                    p = p*10+ r;
                }
                System.out.println(p);
            }
        }catch(Exception e){}
    }
}