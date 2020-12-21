package Recursion_Challenges;

import java.util.*;

class Move_all_X_at_end{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        int countx = 0;
        for(int i=0 ; i<st.length() ; i++){
            if(st.charAt(i) != 'x'){
                sb.append(st.charAt(i));
            }else{
                countx++;
            }
        }
        while(countx-- >0){
            sb.append('x');
        }
        System.out.println(sb);
    }
}