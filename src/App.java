package src;

import src.learning.Sorting;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Sorting sorting = new Sorting();
        int[] data = { 15, 32, 29, 71, 47, 106 };
        sorting.quickSort(data, 0, data.length - 1);

    }
}
