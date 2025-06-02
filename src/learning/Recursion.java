package src.learning;

public class Recursion {
    
    public int recursionFactorial(int n){
        if(n == 0 || n == 1) {
            return 1;
        }
        return n * recursionFactorial(n - 1);
    }

    public long recursionFibonacci(int n){
        if (n <= 1) {
            return n;
        }
        return  recursionFibonacci(n - 1) + recursionFibonacci(n - 2);
    }

    public String recursionReverse(String data){
        if(data.isEmpty()) return data;

        return recursionReverse(data.substring(1)) + data.charAt(0);
    }
    
}
