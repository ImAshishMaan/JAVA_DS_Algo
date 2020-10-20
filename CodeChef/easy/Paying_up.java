package easy;

import java.util.*;

class Paying_up{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for(int i=0;i<t;i++){
                int n = sc.nextInt();
                int m = sc.nextInt();
                int arr[] = new int[n];
                for(int j=0;j<n;j++){
                    arr[j] = sc.nextInt();
                }
                int left = 0;
                int right = 0;
                int currsum = 0;
                for(int k=0 ; k<1000 ; k++){
                    if(currsum==m){
                        System.out.println("Yes");
                        break;
                    }else if(currsum<m){
                        currsum = currsum + arr[right];
                        right++;
                    }
                    if(currsum>m){
                        currsum = currsum - arr[left];
                        left++;
                    }
                }

            }
        }
        catch (Exception e){}
    }
}