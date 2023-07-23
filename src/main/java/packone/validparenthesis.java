package packone;

import java.util.*;

public class validparenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("(]("));
    }

    static public boolean isValid(String s) {
        Map<Character, Character> bracketsBody = new HashMap<>();
        bracketsBody.put('(', ')');
        bracketsBody.put('[', ']');
        bracketsBody.put('{', '}');

        Deque<Character> openBrackets = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (bracketsBody.containsKey(currentChar)) {
                openBrackets.push(currentChar);
            } else if (!openBrackets.isEmpty() && currentChar == bracketsBody.get(openBrackets.peek())) {
                openBrackets.pop();
            } else {
                return false;
            }
        }
        return openBrackets.isEmpty();
    }
}
