package ds.stack;

public class App {

    public static void main(String[] args) {
        
        /* 
         * FIFO example. Last item to get into the 
         * stack it's going be the first one getting out.
         */
        
        System.out.println(reverseString("Rodolfo"));
    }
    
    
    public static String reverseString(String str) {
        int sizeStr = str.length();
        Stack word = new Stack(sizeStr);
        char character = 0;
        
        for (int x=0; x < sizeStr; x++) {
            character = str.charAt(x);
            word.push(character);
        }
        
        String result = "";
        while(!word.isEmpty()) {
            char ch = word.pop();
            result = result + ch; 
        }
        
        return result;
    }
}
