package org.example.arrays;

public class ArrayStack {

    private int size;
    private long[] stack;
    private int top;


    public ArrayStack(int size) {
        this.size = size;
        this.stack = new long[size];
        this.top = -1;
    }

    public void push(long elem) {
        top = top + 1;
        stack[top] = elem;
    }

    public long pop() {
        long result = this.stack[top];
        stack[top] = 0;
        top = top - 1;
        return result;
    }

    public long peek() {
        return this.stack[top];
    }

    private boolean isFull() {
        return top == (size - 1);
    }

}
