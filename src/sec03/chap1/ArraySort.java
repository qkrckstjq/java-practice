package sec03.chap1;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 3, 7};
        System.out.println("원래 배열: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("정렬된 배열: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        int i = start;
        while()
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}