package beginner;

import java.util.*;
class firstandlastdigit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t ; i++){
            int n = sc.nextInt();
            int l = n%10;
            int f =0;
            while(n!=0){
                f = n%10;
                n = n/10;
            }
            System.out.println(l+f);
        }
    }
}