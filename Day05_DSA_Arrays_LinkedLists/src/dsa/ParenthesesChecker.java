package dsa;

import java.util.Stack;

public class ParenthesesChecker {

    public static boolean areParenthesesBalanced(String expression) {
        // Create an empty stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through the string
        for (char ch : expression.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If the character is a closing bracket, handle it
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If the stack is empty, it means there's no opening bracket to match
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the top element and check for a match
                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    return false;
                }
                if (ch == '}' && top != '{') {
                    return false;
                }
                if (ch == ']' && top != '[') {
                    return false;
                }
            }
        }

        // After the loop, the stack must be empty for the expression to be balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test cases
        String test1 = "([]{})";
        String test2 = "([)]";
        String test3 = "{[()]}";
        String test4 = "{[}";
        String test5 = "}{";
        String test6 = "()";

        System.out.println(test1 + " is balanced? " + areParenthesesBalanced(test1));
        System.out.println(test2 + " is balanced? " + areParenthesesBalanced(test2));
        System.out.println(test3 + " is balanced? " + areParenthesesBalanced(test3));
        System.out.println(test4 + " is balanced? " + areParenthesesBalanced(test4));
        System.out.println(test5 + " is balanced? " + areParenthesesBalanced(test5));
        System.out.println(test6 + " is balanced? " + areParenthesesBalanced(test6));
    }
}
