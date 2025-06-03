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

    public int recursionSumDigit(int n) {
        if(n == 0) return 0;
        System.out.println(n);
        return (n % 10) + recursionSumDigit(n / 10);
    }

    public int recursionPower(int a, int n){
        if(n == 0) return 1;
        return a * recursionPower(a, n - 1);
    }
    
}
