package adt;

public class App {

    public static void main(String[] args) {
        Counter myCounter = new Counter("My First Counter");
        
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        
        System.out.println(myCounter.getCurrentValue());
    }
}
