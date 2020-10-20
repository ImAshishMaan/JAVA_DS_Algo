package beginner;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class reversenumber
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner sc = new Scanner(System.in);
            int t= sc.nextInt();
            for(int i = 0 ; i< t ; i++){
                int n = sc.nextInt();
                int rev = 0;
                while(n!=0){
                    int p = n%10;
                    n = n/10;
                    rev = rev*10 +p;
                }
                System.out.println(rev);
            }
        }
        catch(Exception e){

        }
    }
}