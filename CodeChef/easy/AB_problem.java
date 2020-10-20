package easy;

import java.util.*;
class AB_problem{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a-b;
            if(c%10!=9)
                    c = c+1;
            else
                    c = c-1;
            System.out.println(c);


    }
}
