package algo.binarysearch;

public class App {

    public static void main(String[] args) {
        int [] a = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
                41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        
        int x = 89;
        int position;
        
        position = binarySearch(a, x);
        
        System.out.println("Position: " + position);
    }
    
    public static int binarySearch(int [] a, int x) {
        int q;
        int p = 0;
        int r = a.length - 1;
        
        while (p <= r) {
            q = (p + r)/2;
            if (a[q] == x) {
                return q;
            } else {
                if (a[q] > x) {
                    r = q - 1;
                } else {
                    p = q + 1;
                }
            }
        }
        
        return -1;
    }
}
