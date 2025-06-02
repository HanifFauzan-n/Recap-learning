package src.learning;

public class Recursion {
    
    public int recursionFactorial(int n){
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * recursionFactorial(n - 1);
    }

    
}
