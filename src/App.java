package src;

import src.learning.Sorting;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Sorting sorting = new Sorting();
        int[] data = { 1,2,3,4,5,6,7};
        sorting.sortingFunction(data);
    }
}

