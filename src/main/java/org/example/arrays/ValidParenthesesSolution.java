package org.example.arrays;

import java.util.Stack;

public class ValidParenthesesSolution {

    public boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        char[] symbols = s.toCharArray();
        for (char symbol : symbols) {
            String strValue = String.valueOf(symbol);
            if (strValue.equals("{") || strValue.equals("[") || strValue.equals("(")) {
                stack.push(String.valueOf(symbol));
            } else {
                if (!stack.isEmpty()) {
                    String stValueStr = stack.peek();
                    if (strValue.equals("}") && stValueStr.equals("{")
                            || strValue.equals("]") && stValueStr.equals("[")
                            || strValue.equals(")") && stValueStr.equals("(")) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }

        }
        return stack.isEmpty();
    }
}

