package beginner;
import java.util.*;
class second_largest {
    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for(int i=0 ; i<T ; i++){
                int arr[] = new int[3];
                for(int j=0 ; j<arr.length ; j++){
                    arr[j] = sc.nextInt();
                }
                Arrays.sort(arr);
                System.out.println(arr[arr.length-2]);
            }

        }catch (Exception e){}
    }
}