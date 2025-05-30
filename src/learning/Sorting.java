package src.learning;

import java.util.Arrays;

public class Sorting {

    // Bubble sort
    public void sortingFunction(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                System.out.println(Arrays.toString(arr));
                if (arr[j] > arr[j + 1]) {
                    int tamp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tamp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    // Selecting sort
    public void selectingSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(Arrays.toString(arr));
            int minIndx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndx] > arr[j]) {
                    minIndx = j;
                }
            }
            int tamp = arr[minIndx];
            arr[minIndx] = arr[i];
            arr[i] = tamp;
        }
        System.out.println(Arrays.toString(arr));

    }

    // Insertion sort
    public void insertionSort(int[] arr) {
        // 5 2 9 1 5 6
        for (int i = 1; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr));
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;

                System.out.println(Arrays.toString(arr));
            }
            arr[j + 1] = key;

        }
        System.out.println(Arrays.toString(arr));

    }

}
