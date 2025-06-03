package src;

// import src.learning.Sorting;

import src.learning.Recursion;


public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Sorting
        // Sorting sorting = new Sorting();
        // int[] data = { 15, 32, 29, 71, 47, 106 };
        // sorting.quickSort(data, 0, data.length - 1);

        // Recursion
        Recursion recursion = new Recursion();
        long hasil = recursion.recursionFibonacci(6);
        System.out.println(hasil);
        String output = recursion.recursionReverse("Fauzan");
        System.out.println(output);
        int n = recursion.recursionPower(2,4);
        System.out.println(n);

    }
}
