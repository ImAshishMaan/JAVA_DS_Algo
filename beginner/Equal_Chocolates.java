package beginner;

import java.io.IOException;
import java.util.*;

class Equal_Chocolates{
    public static void main(String[] args) throws java.lang.Exception {
        try {
            Scanner sc = new Scanner(System.in);
            int C = sc.nextInt();
            int R = sc.nextInt();

            if (C > R)
                System.out.println("No");
            else if (R % C == 0)
                System.out.println("Yes");
            else
                System.out.println("No");

        }catch (Exception e){

        }
    }
}