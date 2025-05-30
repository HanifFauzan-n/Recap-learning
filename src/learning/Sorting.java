package src.learning;

import java.util.Arrays;

public class Sorting {

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
    

}
