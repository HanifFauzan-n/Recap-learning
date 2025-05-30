package src.learning;

import java.util.Arrays;

public class Sorting {

    // Bubble sort
    public void sortingFunction(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                System.out.println(Arrays.toString(arr));
                if (arr[j] < arr[j + 1]) {
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
                if (arr[j] < arr[minIndx]) {
                    minIndx = j;
                }
            }
            int tamp = arr[minIndx];
            arr[minIndx] = arr[i];
            arr[i] = tamp;
        }
        System.out.println(Arrays.toString(arr));

    }

}
