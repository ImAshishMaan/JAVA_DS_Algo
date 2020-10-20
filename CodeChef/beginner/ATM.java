package beginner;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ATM
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            float t = sc.nextFloat();
            float r = 0.00f;
            float y = 0;
            if(x%5==0){
                y = (float)(x+0.5);
                if(t>=y){
                    r = (t-y);
                    System.out.printf("%.2f",r);
                }else{
                    System.out.printf("%.2f",t);
                }
            }else{
                System.out.printf("%.2f",t);
            }
        }
        catch (Exception e){

        }
    }
}
