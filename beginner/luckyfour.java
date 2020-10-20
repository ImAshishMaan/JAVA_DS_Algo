package beginner;

import java.util.*;
class luckyfour{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0 ; i<t ; i++){
            String n = sc.next();
            int count = 0;
            for(int j = 0 ; j<n.length(); j++){
                if(n.charAt(j)=='4'){
                    count++;
                }else{

                }
            }
            System.out.println(count);
        }
    }
}
