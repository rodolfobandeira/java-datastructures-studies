package ds.queue;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Queue fila = new Queue(4);
        
        fila.insert(10);
        fila.insert(12);
        fila.insert(14);
        fila.insert(16);
        fila.insert(17);
        fila.insert(18);
        
        System.out.println(
            Arrays.toString(
                fila.view()
            )
        );   
    }
}
