package src.learning;

public class Recursion {
    
    public int recursionFactorial(int n){
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * recursionFactorial(n - 1);
    }

    public int recursionFibonacci(int n){
        if (n < 1) {
            return n;
        }
        return  recursionFibonacci(n - 1) + recursionFibonacci(n - 2);
    }
    
}
