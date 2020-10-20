package easy;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class life_universe
{
    public static void main (String[] args) throws java.lang.Exception
    {
        try{
            Scanner sc = new Scanner(System.in);
            for(int i=0 ; i<100 ;i++){
                int a= sc.nextInt();
                if(a!=42)
                    System.out.println(a);
                if(a==42)
                    break;
            }
        }
        catch(Exception e){

        }
    }
}
