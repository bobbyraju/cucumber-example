package cucumber.examples.java.calculator;

import java.util.Deque;
import java.util.LinkedList;

public class RpnCalculator {
    private final Deque<Integer> stack = new LinkedList<Integer>();

    public void push(String operation) {
        if ("+".equals(operation)) {
            int y = stack.removeLast();
            int x = stack.isEmpty() ? 0 : stack.removeLast();
            stack.push(x + y);
        } else if ("-".equals(operation)){
            int y = stack.removeLast();
            int x = stack.isEmpty() ? 0 : stack.removeLast();
            stack.push(y - x);
        } else {
            throw new IllegalArgumentException("Don't know about operation: " + operation);
        }
    }

    public void push(int value) {
        stack.push(value);
    }

    public int value() {
        return stack.getLast();
    }
}
