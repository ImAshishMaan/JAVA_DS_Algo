import java.util.*;

class KitchenTimetablel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] cook = new int[N];
            int[] time = new int[N];
            for (int i = 0; i < N; i++) {
                cook[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                time[i] = sc.nextInt();
            }

            int count = 0;
            int last = 0;
            for (int i = 0; i < N; i++) {
                int t = cook[i] - last;
                if (time[i] <= t) {
                    count++;
                }
                last = cook[i];

            }
            System.out.println(count);
        }
        sc.close();
    }
}