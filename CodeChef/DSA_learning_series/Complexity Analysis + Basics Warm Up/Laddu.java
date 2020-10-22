package DSA_learning_series;

import java.util.*;

class Laddu{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for(int i=0 ; i<T ; i++){
                int n = sc.nextInt();
                String origin = sc.next();

                int laddus = 0;
                for(int j=0; j<n ; j++){
                    String event = sc.next();

                    if(event.equals("CONTEST_WON")){
                        int r = sc.nextInt();
                        laddus += 300;
                        if(r<=20){
                            laddus += 20 - r;
                        }
                    }else if(event.equals("TOP_CONTRIBUTOR")){
                        laddus += 300;
                    }else if(event.equals("BUG_FOUND")){
                        int sev = sc.nextInt();
                        laddus += sev;
                    }else if(event.equals("CONTEST_HOSTED")){
                        laddus += 50;
                    }else{
                        assert(false);
                    }
                }
                int months = 0;
                if(origin.equals("INDIAN")){
                    months =laddus/200;
                }else{
                    months = laddus/400;
                }
                System.out.println(months);
            }
        }
        catch (Exception e){}
    }
}