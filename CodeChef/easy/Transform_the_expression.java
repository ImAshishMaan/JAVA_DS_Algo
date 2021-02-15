package easy;

import java.util.*;

class Transform_the_expression{
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t > 0) {
                Stack<Character> stack = new Stack<>();
                String str = sc.next();

                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (ch >= 97 && ch <= 122) {
                        System.out.print(ch);
                    } else if (ch == '+' || ch == '*' || ch == '/' || ch == '^' || ch == '-') {
                        stack.push(ch);
                    } else if (ch == ')') {
                        System.out.print(stack.pop());
                    }

                }
                System.out.println();
            }
        }catch (Exception e){}
    }
}