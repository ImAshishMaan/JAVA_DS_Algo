package easy;

import java.util.Scanner;

class Chief_and_feedback{
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();

            for (int i = 0; i < T; i++) {
                String s = sc.next();
                boolean b = false;
                for (int j = 0; j < s.length() - 2; j++) {
                    if (s.charAt(j) == '0') {
                        if (s.charAt(j + 1) == '1') {
                            if (s.charAt(j + 2) == '0') {
                                b = true;
                                break;
                            }
                        }
                    }
                    if (s.charAt(j) == '1') {
                        if (s.charAt(j + 1) == '0') {
                            if (s.charAt(j + 2) == '1') {
                                b = true;
                                break;
                            }
                        }
                    }
                }
                if (b)
                    System.out.println("Good");
                else
                    System.out.println("Bad");
            }
        }
        catch (Exception e){}
    }
}