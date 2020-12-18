import java.util.*;
import java.io.*;

class Main {
    public static String BracketMatcher(String str) {
        // code goes here
        StringBuilder stringBuilder = new StringBuilder(str);
        boolean flag = true;
        Stack<Character> stack = new Stack<>();
        while (stringBuilder.indexOf("(") >= 0) {
            for (char a : stringBuilder.toString().toCharArray()) {
                if (a == '(') {
                    stack.add(a);
                } else if ((!stack.empty()) && (a == ')')) {
                    stack.pop();
                    continue;
                }
                else if (stack.empty() && (a == ')')){
                    return "0";
                }
            }
            return "1";
        }
        return "1";
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(BracketMatcher(s.nextLine()));
    }

}