import java.util.*;

class Encoded_string{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

            while (T-- > 0) {
                int N = sc.nextInt();
                String S = sc.next();
                int low = 0;
                int hi = 16;
                int j = 0;
                for (int i = 0; i < S.length(); i++) {
                    char c = S.charAt(i);
                    if (c == '0') {
                        hi = (hi / 2) + (low / 2);
                        j++;
                    } else {
                        low = (hi - low) / 2 + low;
                        j++;
                    }
                    if (j == 4) {
                        if (c == '0') {
                            System.out.print((char) (97 + (low)));
                            low = 0;
                            hi = 16;
                            j = 0;
                        }
                        if (c == '1') {
                            System.out.print((char) (97 + (hi - 1)));
                            low = 0;
                            hi = 16;
                            j = 0;
                        }
                    }
                }
                System.out.println();
            }
        }catch (Exception e){}
    }
}