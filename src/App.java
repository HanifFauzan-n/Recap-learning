package src;

import src.learning.Sorting;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Sorting sorting = new Sorting();
        int[] data = { 5, 2, 9, 1, 5, 6 };
        sorting.mergeSort(data);
    }
}
