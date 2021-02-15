package easy;

import java.util.*;

class Count_substring{
    public static void main(String[] args){
        try{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            long count = 0;
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == '1')
                    count++;
            }
            System.out.println((count * (count + 1)) / 2);
        }
        }
        catch (Exception e){}
    }
}