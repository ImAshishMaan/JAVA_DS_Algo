package DSA_learning_series_week2;

import java.util.*;

class matched_brackets{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int dep = 0;
            int pos = 0;
            int size = 0;
            int inner = 0, p = 0, inpos = 0, in = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1)
                    size++;
                else if (arr[i] == 2)
                    size--;
                if (size < 0) {
                    break;
                }
                if (size > 0) {
                    p = i;
                    inner++;
                } else if (size == 0) {
                    if (inner > in) {
                        in = inner;
                        inpos = i - inner;
                    }
                    inner = 0;
                }
                if (size > dep) {
                    dep = size;
                    pos = i + 1;
                }
            }
            System.out.println(dep + " " + pos + " " + (in + 1) + " " + (inpos + 1));
        }catch (Exception e){}
    }
}