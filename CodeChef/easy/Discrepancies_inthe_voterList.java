package easy;
import java.util.*;
class Discrepancies_inthe_voterList{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            Map<Integer, Integer> voter = new HashMap<>();

            for (int i = 0; i < n1; i++) {
                int key = sc.nextInt();
                if (voter.containsKey(key))
                    voter.put(key, voter.get(key) + 1);
                else
                    voter.put(key, 1);
            }
            for (int i = 0; i < n2; i++) {
                int key = sc.nextInt();
                if (voter.containsKey(key))
                    voter.put(key, voter.get(key) + 1);
                else
                    voter.put(key, 1);
            }
            for (int i = 0; i < n3; i++) {
                int key = sc.nextInt();
                if (voter.containsKey(key))
                    voter.put(key, voter.get(key) + 1);
                else
                    voter.put(key, 1);
            }
            List<Integer> list = new ArrayList<>();
            for (Map.Entry<Integer, Integer> gg : voter.entrySet()) {
                if (gg.getValue() >= 2)
                    list.add(gg.getKey());
            }
            System.out.println(list.size());
            Collections.sort(list);
            for (int x : list)
                System.out.println(x);
        }
        catch (Exception e){}
        }
}