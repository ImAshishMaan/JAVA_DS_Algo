package beginner;
import java.util.*;
class Turbo_sort{
    public static void main(String args[]){
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            int arr[] = new int[T];
            for (int i = 0; i < T; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int i = 0; i < T; i++) {
                System.out.println(arr[i]);
            }
        }catch (Exception e){}
    }
}