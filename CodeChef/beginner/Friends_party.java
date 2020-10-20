package beginner;

import java.util.*;
class Friends_party{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int V = 0;
        int H = 0;
        for(int i = 0 ; i<s.length()  ; i++){
            if(s.charAt(i)=='V')
                V++;
            else
                H++;
        }
        if(H==V)
            System.out.println("Friendship");
        else if(H>V)
            System.out.println("Harshit");
        else if(V>H)
            System.out.println("Virat");


    }
}