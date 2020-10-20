package beginner;

import java.util.*;
class GCD_LCM{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for(int i=0 ; i<T ; i++){
            input.nextLine();
            int a=input.nextInt();
            int b=input.nextInt();
            long c=a;
            long d=b;
            while(b>0){
                a%=b;
                int temp=b;
                b=a;
                a=temp;
            }
            long lcm=(c*d)/a;
            System.out.println(a+" "+lcm);
        }
    }
}