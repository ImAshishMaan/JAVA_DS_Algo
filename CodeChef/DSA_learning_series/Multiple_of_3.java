package DSA_learning_series;

import java.util.*;

class Multiple_of_3{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for(int i=0 ; i<T ; i++){
                long k = sc.nextLong();
                long d0 = sc.nextLong();
                long d1 = sc.nextLong();
                long lastdegit = (d0 + d1)%10;
                long sum = d0 + d1 + lastdegit;
                if(k==2){
                    if((d0*10 + d1)%3==0)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                    continue;
                }
                long remdigit = k-3;
                while(remdigit > 0){
                    if(lastdegit == 6){
                        long sets = remdigit/4;
                        sum += 20*(sets);
                        remdigit -= sets*4;
                        if(remdigit == 0){

                        }else if(remdigit == 1){
                            sum +=2;
                        }else if(remdigit == 2){
                            sum += 6;
                        }else if(remdigit == 3){
                            sum += 14;
                        }
                        remdigit=0;
                        break;
                    }else if(lastdegit == 0){
                        break;
                    }else{
                        lastdegit = (lastdegit*2)%10;
                        sum += lastdegit;
                        remdigit--;
                    }
                }
                if(sum%3==0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }catch (Exception e){}
    }
}
