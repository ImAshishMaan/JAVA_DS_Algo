package easy;

import java.util.*;

class Count_substring{
    public static void main(String[] args){
        try{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0 ;i<T ;i++) {
            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1')
                    count++;
            }
            System.out.println((count * (count + 1)) / 2);
        }
        }
        catch (Exception e){}
    }
}