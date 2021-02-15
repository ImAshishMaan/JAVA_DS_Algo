package easy;

import java.util.*;

class Cleaning_up{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t > 0) {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int[] arr = new int[m];
                for (int i = 0; i < m; i++) {
                    arr[i] = sc.nextInt();
                }
                HashMap<Integer, Integer> map = new HashMap<>();
                for (int i = 0; i < arr.length; i++) {
                    map.put(arr[i], 1);
                }
                ArrayList<Integer> chief = new ArrayList<>();
                ArrayList<Integer> assist = new ArrayList<>();
                boolean flag = true;
                for (int i = 1; i <= n; i++) {
                    if (map.containsKey(i)) {
                        continue;
                    }
                    if (flag) {
                        chief.add(i);
                        flag = false;
                    } else {
                        assist.add(i);
                        flag = true;
                    }
                }
                for (int i : chief) {
                    System.out.print(i + " ");
                }
                System.out.println();
                for (int i : assist) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }catch (Exception e){}
    }
}