package homework.h14;

import java.util.ArrayDeque;
import java.util.Deque;

// https://leetcode.com/problems/implement-queue-using-stacks/
public class T2 {
    private final Deque<Integer> inputStack;
    private final Deque<Integer> outputStack;

    public T2() {
        this.inputStack = new ArrayDeque<>();
        this.outputStack = new ArrayDeque<>();
    }

    public void push(int value) {
        inputStack.push(value);
    }

    public int pop() {
        shiftStacksIfNeeded();
        return outputStack.pop();
    }

    public int peek() {
        shiftStacksIfNeeded();
        return outputStack.peek();
    }

    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }

    private void shiftStacksIfNeeded() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
    }
}