package ds.queue;

public class Queue {
    private int maxSize;
    private long[] queueArray;
    private int front = -1;
    private int rear;
    private int nItems;
    
    
    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new long[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    
    
    public void insert(long value) {
        if (rear == maxSize -1) {
            rear = -1; // If it's full, overrides the first position
        }
        rear++;
        queueArray[rear] = value;
        nItems++;
    }
    
    public long[] view() {
        return queueArray;
    }     
    
    public long remove() {
        long queue = queueArray[front];
        front++;
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return queue;
    }
    
    public boolean isEmpty() {
        return (nItems == 0);
    }
    
    public boolean isFull() {
        return (nItems == maxSize);
    }
}
