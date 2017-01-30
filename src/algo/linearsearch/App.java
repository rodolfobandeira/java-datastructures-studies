package algo.linearsearch;

public class App {

    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5,6,7,8,9,10};
        int searchElement = 8;
        
        System.out.println("Found at Position: " +
            linearSearch(myArray, searchElement)
        );
    }
    
    // O(n);
    // Performance grows linearly with array size;
    public static int linearSearch(int [] a, int x) {
        int answer = -1;
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                answer = i;
            }
        }
        
        return answer;
    }

}
