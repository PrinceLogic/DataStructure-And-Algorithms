import java.util.ArrayDeque;
import java.util.Deque;

class ValidParentheses {
    public static boolean isValid(String s) {
        // ArrayDeque is faster than Stack for single-threaded operations
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push the corresponding closing bracket
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            }
            // If it's a closing bracket, check if it matches the top of the stack
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        // If the stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }
}