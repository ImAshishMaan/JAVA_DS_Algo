package DSA_learning_series_week2;

import java.util.*;
class compilers_and_parsers{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

            while (T-- > 0) {
                String str = sc.next();
                int size = 0;
                int count = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '<')
                        size++;
                    if (str.charAt(i) == '>')
                        size--;

                    if (size == 0) {
                        count = i + 1;
                    }
                    if (size < 0) {
                        break;
                    }
                }
                System.out.println(count);
            }
        }catch (Exception e){}
    }
}