package practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class StackImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.next();
        System.out.println(isBalanced(input));
    }

    static String isBalanced(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if(c == '}'){
                if(stack.isEmpty() || stack.pop()!='{')
                    return "NO";
            } else if(c == ')'){
                if(stack.isEmpty() || stack.pop()!='(')
                    return "NO";
            } else if(c == ']'){
                if(stack.isEmpty() || stack.pop()!='[')
                    return "NO";
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }
}
