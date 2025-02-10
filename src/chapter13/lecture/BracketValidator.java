package chapter13.lecture;

import java.util.Stack;

public class BracketValidator {
    public static void main(String[] args) {
        System.out.println(isValid("))))))))")); // false
        System.out.println(isValid("(((())))")); // true
        System.out.println(isValid("()))))")); // false
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else { // ')' 닫는 괄호일때 
                if(stack.isEmpty()) return false;
                char open = stack.pop();
                if(open != '(') {
                    return false;
                }
            }
        }
        
        return stack.isEmpty(); // 만약에 비어있다면 짝이 맞음. 비어있지 않다면 짝이 맞지 않음
    }
}
