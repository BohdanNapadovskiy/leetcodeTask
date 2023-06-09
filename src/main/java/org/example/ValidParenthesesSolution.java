package org.example;

import java.util.*;

public class ValidParenthesesSolution {

    public boolean isValid(String s) {
        boolean result = false;
        Map<String, Integer> openBracketsMap = new HashMap<>();
        Map<String, Integer> closedBracketsMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        openBracketsMap.put("{", 3);
        openBracketsMap.put("[", 2);
        openBracketsMap.put("(", 1);
        closedBracketsMap.put("}", 3);
        closedBracketsMap.put("]", 2);
        closedBracketsMap.put(")", 1);
        char[] symbols = s.toCharArray();
        for (char symbol : symbols) {
            String key = String.valueOf(symbol);
            if (openBracketsMap.containsKey(key)) {
                stack.push(openBracketsMap.get(key));
            } else {
                if (stack.search(closedBracketsMap.get(key)) == 1) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty())
            result = true;
        return result;
    }


}

