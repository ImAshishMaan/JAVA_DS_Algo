package easy;

import java.util.*;

class Chief_jumping{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            if(sc.hasNext()) {
                long n = sc.nextInt();

                if ((n % 6) == 0 || (n % 6) == 1 || (n % 6) == 3) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }catch (Exception e){}
    }
}