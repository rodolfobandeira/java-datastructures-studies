package ds.stack;

public class Stack {

    private int maxSize;
    private char[] stackArray;
    private int top;
    
    
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }
    
    
    public void push(char c) {
        if (isFull()) {
            System.out.println("The stack is full.");;
        } else {
            top++;
            stackArray[top] = c;
        }
    }
    
    
    public char pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty!");
            return 0;
        } else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }
    
    
    public char pick() {
        return stackArray[top];
    }
    
    
    public boolean isEmpty() {
        return (-1 == top);
    }
    
    
    public boolean isFull() {
        return (maxSize-1 == top);
    }
    
    
    public char[] reverseStack() {
        char[] tmpStack;
        tmpStack = stackArray;
        int y = 0;
        for (int x = stackArray.length; x >= 0; x--) {
            tmpStack[y] = stackArray[x];
            y++;
        }
        stackArray = tmpStack;
        return stackArray;
    }
}
