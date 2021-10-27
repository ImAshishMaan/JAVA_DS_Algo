import java.util.*;

class Football {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

            while (T-- > 0) {
                int N = sc.nextInt();
                int[] goal = new int[N];
                int[] foul = new int[N];

                for (int i = 0; i < N; i++) {
                    goal[i] = sc.nextInt();
                }
                for (int i = 0; i < N; i++) {
                    foul[i] = sc.nextInt();
                }

                int max = 0;
                for (int i = 0; i < N; i++) {
                    int m = (goal[i] * 20) - (foul[i] * 10);
                    if (max < m)
                        max = m;
                }
                System.out.println(max);
            }
            sc.close();
        } catch (Exception e) {
        }
    }
}