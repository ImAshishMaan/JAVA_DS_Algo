import java.util.*;

class ArrangingCupCakes{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0)
        {
            int N = sc.nextInt();
            int mindiff = 0;
            for(int i=1 ; i<N ;i++)
            {
                for(int j=1 ; j<N ; j++)
                {
                    int a = i * j;
                    if(a == N){
                        mindiff = Math.abs(i) - Math.abs(j);
                    }
                }
            }
            System.out.println(mindiff);
        }
        sc.close();
    }
}